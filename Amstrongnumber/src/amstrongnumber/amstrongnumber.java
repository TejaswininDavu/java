package amstrongnumber;

import java.util.Scanner;

public class amstrongnumber {

	
	   public static void main(String[] args) {
	     
		// TODO Auto-generated method stub
		
		      int num, originalNum, remainder, result = 0;
		      Scanner scanner = new Scanner(System.in);

		      System.out.print("Enter a three digit integer: ");
		      num = scanner.nextInt();
		      originalNum = num;

		      while(originalNum != 0) {
		         remainder = originalNum % 10;
		         result += Math.pow(remainder, 3);
		         originalNum /= 10;
		      }

		      if(result == num) {
		         System.out.println(num + " is an Armstrong number.");
		      } else {
		         System.out.println(num + " is not an Armstrong number.");
		      }
		   }
		
	}

