import java.util.Scanner;

public class Calculator {
    public static void main(String[] a){

        
        boolean repeat = true;

        while(repeat == true){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter First Number");
            double num1 = s.nextDouble();
            System.out.println("Enter Second Number");
            double num2 = s.nextDouble();
            System.out.println("Enter Operator");
            char opp = s.next().charAt(0);

            if (opp == '+' || opp == 'a' || opp == 'A'){
                System.out.println(num1 + num2);
            }
            else if (opp == '-' || opp == 's' || opp == 'S'){
                System.out.println(num1 - num2);
            }
            else if (opp == '*' || opp == 'm' || opp == 'M'){
                System.out.println(num1 * num2);
            }
            else if (opp == '/' || opp == 'd' || opp == 'D'){
                System.out.println(num1 / num2);
            }
            else {
                System.out.println("Unsupported");
            }
            System.out.println("Do you want to continue");
            String cont = s.next();
            if (!cont.equalsIgnoreCase("yes")){
                repeat = false;
        }
    }
}
}   

