package tacoapp.repository;

import org.springframework.data.repository.CrudRepository;
import tacoapp.model.Genre;

public interface GenreRepository extends CrudRepository<Genre, Long> {
}
