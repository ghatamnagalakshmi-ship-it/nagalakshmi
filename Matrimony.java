import java.util.*;

public class Matrimony {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String g1 = "male";
        String g2 = "female";
        System.out.println("enter gender:");
        String gender = sc.next();
        System.out.println("enter age:");
        int age = sc.nextInt();
        if (gender.equals(g1)) {
            if (age >= 21) {
                System.out.println("eligible");
            } else {
                System.out.println("not eligible");
            }

        }
        if (gender.equals(g2)) {
            if (age >= 18) {
                System.out.println("eligible");
            } else {
                System.out.println("not eligible");
            }
        }

    }
}