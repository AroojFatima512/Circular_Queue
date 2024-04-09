
public class CircularQueue_By_LinkedList {
    Node head;
    Node tail;
    int size;
    void add(int data){
        Node node = new Node(data);
        if (head == null && tail == null){
            head = tail = node;
            tail.next = head;
            size++;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    int remove(){
        if (head == null && tail == null){
            return -1;
        }
        int data = head.data;
        if (head.next == null){
            head = tail = null;
            size--;
            return data;
        }
        head = head.next;
        tail.next = head;
        size--;
        return data;
    }

    void display(){
        if (head == null && tail == null){
            System.out.println("List is Empty");
            return;
        }
        Node cur = head;
        while (cur.next != head){
            System.out.print(cur.data +" -> ");
            cur = cur.next;
        }
        System.out.println(cur.data);
    }

}
