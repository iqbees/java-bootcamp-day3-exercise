import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1.Write a program that checks the role of the user

        System.out.print("What's your role? ");
        String role = in.nextLine();

        if (role.equalsIgnoreCase("admin")) {
            System.out.println("welcome admin");
        } else if (role.equalsIgnoreCase("superuser")) {
            System.out.println("welcome superuser");
        } else if (role.equalsIgnoreCase("user")) {
            System.out.println("welcome user");
        } else {
            System.out.println("Invalid role.");
        }

        // 2.Take three numbers from the user and print the greatest number.

        System.out.print("Enter first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter second number: ");
        int num2 = in.nextInt();

        System.out.print("Enter third number: ");
        int num3 = in.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }

        // 3.Write a Java program that generates an integer between 1 and 7
        //and displays the name of the weekday.

        int number = (int) (Math.random() * 7) + 1;

        System.out.println("number: " + number);

        switch (number) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid number.");
        }

        // 4. Write a program that takes a numeric score as input and prints
        //the corresponding letter grade using the following grading scale:

        System.out.print("Enter your numeric score: ");
        int score = in.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Please enter a score between 0-100");
        } else {
            char grade;
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("Numeric Score: " + score);
            System.out.println("Letter Grade: " + grade);
        }

        // 5. Write a Java program that takes a person's age as input and
        //categorizes them into one of three age categories: "Child,"
        //"Teenager," or "Adult" using an if statement.

        System.out.print("Enter your age: ");
        int age = in.nextInt();

        if (age < 13) {
            System.out.println("You are a Child.");
        } else if (age < 20) {
            System.out.println("You are a Teenager.");
        } else {
            System.out.println("You are an Adult.");
        }
    }
}
