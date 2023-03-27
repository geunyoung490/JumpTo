package com.example.demo.question;

import java.util.List;

import com.example.demo.question.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Integer>{
    Question findBySubject(String subject);
    Question findBySubjectAndContent(String subject,String content);
    List<Question> findBySubjectLike(String subject);
}
