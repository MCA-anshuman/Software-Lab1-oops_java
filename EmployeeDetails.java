// Write a java program to display the employee details using Scanner class.

import java.util.Scanner;
public class EmployeeDetails {
    public static void main(String[] args)
    {
        //Create a Scanner Object to take input from the user
        Scanner scanner =new Scanner(System.in);
        //Display a prompt and take user input for employee details
        System.out.println("Enter Employee Id:");
        int employeeId=scanner.nextInt(); //Reading integer input for Employee ID
        //Consume the new line character left by nextInt()
        scanner.nextLine();
        System.out.println("Enter Employee Name:");
        String employeeName =scanner.nextLine(); // Reading string input for Name
        System.out.println("Enter Employee Position:");
        String employeePosition=scanner.nextLine(); // Reading string input for Position
        System.out.println("Enter Employee Salary:");
        double employeeSalary =scanner.nextDouble(); //Reading double input for Salary
        //display the Employee details
        System.out.println("\nEmployee Details:");
        System.out.println("\nEmployee ID:"+employeeId);
        System.out.println("\nEmployee Name:"+employeeName);
        System.out.println("\nEmployee Position:"+employeePosition);
        System.out.println("\nEmployee Salary:"+employeeSalary);
        //Close the Scanner
        scanner.close();
    }
}     