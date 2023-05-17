package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;
import java.util.List;

import com.example.demo.answer.Answer;
import com.example.demo.question.Question;
import com.example.demo.question.QuestionRepository;
import com.example.demo.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private QuestionService questionService;
	@Test
	void testJpa() {
		for(int i = 1; i<=300; i++){
			String subject = String.format("테스트 데이터입니다:[%03d]",i);
			String content = "내용무";
			this.questionService.create(subject,content, null);
		}

	}
}