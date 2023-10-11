package tacoapp.service;

import org.springframework.stereotype.Service;
import tacoapp.model.Author;
import tacoapp.repository.AuthorRepository;

import java.util.List;

@Service
public class AuthorService {
    final AuthorRepository authorRepository;


    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAllAuthors() {
        return (List<Author>) authorRepository.findAll();
    }

    public Author findById(Long id) {
        return authorRepository.findById(id).get();
    }

    public List<Author> findAuthorByAnyField(String value) {
        List<Author> authors;

        authors = authorRepository.findByFirstNameIsContaining(value);

        if (authors.isEmpty()) {
            authors = authorRepository.findByLastNameIsContaining(value);
        }
        if (authors.isEmpty()) {
            authors = authorRepository.findByMiddleNameIsContaining(value);
        }

        return authors;
    }
}
