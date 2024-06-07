package java12;
import java.util.Scanner;

public class isPalindrom {

	
	 private static Scanner myObj;


	public static boolean isPalindrom(String str) {
		 int i=0 , j=str.length()-1;
		 
		 while(i<j) {
			 if (str.charAt(i)!=str.charAt(j))
				 return false;
			 i++;
			 j--;
		 }
		 return true;
	 }
	
	
	public static void main(String[] args) {
		 
		
	   myObj = new Scanner(System.in);
	   String Str= myObj.next();
		if (isPalindrom(Str)){
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}

	}

}
