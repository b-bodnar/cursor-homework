package cursor.hw5.task1;

public class StarterTask1 {

    public static void start() {

        MyList<Integer> integerMyList = new MyList<>();
        fillData(integerMyList);

        System.out.println("Largest element: " + integerMyList.getMax());
        System.out.println("Smallest element: " + integerMyList.getMin());
    }

    private static void fillData(MyList<Integer> integerMyList) {
        for (int i = 0; i < 10; i++) {
            integerMyList.add(i);
        }
    }
}
