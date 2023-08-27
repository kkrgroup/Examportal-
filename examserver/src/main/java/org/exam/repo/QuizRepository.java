package org.exam.repo;

import java.util.List;

import org.exam.model.exam.Category;
import org.exam.model.exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

	List<Quiz> findBycategory(Category category);

	List<Quiz> findByActive(boolean b);

	List<Quiz> findByCategoryAndActive(Category c, boolean b);

}