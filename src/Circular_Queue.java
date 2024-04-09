
public class Circular_Queue {
    int[] arr;
    int size;
    int rear;
    int front;
    Circular_Queue(){
        this.arr = new int[5];
        this.size = 5;
        this.rear = -1;
        this.front = -1;
    }
    boolean isEmpty(){
        return rear == -1 && front == -1;
    }

    boolean isFull(){
        return (rear+1) % size == front;
    }
    void enqueue(int data){
        if (isFull()){
            System.out.println("Queue is Full");
            return;
        }
        if (front == -1){
         front = 0;
        }
        rear = (rear+1) % size;
        arr[rear] = data;
    }
    int dequeue(){
        if(isEmpty()){
            return -1;
        }
        int result = arr[front];
        if (rear == front){
            rear = front = -1;
        }
        else {
            front = (front+1) % size;
        }
        return result;
    }

    void display(){
        if (isEmpty()){
            System.out.println("List is empty");
            return;
        }
        int i = front;
        while (i != rear) {
            System.out.print(arr[i]+ " ");
            i = (i + 1) % size;
        }
        System.out.print(arr[rear]+ " ");
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        Circular_Queue circularQueue= new Circular_Queue();
        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);
        circularQueue.enqueue(4);
        circularQueue.enqueue(5);
        circularQueue.display();
        System.out.println();
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());

        circularQueue.enqueue(6);
        circularQueue.enqueue(7);
        circularQueue.display();
    }
}
