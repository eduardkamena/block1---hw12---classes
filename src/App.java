/*
Создал отдельный класс и в нем запустил main
и оставил нетронутым основной файл Main.java,
хотя можно было запустить и в нем или удалить/переименовать его
 */
public class App {
    public static void main(String[] args) {
        Author dumasAlexandre = new Author("Александр", "Дюма");
        Author carrollLewis = new Author("Льюис", "Кэрролл");
        Author twainMark = new Author("Марк", "Твен");

        Book monteCristo = new Book("Граф Монте Кристо", dumasAlexandre, 2022);
        Book aliceWonderland = new Book("Алиса в Стране чудес", carrollLewis, 2021);
        Book tomSowyer = new Book("Приключения Тома Сойера", twainMark, 2020);

        System.out.println(monteCristo.getBookTitle());
        System.out.println(monteCristo.getAuthor());
        System.out.println(monteCristo.getPublishingYear());
        monteCristo.setPublishingYear(2023);
        System.out.println(monteCristo.getPublishingYear());
        System.out.println();

        System.out.println(aliceWonderland.getBookTitle());
        System.out.println(aliceWonderland.getAuthor());
        System.out.println(aliceWonderland.getPublishingYear());
        System.out.println();

        System.out.println(tomSowyer.getBookTitle());
        System.out.println(tomSowyer.getAuthor());
        System.out.println(tomSowyer.getPublishingYear());
    }
}