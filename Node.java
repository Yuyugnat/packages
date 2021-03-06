/*

here we just implemant the basic structure of a linked list,
meaning the list is build of nodes containing the value of the
element (the data) and a pointer to the next element (to the next node)

*/

public class Node {

    // class variables

    private int data;
    private Node next;

    // constructors

    // build a Node from a single data (int data)
    public Node(int data) {

        this.data = data;
        this.next = null;

    }

    // build a Node from the data (int data) and the pointer to the next Node
    public Node(int data, Node next) {

        this.data = data;
        this.next = next;

    }

    // build a Node from another Node
    public Node(Node anotherNode) {

        this.data = anotherNode.data;
        this.next = anotherNode.next;

    }

    // return the data of this Node (int data)
    public int getData() {

        return this.data;

    }

    // return the next Node of this Node
    public Node getNext() {

        return this.next;

    }

    // set the data of this Node
    public void setData(int newData) {

        this.data = newData;

    }

    // set the next node of this Node
    public void setNext(Node newNext) {

        this.next = newNext;

    }

    // return the Node in the format : " element 1, element2, ... "
    public String toString() {

        if (this.next == null) {

            return this.data + "";

        } else {

            return this.data + " , " + this.next.toString();

        }

    }

    // return the length of this Node
    public int length() {

        return (this.next == null) ? 1 : 1 + this.next.length();

    }

    public Node addElement(int n) {

        this.next = new Node(this);
        this.data = n;
        return this;
    }

    public int sum() {

        if (this.next == null) {

            return this.data;

        } else {

            return this.data + this.next.sum();

        }
    }

    public int lastElement() {

        if (this.next == null) {

            return this.data;

        } else {

            return this.next.lastElement();

        }
    }

    public int maxValue() {

        if (this.next == null) {

            return this.data;

        } else {

            return this.data >= this.next.maxValue() ? this.data : this.next.maxValue();

        }
    }

    public int numberOfN(int n) {

        if (this.next == null) {

            return this.data == n ? 1 : 0;

        } else {

            return this.data == n ? 1 + this.next.numberOfN(n) : this.next.numberOfN(n);

        }
    }

    public void addAtTheEnd(int n) {

        if (this.next == null) {

            this.next = new Node(n);

        } else {

            this.next.addAtTheEnd(n);

        }
    }

    public Node delete(int n) {

        if (this.next == null) {

            if (this.data == n) {

                this.data = this.next.data;
                this.next = this.next.next;

            }

            return this;

        } else {

            if (this.data == n) {

                this.data = this.next.data;
                this.next = this.next.next;

                return this;

            } else {

                return this.next.delete(n);

            }
        }
    }
}
