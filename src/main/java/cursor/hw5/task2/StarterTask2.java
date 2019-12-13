package cursor.hw5.task2;

public class StarterTask2 {

    public static void start() {

        MyList<Integer> integerMyList = new MyList<>();
        MyList<String> stringMyList = new MyList<>();

        for (int i = 0; i < 10; i++) {
            integerMyList.add(i);
        }

        stringMyList.add("Hello");
        stringMyList.add("world");
        stringMyList.add("!");

        integerMyList.getList().forEach(System.out::println);
        stringMyList.getList().forEach(System.out::println);
    }
}
