/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fflow
 */
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private PointList pointlist;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.pointlist = new PointList();
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");

        userInput();

        System.out.println("Point average (all): " + pointlist.average());
        System.out.print("Point average (passing):");
        if (this.pointlist.passingGrade() == -1) {
            System.out.println("-");
        } else {
            System.out.println(pointlist.passingGrade());
        }

        System.out.println("Pass percentage: " + pointlist.passPercentage());
        
        System.out.println("Grade Distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + this.Stars(this.pointlist.pointsWithGrade(i)));
        }         
    }

    private void userInput() {
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            pointlist.addPoint(input);
        }
    }
    
    private String Stars(int number) {
        String stars = "";
        
        for (int i = 0; i < number; i++) {
            stars += "*";
        }
        
        return stars;
    }    

}
