package by.bsu.server.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import by.bsu.client.remote.Person;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Reader extends Person {
    @Id
    long id;
    String name;
    String surname;
    @ManyToMany(mappedBy = "readers")
    List<Book> takenBooks;
}
