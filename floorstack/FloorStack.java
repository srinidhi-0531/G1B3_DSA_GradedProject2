/*
 * package gp2.floorstack;
 * 
 * import java.util.Scanner;
 * 
 * public class FloorStackImplementation {
 * 
 * public static void main(String[] args) { Scanner input = new
 * Scanner(System.in);
 * System.out.print("Enter the total number of floors in the building: "); int n
 * = input.nextInt();
 * 
 * // Create a stack to keep track of floors that can be assembled
 * FloorStackConstruction floorStack = new FloorStackConstruction(n);
 * 
 * // Read floor sizes for each day and update the stack for (int i = 1; i <= n;
 * i++) { System.out.print("Enter the floor size given on day " + i + ": "); int
 * floorSize = input.nextInt(); floorStack.update(floorSize); }
 * 
 * // Output the floor sizes that can be assembled for each day in descending
 * order for (int i = 1; i <= n; i++) { System.out.println("Day " + i + ": ");
 * floorStack.print(i); }
 * 
 * input.close(); }
 * 
 * }
 */
package gp2.floorstack;

import java.util.Stack;

public class FloorStack {
    public void constructFloorStack(int n, int[] floorSizes) {
        Stack<Integer> stack = new Stack<>();
        int currFloorSize = n;
        for (int i = 0; i < n; i++) {
            System.out.println("Day " + (i + 1) + ": ");
            while (!stack.empty() && stack.peek() == currFloorSize) {
                System.out.print(stack.pop() + " ");
                currFloorSize--;
            }
            if (floorSizes[i] == currFloorSize) {
                System.out.print(floorSizes[i] + " ");
                currFloorSize--;
            } else {
                System.out.println();
                stack.push(floorSizes[i]);
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
