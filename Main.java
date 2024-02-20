import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);



        //================ Lab1 Task 1 =================

//        int num1, num2;
//try {
//
//    System.out.println("Enter first number");
//    num1 = input.nextInt();
//    System.out.println("Enter second number");
//    num2 = input.nextInt();
//
//    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//    System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
//    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
//    System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
//}catch (InputMismatchException e){
//    System.out.println("Invalid number !");
//}



        //================ Lab1 Task 2 =================

//        try {
//
//            System.out.println("Enter number: ");
//            int num = input.nextInt();
//
//            for (int i = 1; i <= 10; i++){
//                System.out.println(num + " x " + i + " = " + (num * i));
//            }
//        }catch (InputMismatchException e){
//            System.out.println("Invalid input !");
//        }



        //================ Lab1 Task 3 =================

//        try {
//            System.out.print("Enter the radius of the circle: ");
//            double radius = input.nextDouble();
//            System.out.println("perimeter is = " + (2 * Math.PI * radius));
//            System.out.println("Area is = " + (Math.PI * (radius * radius)));
//        }catch (InputMismatchException e){
//            System.out.println("Invalid input!");
//        }


        //================ Lab1 Task 4 =================

//        int num = 0, sum = 0, count;
//
//        try {
//        System.out.println("Enter the counts of numbers");
//        count = input.nextInt();
//        for(int i = 1 ; count >= i ; i++ ){
//
//            System.out.println("Enter an integer: ");
//            num = input.nextInt();
//            sum += num;
//
//        }
//
//
//            checkIfGreaterThanZero(count);
//            System.out.println((float) sum / count);
//        }catch (InputMismatchException e){
//            System.out.println("Invalid input");
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("Thank you for using the program!");
//        }



        //================ Lab1 Task 5 =================

//        int num1, num2, num3;
//
//        try {
//
//            System.out.println("Enter the first number: ");
//            num1= input.nextInt();
//            System.out.println("Enter the second number: ");
//            num2 = input.nextInt();
//            System.out.println("Enter the third number: ");
//            num3 = input.nextInt();
//
//            if((num1 + num2) == num3){
//                System.out.println("the result is: true ");
//            }else {
//                System.out.println("the result is: false ");
//
//            }
//        }catch (InputMismatchException e){
//            System.out.println("Invalid input! ");
//
//        }

        //================ Lab1 Task 6 =================

//        try{
//
//            System.out.println("enter the sentence to reverse: ");
//            String sentence = input.nextLine();
//            String reversed = "";
//            for (int i = sentence.length() - 1; i >= 0; i--) {
//                reversed += sentence.charAt(i);
//            }
//            System.out.println("the sentence reversed: " + reversed);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("\nThank you for using the program!");
//        }


        //================ Lab1 Task 7 =================

//        try {
//
//            System.out.println("Enter the number: ");
//            int num = input.nextInt();
//
//            if(num % 2 ==0){
//                System.out.println("the number " + num + " is Even");
//            }else{
//                System.out.println("the number " + num + " is Odd");
//
//            }
//        }catch (InputMismatchException e){
//            System.out.println("Invalid input!, please enter a number");
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("\nThank you for using the program!");
//        }


        //================ Lab1 Task 8 =================
//
//        try {
//
//            System.out.println("enter the temperature in Centigrade: ");
//            int c = input.nextInt();
//            System.out.println(c * 1.8 + 32);
//        }catch (InputMismatchException e){
//            System.out.println("Invalid input, please enter a number");
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("\nThank you for using the program, bye!");
//        }


        //================ Lab1 Task 9 =================
//
//        try {
//
//            System.out.println("Enter String: ");
//            String s = input.nextLine();
//            System.out.println("Enter number: ");
//            int i = input.nextInt();
//            System.out.println(s.charAt(i));
//
//        }catch (InputMismatchException e){
//            System.out.println("Invalid input, please enter a number");
//        }catch (IndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }


        //================ Lab1 Task 10 =================
//        double width, height;
//try {
//
//    System.out.println("Enter the width of rectangle: ");
//    width = input.nextDouble();
//    System.out.println("Enter the height of rectangle: ");
//    height = input.nextDouble();
//    System.out.println("Area is " + width + " * " + height + " = " + (width * height));
//    System.out.println("perimeter is " + " 2 (" + width + " + " + height + ") = " + 2 * (width + height));
//}catch (InputMismatchException e){
//    System.out.println("Invalid number, please enter a number");
//}catch (Exception e){
//    System.out.println(e.getMessage());
//}






        //================ Lab1 Task 11 =================

//        int num1, num2;
//try {
//
//    System.out.println("Enter the first number: ");
//    num1 = input.nextInt();
//    System.out.println("Enter the second number: ");
//    num2 = input.nextInt();
//
//
//        System.out.println("===== output =====");
//        if(num1 == num2){
//            System.out.println(num1 + " == " + num2);
//        }
//        if(num1 != num2){
//            System.out.println(num1 + " != " + num2);
//        }
//        if(num1 < num2){
//            System.out.println(num1 + " < " + num2);
//        }
//        if(num1 <= num2){
//            System.out.println(num1 + " <= " + num2);
//        }
//        if(num1 > num2){
//            System.out.println(num1 + " > " + num2);
//        }
//        if(num1 >= num2){
//            System.out.println(num1 + " >= " + num2);
//        }
//}catch (InputMismatchException e){
//    System.out.println("please enter valid Integer number");
//}catch (Exception e){
//    System.out.println(e.getMessage());
//}finally {
//    System.out.println("\n thank you! for using the program");
//}


        //================ Lab1 Task 12 =================
