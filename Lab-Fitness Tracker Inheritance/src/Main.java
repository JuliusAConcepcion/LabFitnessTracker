import java.util.Scanner;
class Workout {
String type;
int duration;

void showWo(){
    System.out.println("Workout type: " + type
                       + "\nDuration(min): " + duration);
}

}

class RunningWo extends Workout{
double dis;

void showDetails(){
    showWo();
    System.out.println("Distance(km): " + dis);
    Double cb = dis * 60;
    System.out.println("Calories burned: " + cb);
}

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RunningWo wo1 = new RunningWo();

        System.out.print("Enter Workout name: ");
        String woName = sc.nextLine();
        System.out.print("\nEnter Workout type: ");
        wo1.type = sc.nextLine();
        System.out.print("\nEnter Duration(min): ");
        wo1.duration = sc.nextInt();
        System.out.print("\nEnter Distance(km): ");
        wo1.dis = sc.nextDouble();

        //Print Summary
        System.out.println("\n--- Workout Summary ---");
        System.out.println(woName);
        wo1.showDetails();


    }
}