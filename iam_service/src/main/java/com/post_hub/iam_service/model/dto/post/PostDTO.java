package com.post_hub.iam_service.model.dto.post;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDTO implements Serializable {
    private Integer id;
    private String title;
    private String content;
    private Integer likes;
    private LocalDateTime created;
}
