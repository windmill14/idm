import java.util.*;

public class dicegame{
  public static void main(String[] args) {
    Random random = new Random();

    int sum;
    int d1 = random.nextInt(6)+1;
    int d2 = random.nextInt(6)+1;
    sum = d1+d2;

    System.out.println("Rolling the dice...");
    System.out.println("Die 1: " + d1);
    System.out.println("Die 2: " + d2);
    System.out.println("Total value: " + sum);
  }
}
