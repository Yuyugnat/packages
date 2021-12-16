public class Node {

    // here we just implemant the basic structure of a linked list,
    // meaning the list is build of nodes containing the value of the
    // element (the data) and a pointer to the next element (to the next node)

    private int data;
    private Node next;

    public Node(int data) {

        this.data = data;
        this.next = null;

    }

    public Node(int data, Node next) {

        this.data = data;
        this.next = next;

    }

    public Node(Node anotherNode) {

        this.data = anotherNode.data;
        this.next = anotherNode.next;

    }

    public int getData() {

        return this.data;

    }

    public Node getNext() {

        return this.next;

    }

    public void setData(int newData) {

        this.data = newData;

    }

    public void setNext(Node newNext) {

        this.next = newNext;

    }

    public String toString() {

        if (this.next == null) {

            return this.data + "";

        } else {

            return this.data + " , " + this.next.toString();

        }

    }

    public int length() {

        return (this.next == null) ? 1 : 1 + this.next.length();

    }
}
