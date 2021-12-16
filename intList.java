public class intList {

    private Node head;

    public intList() {
        // here is an empty list constructor

        this.head = null;

    }

    public intList(int value) {

        this.head = new Node(value);

    }

    public intList(int value, Node tail) {

        this.head = new Node(value, tail);

    }

    public int getHead() {

        return this.head.getData();

    }

    public Node getTail() {

        return this.head.getNext();

    }

    public String toString() {

        if (this.head == null)

            return "empty list";

        else

            return "( " + this.head.toString() + " )";

    }

    public int length() {

        return this.head == null ? 0 : this.head.length();

    }

    public void addElement(int element) {

        if (this.head == null) {

            this.head = new Node(element);

        } else {

            Node newHead = new Node(element);
            newHead.setNext(this.head);
            this.head = newHead;

        }

    }

    public int remove() {

        int headValue = this.head.getData();
        this.head = this.head.getNext();
        return headValue;

    }

    public void reverse() {

        intList reversedList = new intList();

        int length = this.length();

        for (int i = 0; i < length; i++) {

            reversedList.addElement(this.remove());

        }

        this.head = reversedList.head;

    }

}