import java.util.Scanner;
public class lab10Q1A {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter marks: ");
      int marks = sc.nextInt();

      //assert to check if marks is within the valid range
      assert(marks >=0 && marks <=100) : "Invalid marks";
      System.out.println("marks is validated");
    }
}
      