package cursor.hw5.task3;

public class StarterTask3 {

    public static void start() {

        Box<Person> personBox = new Box<>(getPersons());

        System.out.println("largest Element: " + personBox.getLargestElement());
        System.out.println("smaller Element: " + personBox.getSmallestElement());
    }

    private static Person[] getPersons() {
        return new Person[]{
                new Person("Тарас", "Шевченко", 36),
                new Person("Леся", "Українка", 30),
                new Person("Іван", "Франко", 40)
        };
    }
}
