package DiplomCLASS;

import DiplomCLASS.controller.BookController;
import DiplomCLASS.repository.BookRepository;
import DiplomCLASS.service.BookServise;

public class Main {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepository();
        BookServise bookServise = new BookServise(bookRepository);
        BookController bookController = new BookController(bookServise);

        bookController.start();
    }
}
