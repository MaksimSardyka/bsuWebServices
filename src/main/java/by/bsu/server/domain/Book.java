package by.bsu.server.domain;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Book {
    @Id
    long id;
    String name;
    @ManyToMany
    List<Reader> readers;
    @ManyToMany
    Set<Author> authors;
}
