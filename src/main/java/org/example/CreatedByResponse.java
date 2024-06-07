package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Builder
@RequiredArgsConstructor
public class CreatedByResponse {

    private String id;

    private String type;

    private String login;

    private String name;
}
