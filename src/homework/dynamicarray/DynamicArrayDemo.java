package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();

        for (int i = 0; i < 10; i++) {
            dynamicArray.add(i * 2);
        }

        System.out.print("array = ");
        dynamicArray.print();

        System.out.println("since 5 elements " + dynamicArray.getByIndex(1));
        System.out.println("since 10 elements " + dynamicArray.getByIndex(10));

    }
}
