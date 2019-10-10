package by.bsu.server.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import by.bsu.server.domain.Reader;

public interface ReaderRepository extends JpaRepository<Reader, Long> {

}
