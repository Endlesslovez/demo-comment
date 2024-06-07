package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Builder(builderClassName = "Builder")
public class CommentResponse {

    private  String id;

    private String type;

    private LocalDateTime createDate;

    private CreatedByResponse createdBy;

    private boolean isReplyComment;

    private ItemResponse item;

    private String message;

    private LocalDateTime modifiedAt;
}
