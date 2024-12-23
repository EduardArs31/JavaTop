package DiplomCLASS.model;


import java.util.Objects;

public class Book {
    private Integer id; String name;

    public Book(Integer id, String name) {
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null|| getClass() != obj.getClass())return false;
        Book book = (Book) obj;
        return Objects.equals(id, book.id)&&Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name);
    }
    @Override
    public String toString() {
        return "Book{" + "id=" + id + "name='" + name + '\'' + '}';
    }
}
