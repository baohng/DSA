import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // stackImpl();
        //  queueImpl();
    }

    public static void stackImpl() {
        Stack<String> stack = new Stack<String>();
        //  add an element to stack
        stack.push("sherlock holmes");
        stack.push("poirot");
        stack.push("conan");
        //  pop an element out of stack
        System.out.println("full-stack: " + stack);
        stack.pop();
        System.out.println("full-stack: " + stack);

        //  searching top element in stack
        System.out.println("top element: " + stack.search("conan"));

        //  uses of stack
        //  1. undo/redo features in text editors
        //  2. moving back/forward in browser
        //  3. backtracking algorithm (maze, file directories)
        //  4. calling functions (call stack)
    }

    public static void queueImpl() {
        // Queue is an interface extends collection, not class
        Queue<String> queue = new LinkedList<String>();

        //  enqueue an element to queue
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Hana");

        System.out.println(queue);
        //  dequeue an element
        queue.poll();
        System.out.println(queue);
    }
}