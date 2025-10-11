package homework.stack;

public class Stack {

    int[] array = new int[10];
    int tos;

    public Stack() {
        tos = -1;
    }

    public void push(int item) {
        if (tos == 9) {
            System.out.println("polnie");
        } else {
            array[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("faf");
            return 0;
        }else {
            return array[tos--];
        }
    }
    public  int getSize(){
        return tos;
    }

}

