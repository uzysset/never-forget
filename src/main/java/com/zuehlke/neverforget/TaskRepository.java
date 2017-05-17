package com.zuehlke.neverforget;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.time.LocalDateTime;
import java.util.List;


@RepositoryRestResource(collectionResourceRel = "tasks", path = "tasks")
public interface TaskRepository extends PagingAndSortingRepository<Task, Long> {
    List<Task> findByName(@Param("name") String name);
    List<Task> findByDueDatetime(@Param("dueDatetime") LocalDateTime dueDatetime);
    List<Task> findByCategory_Id(@Param("id") Long id);
}
