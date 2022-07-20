import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class inBuiltStack{
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(33);
//        stack.push(22);
//        stack.push(9);

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(12);
        System.out.println(q.remove());

    }
}
