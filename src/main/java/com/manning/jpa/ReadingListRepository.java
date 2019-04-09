package com.manning.jpa;

import com.manning.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;;
import java.util.List;

public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
