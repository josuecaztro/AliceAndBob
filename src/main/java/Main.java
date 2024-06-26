/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        // create a new object of class Main
        Main theMain = new Main();
        // call the compute() method on that new object
        theMain.compute();
    }

    public void compute() {
        // Get input string of name from user
        System.out.println("Hi! Please type your name.");
        Scanner scanner = new Scanner(System.in);
        String userName;
        userName = scanner.nextLine();
        // Create conditional to check name against Alice and Bob
        if (userName.equals("Alice")) {
            System.out.println("Hello Alice!!!");
        } else if (userName.equals("Bob")) {
            System.out.println("Hello Bob!!!");
        }
        // Print greeting to screen if Alice or Bob are true
        if (!userName.equals("Bob") && !userName.equals("Alice")) {
            System.out.println("You are neither Alice or Bob. Get out.");
        }
        // Print "You are neither Alice nor Bob." otherwise

    }
}