//try {
//    System.out.println("Enter the seconds: ");
//    int seconds = input.nextInt();
//    System.out.println((seconds / 3600) + ":" + ((seconds % 3600) / 60) + ":" + (seconds % 60));
//}catch (InputMismatchException e){
//    System.out.println("Invalid input, please enter valid Integer number");
//}catch (Exception e){
//    System.out.println(e.getMessage());
//}


        //================ Lab1 Task 13 =================

//try {
//
//    int num1, num2, num3, num4;
//    System.out.println("Enter the first number: ");
//    num1 = input.nextInt();
//    System.out.println("Enter the second number: ");
//    num2 = input.nextInt();
//    System.out.println("Enter the third number: ");
//    num3 = input.nextInt();
//    System.out.println("Enter the fourth number: ");
//    num4 = input.nextInt();
//
//    if(num1 == num2){
//        if(num1 == num3){
//            if(num1 == num4){
//                System.out.println("Numbers are equal! ");
//
//            }else{
//                System.out.println("Numbers are not equal! ");
//            }
//        }
//        else{
//            System.out.println("Numbers are not equal! ");
//        }
//    }
//    else {
//        System.out.println("Numbers are not equal! ");
//    }
//} catch (InputMismatchException e){
//    System.out.println("Invalid input, please enter valid Integer number");
//}catch (Exception e){
//    System.out.println(e.getMessage());
//}


        //================ Lab1 Task 14 =================

//        try {
//
//            System.out.println("Enter the number: ");
//            int num = input.nextInt();
//            if(num > 0){
//                System.out.println("the number is positive");
//            }else if(num < 0){
//                System.out.println("the number is negative");
//            }else{
//                System.out.println("the number is Zero ");
//            }
//        }catch (InputMismatchException e){
//            System.out.println("Invalid number please enter Integer number");
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("\nThank you! for using the program, bye!");
//        }

        //================ Lab1 Task 15 =================


//        try {
//
//            int num = 0, pos = 0, neg = 0, zero = 0;
//
//            do {
//                System.out.println("Enter the number and if you finish you can enter -1 to exit: ");
//                num = input.nextInt();
//                if(num == -1){
//                    break;
//                }
//                else if(num > 0){
//                    pos++;
//                } else if (num < 0) {
//                    neg++;
//                }else{
//                    zero++;
//                }
//
//            }while (true);
//
//            System.out.println("Positives: " + pos);
//            System.out.println("Zero: " + zero);
//            System.out.println("Negatives: " + neg);
//        }catch (InputMismatchException e){
//            System.out.println("Invalid input, please enter valid integer number");
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }


        //================ Lab1 Task 16 =================

//            try {
//
//                System.out.print("Enter an integer: ");
//                int num = input.nextInt();
//                int reversedNumber = 0;
//
//                while (num != 0) {
//                    int digit = num % 10;
//                    reversedNumber = reversedNumber * 10 + digit;
//                    num /= 10;
//                }
//                System.out.println("Reversed number: " + reversedNumber);
//            }catch (InputMismatchException e){
//                System.out.println("Invalid input please enter Integer value");
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }



        //================ Lab1 Task 17 =================

//        try {
//
//            int max = 0, min = 0;
//            String num;
//
//            System.out.println("Enter the number: ");
//            num = input.nextLine();
//            max = Integer.parseInt(num);
//            min = Integer.parseInt(num);
//
//            do {
//                System.out.println("Enter the number or enter exit to finish: ");
//                num = input.nextLine();
//
//                if((num.equalsIgnoreCase("exit"))){
//                    break;
//                }
//                else if (Integer.parseInt(num) > max){
//                    max = Integer.parseInt(num);
//                }else if(Integer.parseInt(num) < min){
//                    min = Integer.parseInt(num);
//                }
//            }while (true);
//
//            System.out.println("The largest number: " + max);
//            System.out.println("The smallest number: " + min);
//
//        }catch (NumberFormatException e){
//            System.out.println("Invalid input please enter an integer number");
//            System.out.println(e.getMessage());
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }


        //================ Lab1 Task 18 =================

//            try {
//
//                System.out.print("Enter a string: ");
//                String inputString = input.nextLine();
//                checkNumberOfA(inputString);
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }





    }


    public static void checkIfGreaterThanZero(int count) throws Exception{
        if(count <= 0 ){
            throw new Exception("You should enter number greater than zero");
        }
    }


    public static void checkNumberOfA(String inputString) throws Exception{
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 'a' || inputString.charAt(i) == 'A') {
                count++;
            }
        }
        throw new Exception("Number of a's: " + count);
    }

}