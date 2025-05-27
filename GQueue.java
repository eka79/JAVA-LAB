package lab01_08;
import java.util.Arrays;

public class GQueue<T> {
    T[] queue;
    int size;
    public GQueue() {
        queue = (T[]) new Object[10];
        size = 0;
    }
    public void enqueue(T item) {
        if (size == queue.length) {
            int newCapacity = queue.length * 2;
            queue = Arrays.copyOf(queue, newCapacity);
        }
        queue[size++] = item;

    }
    public T dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return null;
        }
        T del_item = queue[0];
        System.arraycopy(queue, 1,queue,0,size-1);
        queue[--size] = null;
        return del_item;
    }
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println("\n");
    }
    public static void main(String[] args) {
        GQueue<Integer> integerQueue = new GQueue<Integer>();
        integerQueue.enqueue(1);
        integerQueue.enqueue(2);
        integerQueue.enqueue(3);

        integerQueue.display();
        System.out.println("\nDequed:"+integerQueue.dequeue()+"\n");
        integerQueue.display();
        integerQueue.enqueue(4);
        integerQueue.display();

        System.out.println("Queue size" + integerQueue.size);


    }
}
