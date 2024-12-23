package DiplomCLASS.controller;

import DiplomCLASS.service.BookServise;

import java.util.Scanner;

public class BookController {
    private final BookServise bookServise;

    Scanner scanner = new Scanner(System.in);
    String bookName;

    public BookController(BookServise bookServise) {
        this.bookServise = bookServise;
    }

    public void start() {
        while (true) {
            System.out.println("\n1. Добавить книгу");
            System.out.println("2. Перечислить все книги");

            System.out.println("Выберите опцию");
            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1 -> addBook();
                    case 2 -> listAllBooks();
                    default -> System.out.println("Товар не найден");

                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    private void addBook() {
        System.out.print("Введите название книги:");
        bookName = scanner.nextLine();
        String view = bookServise.addBook(bookName).toString();
        System.out.println(view);
    }

    private void listAllBooks() {
        String viev = bookServise.getAll().toString();
        System.out.println(viev);
    }
}

