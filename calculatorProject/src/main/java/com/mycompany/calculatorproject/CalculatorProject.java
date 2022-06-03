package com.mycompany.calculatorproject;

/**
 * @author 
 *
 *   /\_/\  _     ___
 *  |>'v'<||"| -/\, ,`>
 *     -=Edelstein=-
 * 
 */

// imports
import java.util.Scanner;

public class CalculatorProject {

    public static void main(String[] args) {
        Scanner stringInput = new Scanner(System.in);
        String choice;
        
        while(true){
            System.out.println("What would you like to use?:");
            System.out.println("General calculator[0]");
            System.out.println("Area of rectangle[1]");
            System.out.println("Area of circle[2]");
            System.out.println("Volume of pyramid[3]");
            System.out.println("Speed calculator[4]");
            System.out.println("exit[10]");
            choice = stringInput.nextLine();

            if(choice.equals("0")){
                choiceOutput("general");
                generalCalculator();
            } else if(choice.equals("1")){
                choiceOutput("rectangle");
                rectangleCalculator();
            } else if(choice.equals("2")){
                choiceOutput("circle");
                circleCalculator();
            } else if(choice.equals("3")){
                choiceOutput("pyramid");
                pyramidCalculator();
            } else if(choice.equals("4")){
                choiceOutput("speed");
                speedCalculator();
            } else if(choice.equals("10")){
                System.out.println("\nYou chose General calculator!\n");
                System.exit(0);
            } else{
                System.out.println("Error: invalid selection.");
            }
        }

    }
    private static void choiceOutput(String calculatorType) {
        System.out.println("\nYou chose " + calculatorType + " calculator!\n");
    }

    private static void generalCalculator() {
        // imported
        Scanner doubleInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        
        // variables
        double valueA;
        double valueB;
        double result = 0;
        String operator;
        
        // main
        System.out.println("Current equation: result = A _ B");
        System.out.println("Enter first value: ");
        valueA = doubleInput.nextDouble();
        
        System.out.println("\nCurrent equation: result = " + valueA + " _ B");
        System.out.println("Enter second value: ");
        valueB = doubleInput.nextDouble();
        
        System.out.println("\nCurrent equation: result = " + valueA + " _ " + valueB);
        System.out.println("Enter operator(+,-,/,*): ");
        operator = stringInput.nextLine();
        
        System.out.println("\nCalculating " + valueA + " " + operator + " " + valueB + "...\n");
        
        if(operator.equals("+")){
            result = valueA + valueB;
        } else if(operator.equals("-")){
            result = valueA - valueB;
        } else if(operator.equals("/")){
            result = valueA / valueB;
        } else if(operator.equals("*")){
            result = valueA * valueB;
        } else{
            System.out.println("invalid operator.");
            System.exit(0);
        }
        System.out.println(result + " is the result.\n");
    
    }
    
    private static void rectangleCalculator() {
        // imported
        Scanner doubleInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        
        // variables
        double sideA;
        double sideB;
        String mesurement;
        double result;
        
        // main
        System.out.println("Enter unit of mesure: ");
        mesurement = stringInput.nextLine();
        
        System.out.println("Enter first side: ");
        sideA = doubleInput.nextDouble();
        
        System.out.println("Enter second side: ");
        sideB = doubleInput.nextDouble();
        
        System.out.println("\nCalculating...\n");
        result = sideA * sideB;

        System.out.println("therefore " + result + mesurement + "² is the area of the rectangle.\n");

    }
    
        private static void circleCalculator() {
        // imported
        Scanner doubleInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        
        // variables
        double diameter;
        double radius = 0;
        String calculation;
        String mesurement;
        double result;
        
        // main
        System.out.println("Enter unit of mesure: ");
        mesurement = stringInput.nextLine();
        
        System.out.println("Radius(0) or diameter(1)");
        calculation = stringInput.nextLine();

        if(calculation.equals("0")){
            System.out.println("Enter radius: ");
            radius = doubleInput.nextDouble();
        }
        else if(calculation.equals("1")){
            System.out.println("Enter diameter: ");
            diameter = doubleInput.nextDouble();

            System.out.println("\nCalculating...\n");
            radius = diameter/2;
        } else{
            System.out.println("Error: Invalid input.");
        }
        result = (radius * radius) * 3.14;
        
        System.out.println("therefore " + result + mesurement + "² is the area of the circle.\n");

    }
        
        private static void pyramidCalculator() {
        // imported
        Scanner doubleInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        
        // variables
        double length;
        double width;
        double height;
        String mesurement;
        double result;
        
        // main
        System.out.println("Enter unit of mesure: ");
        mesurement = stringInput.nextLine();
        
        System.out.println("Enter length: ");
        length = doubleInput.nextDouble();
        
        System.out.println("Enter width: ");
        width = doubleInput.nextDouble();
        
        System.out.println("Enter height: ");
        height = doubleInput.nextDouble();
        
        System.out.println("\nCalculating...\n");
        result = (length * width * height) / 3;

        System.out.println("therefore " + result + mesurement + "³ is the volume of the triangle.\n");

    }
        
        private static void speedCalculator() {
        // imported
        Scanner doubleInput = new Scanner(System.in);
        
        // variables
        double distanceValue;
        double timeValue;
        double result;
        
        // main
        System.out.println("Enter time in seconds: ");
        timeValue = doubleInput.nextDouble();
        
        System.out.println("Enter distance in cm: ");
        distanceValue = doubleInput.nextDouble();
        
        System.out.println("\nCalculating...\n");
        result = distanceValue / timeValue;

        System.out.println("therefore " + result + "cm/s is the speed of the object.\n");

    }

}

