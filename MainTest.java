// this is where I do all f  my tests

public class MainTest {

    public static void main(String[] args) {

        intList liste = new intList();

        display(liste);

        liste.addElement(4);

        display(liste);

        liste.addElement(3);
        liste.addElement(6);
        liste.addElement(3);
        liste.addElement(3);
        liste.addAtTheEnd(1);
        liste.addEndIfMissing(2);

        display(liste);

        Node test = new Node(2);
        test.addElement(4);
        test.addElement(3);
        test.addElement(2);

        liste.delete(1);
        // display(test);

        // System.out.println(liste.numberOfN(5));

    }

    public static void display(intList oneListe) {

        System.out.println(oneListe);

    } 
}
