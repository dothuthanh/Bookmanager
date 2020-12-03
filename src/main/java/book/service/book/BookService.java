package book.service.book;

import book.model.Book;

public interface BookService {
    Iterable<Book> findAll();
    void save(Book book);
    void remove(Long id);
    void findById(Long id);
}
