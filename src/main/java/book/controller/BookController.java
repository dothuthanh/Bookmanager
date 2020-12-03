package book.controller;

import book.model.Book;
import book.model.Category;
import book.service.book.BookService;
import book.service.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;
    @Autowired
    CategoryService categoryService;
    @ModelAttribute("categories")
    public Iterable<Category> listCategory(){
       return categoryService.findAll();
    }
    @GetMapping()
    public ModelAndView listBook(){
        Iterable<Book> books = bookService.findAll();
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("books", books);
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView createCategory(){
        Book book = new Book();
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("book" , book);
        return modelAndView;
    }
    @PostMapping("/create")
    public ModelAndView createShowCategory(Book book){
        bookService.save(book);
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("book", new Book());
        return modelAndView;
    }

}
