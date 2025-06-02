package com.post_hub.iam_service.model.constance;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ApiErrorMessage {
    POST_NOT_FOUND_BU_ID("Post not found by id: %s"),
    ;

    private final String message;

    public String getMessage(Object ... args){
        return String.format(message, args);
    }
}
