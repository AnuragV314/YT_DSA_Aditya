/**
 * Sort An Stack
 */

class MyStack {
    int arr[]; // array to store the elements
    int cap; // capacity of the Stack
    int top; // the top of the Stack

    MyStack(int c) {
        top = -1;
        cap = c;
        arr = new int[cap];
    }

    void push(int x) {
        if (top == cap - 1) {
            System.out.println("Stack is full.");
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

public class SortStack {

    static void sortStack(MyStack st) {
        if (st.isEmpty())
            return;
        int x = st.pop();
        sortStack(st);
        insert(st, x);
    }

    static void insert(MyStack st, int x) {

        if (st.isEmpty() || x > st.peek()) {
            st.push(x);
            return;
        }
        int temp = st.pop();
        insert(st, x);
        st.push(temp);

    }

    public static void main(String[] args) {
        MyStack s = new MyStack(5);
        s.push(10);
        s.push(90);
        s.push(30);
        s.push(20);
        s.push(50);

        sortStack(s);

        for (int i = 0; i < 5; i++) {
            System.out.println(s.pop());
        }
    }
}