import java.util.Scanner;

public class inputAndArithmeticOperation {
    public static void main(String[] arg){
        int item1;
        int item2;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Num1: "  );
        item1 = s.nextInt();
        System.out.print("num2: ");
        item2 = s.nextInt();
        int result = item1 + item2;
        System.out.print("Result: " + item1 + " + " + item2 + " = " + result);
    }
}
