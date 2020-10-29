package com.green.JPA1029.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity //db의 테이블과 클래스 연결
@NoArgsConstructor(access= AccessLevel.PROTECTED) //파라미터없는 생성자. protected접근제어자 생성자이다
@EntityListeners(AuditingEntityListener.class) //JPA에게 해당 Entity는 Auditing(감시) 기능을 사용함
public class Board {
    @Id //pk
    @GeneratedValue
    private Long id;

    @Column(length=10, nullable = false)
    private String author;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;

    @Builder
    public Board(Long id, String author, String title, String content){
        this.id=id;
        this.author=author;
        this.title=title;
        this.content=content;
    }

}
