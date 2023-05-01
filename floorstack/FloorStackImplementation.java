package gp2.floorstack;

import java.util.Scanner;

public class FloorStackImplementation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of floors in the building: ");
        int n = input.nextInt();

        // Create a stack to keep track of floors that can be assembled
        FloorStackConstruction floorStack = new FloorStackConstruction(n);

        // Read floor sizes for each day and update the stack
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the floor size given on day " + i + ": ");
            int floorSize = input.nextInt();
            floorStack.update(floorSize);
        }

        // Output the floor sizes that can be assembled for each day in descending order
        for (int i = 1; i <= n; i++) {
            System.out.println("Day " + i + ": ");
            floorStack.print(i);
        }
        
input.close();
	}

}
