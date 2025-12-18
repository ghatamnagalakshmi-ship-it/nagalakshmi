abstract class Vaccine {
    int age;
    String nationality;
    boolean isFirstDoseCompleted = false;

    Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    void firstDose() {
        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
            System.out.println("First dose successfully done");
            System.out.println("You have to pay 250 rs");
            isFirstDoseCompleted = true;
        } else {
            System.out.println("You are not eligible for first dose");
        }
    }

    void secondDose() {
        if (isFirstDoseCompleted) {
            System.out.println("Second dose successfully done");
        } else {
            System.out.println("Please complete first dose first");
        }
    }

    abstract void boosterDose();
}

class VaccinationSuccessful extends Vaccine {

    VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    void boosterDose() {
        if (isFirstDoseCompleted) {
            System.out.println("Booster dose successfully done");
        } else {
            System.out.println("Booster dose not allowed");
        }
    }
}

public class Vaccine1 {
    public static void main(String[] args) {
        int age = 18;
        String nationality = "Indian";

        VaccinationSuccessful v = new VaccinationSuccessful(age, nationality);

        v.firstDose();
        v.secondDose();
        v.boosterDose();
    }
