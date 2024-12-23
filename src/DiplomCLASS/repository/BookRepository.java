package DiplomCLASS.repository;

import DiplomCLASS.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private final List<Book> books ;
    private int countId;

    public BookRepository() {
        this.books = new ArrayList<>();
        countId = 0;
    }

    public  Book save(Book book){
        book.setId(++countId);

        if( books.add(book)){
           return book ;
        }
        return null;
    }
    public List<Book> findAll(){
        return books;
    }
}
