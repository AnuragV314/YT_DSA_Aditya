// Delete Middle Element of a Stack

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

public class DeleteMiddleElementOfaStack {

    static MyStack deleteMiddeleElement(MyStack st) {
        if (st.size() == 0)
            return st;

        int k = (st.size() / 2) + 1;
        solve(st, k);
        return st;
    }

    static void solve(MyStack st, int k) {
        if (k == 1) {
            st.pop();
            return;
        }
        int temp = st.pop();
        solve(st, k - 1);
        st.push(temp);
    }

    public static void main(String[] args) {
        MyStack s = new MyStack(5);
        s.push(10);
        s.push(90);
        s.push(30);
        s.push(20);
        s.push(50);

        deleteMiddeleElement(s);
        int t = s.size();
        for (int i = 0; i < t; i++) {
            System.out.println(s.pop());
        }

    }
}
