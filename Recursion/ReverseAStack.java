// Reverse a Stack using Recursion

class MyStack {
    int cap;
    int top;
    int arr[];

    MyStack(int c) {
        top = -1;
        cap = c;
        arr = new int[cap];
    }

    void push(int x) {
        if (top == cap - 1) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        }
        int p = arr[top];
        top--;
        return p;
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        }
        return arr[top];
    }

    int size() {
        return top + 1;
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class ReverseAStack {
    
    static void reverse(MyStack s){
        if(s.size()==0){
            return;
        }
        int temp = s.pop();
        reverse(s);
        insert(s, temp);
    }

    static void insert(MyStack s, int x){
        if(s.isEmpty()){
            s.push(x);
            return;
        }
        int temp = s.pop();
        insert(s, x);
        s.push(temp);
    }
    public static void main(String[] args) {
        MyStack s = new MyStack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        reverse(s);
        for (int i = 0; i < 5; i++) {
            System.out.println(s.pop());
        }
    }
}
