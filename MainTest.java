public class MainTest {

    public static void main(String[] args) {

        intList liste = new intList();

        for (int i = 0; i <= 10; i++) {

            liste.addElement(i);

        }

        System.out.println(liste);

        liste.reverse();

        System.out.println(liste);

    }
}
