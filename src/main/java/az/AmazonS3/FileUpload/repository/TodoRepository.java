package az.AmazonS3.FileUpload.repository;

import az.AmazonS3.FileUpload.domain.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
    Todo findByTitle(String title);
}