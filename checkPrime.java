import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class checkPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input the year you were born: ");
		int number1 = input.nextInt();
		int number = 1;
		ArrayList <Integer> al = new ArrayList<Integer>();
		
		while ( number1-1 > number) {
			number++;
			boolean isPrime = true;
			for ( int start = 2; start<number; start++) {
				
				if ( number%start == 0) {
					isPrime = false;
					break;
				}
		
			}
			
			if ( isPrime) {
				al.add(number);
			}
			
		}
		
		System.out.println("Prime numbers after number1: " +  al);
		System.out.println("And your lucky prime number is.... " + al.get(new Random().nextInt(al.size())) + "!");
		System.out.println("Keep the your lucky prime number or 10 year of missfortune will be cast upon you!");
		input.close();
	}

}
