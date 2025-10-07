package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(70);
        dynamicArray.add(30);
        dynamicArray.add(80);
        dynamicArray.add(20);
        dynamicArray.deleteByIndex(2);
        System.out.println(dynamicArray.getByIndex(1));
        dynamicArray.add(3,15);
        System.out.println(dynamicArray.exists(2));
        System.out.println(dynamicArray.getIndexByValue(30));
        dynamicArray.print();
    }
}
