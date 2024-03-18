public class Book {
    private String bookTitle;
    private Author author;
    private int publishingYear;

    public Book(String bookTitle, Author author, int publishingYear) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publishingYear = publishingYear;
    }
    /*
    В задании было указано:
    "Учтите, что авторы являются обязательными и книги не могут создаваться без авторов."
    Можно было не писать код ниже, тогда была бы ошибка, если в книге отсутствует автор.
     */
    public Book(String bookTitle, int publishingYear) {
        this(bookTitle, null, publishingYear);
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}