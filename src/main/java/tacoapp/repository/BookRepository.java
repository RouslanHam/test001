package tacoapp.repository;

import org.springframework.data.repository.CrudRepository;
import tacoapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
