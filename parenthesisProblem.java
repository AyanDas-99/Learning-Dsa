import java.util.Scanner;

class list{

    static class node{
        char data;
        node next;
    }
    private node top;
    list(){
        top = null;
    }
    //push
    public void push(char data){
       if (isEmpty()){
           top = new node();
           top.data = data;
           top.next = null;
       }
       else{
           node temp = new node();
           temp.data = data;
           temp.next = top;
           top = temp;
       }

    }
    //isEmpty
    public boolean isEmpty(){
      return top == null;
    }
    //pop
    public char pop(){
        char n = top.data;
        top = top.next;
        return n;
    }
    //peek
    public char peek(){
       return top.data;
    }
    //Display
    public void Display(){
        node temp = top;
        System.out.print("The elements of "+this+" are: ");
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

}


public class parenthesisProblem {
   static boolean parenthesisCheck(String s) {
       list l = new list();
       char temp;
       for (int i = 0; i < s.length(); i++) {
           char c = s.charAt(i);
           if (c == '(' || c == '[' || c == '{'){
              l.push(c);
           } else if (c == ')') {
              if (l.isEmpty()) {
                  return false;
              }
              temp = l.pop();
              if (temp != '(') return false;
           } else if (c == ']') {
               if (l.isEmpty()) {
                   return false;
               }
               temp = l.pop();
               if (temp != '[') return false;
           } else if (c == '}') {
               if (l.isEmpty()) {
                   return false;
               }
               temp = l.pop();
               if (temp != '{') return false;
           }
       }
       return l.isEmpty();
   }



    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(parenthesisCheck(s));
   }
}
