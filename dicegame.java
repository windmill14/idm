import java.util.*;

public class dicegame{
  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int sum;
    int d1 = random.nextInt(6)+1;
    int d2 = random.nextInt(6)+1;
    sum = d1+d2;

    System.out.println("What is your name?");
    System.out.print(">");
    String name = scanner.next();
    System.out.println("Hello, " + name + "!");
<<<<<<< HEAD

=======
    
>>>>>>> ee9fc75de401089fb1e4e46783130cb5b0bbea1c
    System.out.println("Rolling the dice...");
    System.out.println("Die 1: " + d1);
    System.out.println("Die 2: " + d2);
    System.out.println("Total value: " + sum);

    if (sum>7) System.out.println(name + " won!");
    else System.out.println(name + " lost...");
  }
}
