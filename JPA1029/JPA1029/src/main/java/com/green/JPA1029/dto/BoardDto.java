package com.green.JPA1029.dto;

import com.green.JPA1029.domain.entity.Board;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor //파라미터없는 생성자
public class BoardDto { //Data Transfer Object(Value Object)
    private Long id;
    private String author;
    private String title;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    //Service에서 호출될 메서드
    public Board toEntity(){
        Board build = Board.builder()  //빌드패턴
                .id(id)
                .author(author)
                .title(title)
                .content(content)
                .build();
        return build;
    }

    @Builder
    public BoardDto(Long id, String author, String title, String content, LocalDateTime createdDate, LocalDateTime modifiedDate){
        this.id=id;
        this.author=author;
        this.title=title;
        this.content=content;
        this.createdDate=createdDate;
        this.modifiedDate=modifiedDate;
    }


}
