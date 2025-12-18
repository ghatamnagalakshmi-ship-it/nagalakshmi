import java.util.*;

public class Threedjagged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age[][][] = new int[2][2][];
        age[0][0] = new int[2];
        age[0][1] = new int[3];
        age[1][0] = new int[2];
        age[1][1] = new int[3];
        for (int i = 0; i < age.length; i++) {
            for (int j = 0; j < age[i].length; j++) {
                for (int k = 0; k < age[i][j].length; k++) {
                    System.out.println("enter the branch " + i + "in classroom " + j + "age of student " + k);
                    age[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("ages are.....");
        for (int i = 0; i < age.length; i++) {
            System.out.println("Classroom " + i + ": ");
            for (int j = 0; j < age[i].length; j++) {
                System.out.println("branch " + j + ": ");
                for (int k = 0; k < age[i][j].length; k++) {
                    System.out.println(age[i][j][k]);
                }
            }
        }
    }
}
