package tacoapp.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Genre {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private final Long id;

    @NotNull
    private final String name;

    @NotNull
    private final String description;

    private Date createdAt = new Date();
    private Date updatedAt = new Date();
}
