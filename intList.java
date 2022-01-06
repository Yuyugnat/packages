/* 

Here is the true intList class that you're going to use

as I love recursive fonctions, I did almost all of the  following methods
in recursive
so the structure of the majority of fonction is :
a case for the  empty list, and then a call to the general case which
is a fonction implemented in the Node class

*/

public class intList {

    // class variable

    private Node head;

    // constructors

    // empty list constructor
    public intList() {

        this.head = null;

    }

    // constructor for a list with a single value
    public intList(int value) {

        this.head = new Node(value);

    }

    // constructor with the head value and the node tail
    public intList(int head, Node tail) {

        this.head = new Node(head, tail);

    }

    // copy constructor
    public intList(intList anotherIntList) {

        this.head = new Node(anotherIntList.getHeadNode());

    }

    // return the head (Node)
    public Node getHeadNode() {

        return this.head;

    }

    // return the head value (int)
    public int getHead() {

        return this.head.getData();

    }

    // return the tail Node
    public Node getTail() {

        return this.head.getNext();

    }

    // return the list in the format : " ( element1, element2, ...) "
    public String toString() {

        if (this.head == null)

            return "empty list";

        else

            return "( " + this.head.toString() + " )";

    }

    // return the length of the list
    public int length() {

        return this.head == null ? 0 : this.head.length();

    }

    // add an element at the beginning of the list
    public void addElement(int element) {

        this.head = new Node(element, this.head);

    }

    // remove the first element from the list and return it
    public int removeElement() {

        int firstElement = this.getHead();
        this.head = new Node(this.getTail());

        return firstElement;
        
    }

}