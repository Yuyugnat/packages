package yuyugnat.linkedlist;

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

    public String toString() {

        return "( " + this.toStringAux() + " )";
    }

    public String toStringAux() {

        return this.isEmpty() ? "empty list"
                : (this.tail.isEmpty() ? this.head + ""
                        : this.head + " , " + this.tail.toStringAux());

    }

    public boolean isEmpty() {

        return this.head == null;

    }

    public int length() {

        return this.isEmpty() ? 0 : 1 + this.tail.length();

    }

    public int sum() {

        return this.isEmpty() ? 0 : (int) this.head + this.tail.sum();

    }

    public void addElement(T element) {

        this.tail = new linkedList<>(this.head, this.tail);
        this.head = element;

    }

    public T deleteElement() {

        T result = this.head;

        this.head = this.tail.head;
        this.tail = this.tail.tail;

        return result;

    }

    public T elementAt(int index) {

        try {

            return index == 0 ? this.head : this.tail.elementAt(index - 1);

        } catch (Exception e) {

            System.err.println("there is no element for this index");
            return null;

        }
    }

    public static void main(String[] args) {

        linkedList<Integer> liste = new linkedList<>();

        System.out.println(liste.length());

        System.out.println(liste);

        liste.addElement(2);
        System.out.println(liste.length());

        System.out.println(liste.tail.isEmpty());

        
        liste.addElement(3);
        System.out.println(liste);
        liste.addElement(8);
        System.out.println(liste);
        liste.addElement(34);
        System.out.println(liste);

        int lol = liste.deleteElement();
        System.out.println(liste);

        System.out.println(lol);

        System.out.println(liste.elementAt(5));

    }
    

}
