package pl.net.nowak.task.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Author: Maciek
 */
public interface TaskRepository extends MongoRepository<Task,String> {
}
