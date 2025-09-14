import java.util.Scanner;

class Calculator{
    // Addition
    public double Add(double a, double b){
        return a+b;
    }
    //Substraction
    public double Sub(double a, double b){
        return a-b;
    }
    //MULTIPLICATION
    public double mul(double a, double b) {
        return a*b;
    }
    //division
    public double div(double a, double b){
        if (b==0) {
            System.out.println("Error: division by zero is not valid");
            return Double.NaN; //NaN = Not a number
        }
        return a/b;
    }
    //Modulo
    public double Modulo(double a, double b){
        return a%b;
    }
}
public class BasicCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("!====Basic Calculator=====!");
        System.out.println("Enter first number:");
        double num1= sc.nextDouble();
        System.out.println("choose operation: +  -  * / % ");
        char operation = sc.next().charAt(0);
        System.out.println("Enter another number:");
        double num2 = sc.nextDouble();
        double result =0;
        boolean valid = true;

        switch(operation){
            case '+':
                result = calc.Add(num1, num2);
                break;
            case '-':
                result= calc.Sub(num1, num2);
                break;
            case '*':
                result= calc.mul(num1, num2);
                break;
            case '/':
                result= calc.div(num1, num2);
                break;
            case '%':
                result = calc.Modulo(num1, num2);
                break;
            default:
                System.out.println("Invalid operation , try again!");
                valid =false;
        }
        if(valid) {
            if (result == (long) result) {
                System.out.println("Result :  " + (long) result);
            } else {
                System.out.println("Result: " + result);
            }
        }
        sc.close();
    }
}