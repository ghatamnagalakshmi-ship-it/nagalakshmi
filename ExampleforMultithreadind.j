import java.util.Scanner;

public class ExampleforMultithreading {
    public static void main(String[] args) {
        System.out.println("Addition the started:");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
        System.out.println("addition task completed");
        System.out.println("----------------");
        System.out.println("Charater printing started:");
        for (int i = 65; i <= 75; i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Chracter printing is completed:");
            System.out.println("-----------------");
            System.out.println("number is printing is completed:");
        }
    }
}
