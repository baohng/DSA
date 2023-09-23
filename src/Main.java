import java.util.*;

public class Main {
    public static void main(String[] args) {
        // stackImpl();
        //  queueImpl();
        //  priorityQueueImpl();
        //  linkedListImpl();
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

    public static void priorityQueueImpl() {
        //  FIFO but with the order of highest priority to lower priority
        Queue<Double> priorQueue = new PriorityQueue<>();
        priorQueue.offer(5.2);
        priorQueue.offer(4.7);
        priorQueue.offer(6.8);
        priorQueue.offer(2.0);

        while (!priorQueue.isEmpty()) {
            System.out.print(priorQueue);
            System.out.println("---Take: " + priorQueue.poll());
        }
    }

    public static void linkedListImpl() {
        LinkedList<String> linkedList = new LinkedList<>();

        //  treat like stack
        //linkedList.push("A");
        //linkedList.push("B");
        //linkedList.push("C");
        //linkedList.push("D");
        //linkedList.push("F");

        //  treat like queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        //  add an element
        linkedList.add(4, "E");
        //  remove an element
        String removed = linkedList.remove(4);
        //  add element to the head
        linkedList.addFirst("0");
        //  add element to the tail
        linkedList.addLast("G");
        //  remove head element
        linkedList.removeFirst();
        //  remove tail element
        linkedList.removeLast();

        System.out.println(linkedList);
    }
}
