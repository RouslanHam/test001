package tacoapp.repository;

import org.springframework.data.repository.CrudRepository;
import tacoapp.model.Author;

import java.util.List;

public interface AuthorRepository  extends CrudRepository<Author, Long> {

    List<Author> findByFirstNameIsContaining(String value);

    List<Author> findByLastNameIsContaining(String value);

    List<Author> findByMiddleNameIsContaining(String value);
}
