package by.bsu.server.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import by.bsu.server.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
