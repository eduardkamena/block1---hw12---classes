import java.util.Objects;

// Создание класса Author с двумя константными свойствами
public class Author {
    private final String name; // Имя автора
    private final String lastName; // Фамилия автора

    // Метод для создания объекта в main (автора)
    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    // По прошлому заданию было необходимо сделать геттеры ниже
    // В данной задаче нет обращений к ним, поэтому скрыл из поля видимости
    /*
    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }
     */

    // Предопределенные методы toString, equals, hashCode:
    @Override
    public String toString() {
        return this.name + " " + this.lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }

}
