// this is where I do all f  my tests

public class MainTest {

    public static void main(String[] args) {

        intList liste = new intList();

        display(liste);

        liste.addElement(4);

        display(liste);

        liste.addElement(5);

        display(liste);

        int a = liste.removeElement();

        System.out.println(a);

        display(liste);

    }

    public static void display(intList oneListe) {

        System.out.println(oneListe);

    } 
}
