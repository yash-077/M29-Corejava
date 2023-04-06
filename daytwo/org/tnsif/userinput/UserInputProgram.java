package org.tnsif.userinput;
import java.util.Scanner; 
public class UserInputProgram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		float salary=s.nextFloat();
		System.out.println("Salary is:"+salary);
		s.close();
		

	}

}
