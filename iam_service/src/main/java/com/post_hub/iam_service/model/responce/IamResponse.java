package com.post_hub.iam_service.model.responce;


import lombok.*;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IamResponse <P extends Serializable> implements Serializable {
    private String message;
    private P payload;
    private boolean success;

    public static <P extends Serializable> IamResponse<P> createSuccessfullResponce(P payload){
        return new IamResponse<>(StringUtils.EMPTY, payload,true);
    }
}
