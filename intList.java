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

    // constructor from a single Node
    public intList(Node aNode) {

        this.head = aNode;

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

        return new Node(this.head.getNext());

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

    public int sum() {

        if (this.head == null) {
            
            return 0;

        } else {

            return this.head.sum();

        }
    }

    public int lastElement() {

        return this.head.lastElement();

    }

    public boolean overK(int k) {

        return k <= this.length();

    }

    public boolean lengthIsEven() {

        return this.length() % 2 == 0;

    }

    public int maxValue() {

        return this.head.maxValue();

    }

    public int numberOfN(int n) {

        if (this.head == null) {

            return 0;

        } else {

            return this.head.numberOfN(n);

        }
    }

    public void addAtTheEnd(int n) {

        if (this.head == null) {

            this.head = new Node(n);

        } else {

            this.head.addAtTheEnd(n);

        }
    }

    public void addEndIfMissing(int n) {

        if (this.numberOfN(n) == 0) this.addAtTheEnd(n);

    }

    /* public intList extractOddNumbers() {

        intList newList = new intList();


    }

    private static intList extractOddNumbersAux(intList result, intList current) {

        if (current.head == null) {

            return result;

        } else {

            if (current.getHead() % 2 == 1) result.addElement(current.getHead());

            return extractOddNumbersAux(result, new intList(current.getTail()));

        }
    } */
    
    public void delete(int n) {

        this.head = this.head.delete(n);
        
    }

}