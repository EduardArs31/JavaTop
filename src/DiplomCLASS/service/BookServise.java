package DiplomCLASS.service;

import DiplomCLASS.model.Book;
import DiplomCLASS.repository.BookRepository;

import java.util.List;

public class BookServise {

    private final BookRepository bookRepository;

    public BookServise(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addBook(String name){
        Book newBook = new Book(null,name);
        return bookRepository.save(newBook);
    }
    public List<Book> getAll(){
        return bookRepository.findAll();
    }

}
