
class stack{
    private final int MAX_SIZE;
    private int topIndex;
    private int[] arr;
    stack(int size){
        MAX_SIZE = size;
        arr = new int[size];
        topIndex = -1;
    }

    public boolean push(int n){
        if (topIndex < MAX_SIZE-1){
            arr[++topIndex] = n;
            return true;
        }
        else {
            System.out.println("Stack Overflow !!");
            return false;
        }
    }

    public int pop(){
        if (topIndex == -1){
            System.out.println("Stack Underflow !!");
            return -1;
        }
        else {
            return arr[topIndex--];
        }
    }

    public boolean isFull(){
        return topIndex == MAX_SIZE-1;
    }

    public boolean isEmpty(){
        return topIndex == -1;
    }

    public void Display(){
        for (int i = 0; i <= topIndex; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}


public class stacks {
    public static void main(String[] args) {
        stack s = new stack(100);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(11);
        s.Display();
    }
}
