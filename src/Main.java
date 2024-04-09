public class Main {
    public static void main(String[] args) {
        CircularQueue_By_LinkedList c = new CircularQueue_By_LinkedList();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        c.display();
        System.out.println("Size of Circular Queue: " +c.size);
        System.out.println("Removed Element: " +c.remove());
        System.out.println("Removed Element: " +c.remove());
        c.display();
        System.out.println("Size of Circular Queue: " +c.size);
        c.add(6);
        c.add(7);
        c.display();
        System.out.println("Size of Circular Queue: " +c.size);
    }
}