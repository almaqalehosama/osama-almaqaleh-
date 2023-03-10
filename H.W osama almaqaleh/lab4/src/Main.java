// Driver class to test the Complex class
public class Main {

    public static void main(String[] args) {
        EqualsMethod c1 = new EqualsMethod(10, 15);
        EqualsMethod c2 = new EqualsMethod(10, 15);
        if (c1.equals(c2)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }
    }
}
