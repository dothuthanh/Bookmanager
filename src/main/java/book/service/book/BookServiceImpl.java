package book.service.book;

import book.model.Book;
import book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImpl implements BookService{
    @Autowired
    BookRepository bookRepository;
    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);

    }

    @Override
    public void remove(Long id) {
        bookRepository.delete(id);

    }

    @Override
    public void findById(Long id) {
        bookRepository.findOne(id);

    }
}
