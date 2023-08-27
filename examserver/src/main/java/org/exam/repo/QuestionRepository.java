package org.exam.repo;

import java.util.Set;

import org.exam.model.exam.Question;
import org.exam.model.exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {

	  Set<Question> findByQuiz(Quiz quiz);
	}
