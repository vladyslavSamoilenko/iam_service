package com.post_hub.iam_service.controller;

import com.post_hub.iam_service.model.constance.ApiErrorMessage;
import com.post_hub.iam_service.model.constance.ApiLogMessage;
import com.post_hub.iam_service.model.dto.post.PostDTO;
import com.post_hub.iam_service.model.enteties.Post;
import com.post_hub.iam_service.model.responce.IamResponse;
import com.post_hub.iam_service.repositories.PostRepository;
import com.post_hub.iam_service.service.PostService;
import com.post_hub.iam_service.utils.ApiUtils;
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

    private final PostService postService;

    @GetMapping("${end.point.id}")
    public ResponseEntity<IamResponse<PostDTO>> getPostById(@PathVariable(name="id") Integer postId){
        log.trace(ApiLogMessage.NAME_OF_CURRENT_METHOD.getMessage(), ApiUtils.getMethodName());

        IamResponse<PostDTO> response = postService.getById(postId);
        return ResponseEntity.ok(response);
    }
}
