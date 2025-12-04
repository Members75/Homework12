public class Main {
    public static void main(String[] args) {
        diff();
        Author ostrovskiy = new Author(" Александр ", "Островский ");
        Book storm = new Book(" Гроза ", ostrovskiy, 1859);
        System.out.println(" Автор - " + ostrovskiy.getFirstName() + ostrovskiy.getLastName());
        System.out.println(" Произведение - " + storm.getTitleBook());
        System.out.println(" Дата написания - " + storm.getYearPublication());
        storm.setYearPublication(1860);
        System.out.println(" Дата публикации - " + storm.getYearPublication());
        diff();
        Author turgenev = new Author(" Иван ", "Тургенев ");
        Book sonsAndFather = new Book(" Отцы и дети ", turgenev, 1861);
        System.out.println(" Автор - " + turgenev.getFirstName() + turgenev.getLastName());
        System.out.println(" Произведение - " + sonsAndFather.getTitleBook());
        System.out.println(" Дата написания - " + sonsAndFather.getYearPublication());
        sonsAndFather.setYearPublication(1862);
        System.out.println(" Дата публикации - " + sonsAndFather.getYearPublication());
        diff();
    }

    static void diff() {
        System.out.println("============================");
    }
}
