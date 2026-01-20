package com.exercise.content_calendar.repository;

import org.springframework.data.repository.ListCrudRepository;

import com.exercise.content_calendar.model.Content;

public interface ContentRepository extends ListCrudRepository<Content, Integer>{ 
	
}
