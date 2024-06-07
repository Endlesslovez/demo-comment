package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Builder
@RequiredArgsConstructor
public class ItemResponse {

    private String id;

    private String type;
}
