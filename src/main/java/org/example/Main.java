package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("comment")
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

    @GetMapping
    public ResponseEntity<CommentResponse> getComment() {
        return ResponseEntity.ok(CommentResponse
                .builder()
                .id("11446498").type("comment").createDate(LocalDateTime.now())
                .createdBy(CreatedByResponse
                        .builder().id("11446498").type("user").login("ceo@example.com").name("Aaron Levie").build())
                .isReplyComment(true)
                .item(ItemResponse
                        .builder().id("11446498").type("file").build())
                .message("@Aaron Levie these tigers are cool!")
                .modifiedAt(LocalDateTime.now()).build());
    }
}