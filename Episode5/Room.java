package Episode5;
import java.util.Scanner;

public class Room {
	public static void main(String[] args) {
	// Goal: Find the area of a room in square feet

	System.out.println("What is the length of your room in feet?");
	Scanner scnr = new Scanner(System.in);
	int roomLength = scnr.nextInt();

	System.out.println("What is the width of your room in feet?");
	double roomWidth = scnr.nextDouble();

	double roomArea = roomLength * roomWidth;
	System.out.println("The area of your room is " + roomArea + " square feet.");
	scnr.close();
	} 
}