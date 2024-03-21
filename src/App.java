// Создание класса App и в нем основной метод main
public class App {
    public static void main(String[] args) {
        // Инициализация объектов (авторы книг)
        Author dumasAlexandre = new Author("Александр", "Дюма");
        Author carrollLewis = new Author("Льюис", "Кэрролл");
        Author twainMark = new Author("Марк", "Твен");

        // Инициализация объекта с однотипными свойствами (имя и фамилия автора) для проверки метода equals
        Author alexandreDumas = new Author("Александр", "Дюма");

        // Инициализация объектов (книги)
        Book monteCristo = new Book("Граф Монте Кристо", dumasAlexandre, 2022);
        Book aliceWonderland = new Book("Алиса в Стране чудес", carrollLewis, 2021);
        Book tomSowyer = new Book("Приключения Тома Сойера", twainMark, 2020);

        // Печать свойств объекта - книги monteCristo
        System.out.println(monteCristo.getBookTitle());
        System.out.println(monteCristo.getAuthor());
        System.out.println(monteCristo.getPublishingYear());
        monteCristo.setPublishingYear(2023);
        System.out.println(monteCristo.getPublishingYear() + " (переиздание)");
        System.out.println();

        // Печать свойств объекта - книги aliceWonderland
        System.out.println(aliceWonderland.getBookTitle());
        System.out.println(aliceWonderland.getAuthor());
        System.out.println(aliceWonderland.getPublishingYear());
        System.out.println();

        // Печать свойств объекта - книги tomSowyer
        System.out.println(tomSowyer.getBookTitle());
        System.out.println(tomSowyer.getAuthor());
        System.out.println(tomSowyer.getPublishingYear());
        System.out.println();

        // Вывод результата работы метода equals
        System.out.println(dumasAlexandre.equals(alexandreDumas));

        // Вывод результата работы метода toString из класса Author
        System.out.println(alexandreDumas);

        // Вывод результата работы метода toString из класса Book
        System.out.println(tomSowyer);
    }

}
