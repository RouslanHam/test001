package tacoapp.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private final Long id;

    @NotNull
    private final String name;

    @NotNull
    private final String ISBN;

    private final Long genre_id;

    private Date createdAt = new Date();;
    private Date updatedAt = new Date();;

    public Book() {
        id = Long.valueOf(0);
        name = "";
        ISBN = "";
        genre_id = Long.valueOf(1);
    }
}
