package com.post_hub.iam_service.service;

import com.post_hub.iam_service.model.dto.post.PostDTO;
import com.post_hub.iam_service.model.responce.IamResponse;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.NotFound;

public interface PostService {
    IamResponse<PostDTO> getById(@NotNull Integer id);
}
