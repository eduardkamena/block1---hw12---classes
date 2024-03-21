import java.util.Objects;

// Создание класса Book с тремя свойствами
public class Book {
    private final String bookTitle; // Название книги
    private final Author author;  // Автор из класса Author
    private int publishingYear; // Год публикации

    // Метод для создания объекта в main (книги)
    public Book(String bookTitle, Author author, int publishingYear) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    // Геттер для названия книги:
    public String getBookTitle() {
        System.out.print("Книга: ");
        return this.bookTitle;
    }

    // Геттер для автора книги:
    public Author getAuthor() {
        System.out.print("Автор: ");
        return this.author;
    }

    // Геттер для года издания книги:
    public int getPublishingYear() {
        System.out.print("Год издания: ");
        return this.publishingYear;
    }

    // Сеттер для года издания книги:
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    // Предопределенные методы toString, equals, hashCode:
    @Override
    public String toString() {
        return "Книга: " + bookTitle + ", автор: " + author + ", год издания: " + publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, author, publishingYear);
    }

}
