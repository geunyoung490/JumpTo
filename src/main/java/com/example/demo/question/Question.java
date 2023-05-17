package com.example.demo.question;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.answer.Answer;
import com.example.demo.user.SiteUser;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList; //Answer entity 객체로 구성된 answerList 를 속성으로 추가 question.getAnswerList()

    @ManyToOne
    private SiteUser author;

}
