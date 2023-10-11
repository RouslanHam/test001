package tacoapp.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private final Long id;

    @NotNull
    @Column(name = "first_name")
    private final String firstName;
    @NotNull
    @Column(name = "last_name")
    private final String lastName;

    @Column(name = "middle_name")
    private final String middleName;

    private LocalDate dob;

    @ManyToMany(targetEntity=Book.class)
    @JoinTable(name = "author_books",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private List<Book> books = new ArrayList<>();

    private Date createdAt = new Date();
    private Date updatedAt = new Date();

    public Author() {
        id = Long.valueOf(0);
        firstName = "";
        lastName = "";
        middleName = "";
    }
}
