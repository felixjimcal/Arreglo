package test;

import java.util.Scanner;

public class main {
	 public static void main(String[] args) 
	 { 
		Program pro = new Program();
		Scanner scanner=new Scanner(System.in);
		int entry_value = 0, total_numbers = 0, min_value = 20; 
		
		do
		{
			System.out.print("Entry a number bigger than or equal 20: ");
			entry_value = scanner.nextInt();
			
			if(!pro.isBiggerOrEqualThan20(entry_value))
			{
				System.out.println("¡The number must be bigger than or equal 20!");
			}
			else
			{
				pro.InsertValue(entry_value);
				total_numbers++;
			}
			
		}
		while(total_numbers < 5);
			System.out.println("The list is full");
	    }

}
