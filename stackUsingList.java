
class listStack {

    private static class node{
        int data;
        node next;

        node(int data){this.data = data;}
    }

    public node top;
    listStack(){
       this.top = null;
    }

    public void push(int data){
        node temp = new node(data);
        if (temp == null) {
            System.out.println("Head overflow");
            return;
        }
        temp.next = top;
        top = temp;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("stack underflow");
            return -1;
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int peek(){
        if (!isEmpty()) return top.data;
        else{
            System.out.println("stack is empty");
            return -1;
        }
    }


}

public class stackUsingList {
    public static void main(String[] args) {
        listStack s = new listStack();
        System.out.println(s.isEmpty());
        s.push(10);
        s.push(33);
        s.push(77);
        s.push(111);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        s.pop();
        System.out.println(s.isEmpty());
    }
}
