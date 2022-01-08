public class linkedList<T> {

    private T head;
    private linkedList<T> tail;

    public linkedList() {

        this.head = null;
        this.tail = null;

    }

    public linkedList(T headElement) {

        this.head = headElement;
        this.tail = null;

    }

    public linkedList(T headElement, linkedList<T> tailList) {

        this.head = headElement;
        this.tail = tailList;

    }

    public int length() {

        return this.head == null ? 0 : (this.tail == null ? 1 : 1 + this.tail.length());

    }

    public int sum() {

        return this.head == null ? 0 : (int) this.head + this.tail.sum();

    }

    public void addElement(T element) {

        this.tail = new linkedList<>(this.head, this.tail);
        this.head = element;

    }

    public static void main(String[] args) {

        linkedList<Integer> liste = new linkedList<>();

        System.out.println(liste.length());

        liste.addElement(4);

        System.out.println(liste.length());

        liste.addElement(3);

        System.out.println(liste.length());

        liste.addElement(7);

        System.out.println(liste.length());
        System.out.println(liste.sum());
    }

}
