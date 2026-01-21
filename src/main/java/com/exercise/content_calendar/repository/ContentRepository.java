package com.exercise.content_calendar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import com.exercise.content_calendar.model.Content;
import com.exercise.content_calendar.model.Status;

public interface ContentRepository extends ListCrudRepository<Content, Integer>{ 
	
	List<Content> findAllByTitleContains(String keyword);
	
	@Query("""SELECT * FROM Content
			WHERE status = :status""")
	List<Content> listByStatus(@Param Status status);
}
