package tacoapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tacoapp.model.Author;
import tacoapp.repository.AuthorRepository;
import tacoapp.service.AuthorService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/author")
public class AuthorController {

    private final AuthorRepository authorRepository;
    private final AuthorService authorService;

    public AuthorController(AuthorRepository authorRepository, AuthorService authorService) {
        this.authorRepository = authorRepository;
        this.authorService = authorService;
    }

    @GetMapping
    public Object allAuthors() {
        return authorRepository.findAll();
    }

    @GetMapping("{id}")
    public Author author(@PathVariable("id") Long id) {
        return authorRepository.findById(id).get();
    }

    @GetMapping("search/{searchText}")
    public List<Author> author(@PathVariable("searchText") String searchText) {
        return authorService.findAuthorByAnyField(searchText);
    }

    //@GetMapping("filter/{searchText}") // todo

    @GetMapping("new")
    public Author create(Author author) {
        return authorRepository.save(author);
    }
}
