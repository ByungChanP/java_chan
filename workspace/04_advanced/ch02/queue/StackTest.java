package ch02.queue;

import java.util.Stack;

public class StackTest {
    void main(){
        Stack queue = new Stack();

        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);

        System.out.println(queue.size());

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

        System.out.println(queue.size());
    }
}
