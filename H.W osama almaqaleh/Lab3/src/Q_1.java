import java.util.Arrays;
public class Q_1 {
    public static void main(String[] args) {
        int[] Array1={1,2,3,4,5};
        int[] Array2=Arrays.copyOf(Array1,5);
    System.out.print("Array1={");

    for (int i = 0; i < Array1.length; i++) {
        System.out.print(Array1[i]+",");
    }
    System.out.println("}");
    System.out.print("Array2={");
    for (int i = 0; i < Array1.length; i++) {
        System.out.print(Array2[i]+",");
    }
    System.out.print("}");

    }
}
