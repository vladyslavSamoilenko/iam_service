package com.post_hub.iam_service.controller;

import com.post_hub.iam_service.model.constance.ApiErrorMessage;
import com.post_hub.iam_service.model.constance.ApiLogMessage;
import com.post_hub.iam_service.model.enteties.Post;
import com.post_hub.iam_service.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping ("${end.point.posts}")
public class PostController {

    private final PostRepository postRepository;

    @GetMapping("${end.point.id}")
    public ResponseEntity<Post> getPostById(@PathVariable(name="id") Integer postId){
        log.info(ApiLogMessage.POST_INFO_BY_ID.getMessage(postId));
        return postRepository.findById(postId)
                .map(ResponseEntity::ok)
                .orElseGet(() -> {
                    log.info(ApiErrorMessage.POST_NOT_FOUND_BU_ID.getMessage(postId));
                    return ResponseEntity.notFound().build();
                });
    }
}
