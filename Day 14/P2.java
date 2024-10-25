import java.util.*;
class P2{
	public static void main(String[]args){
	Scanner SC = new Scanner(System.in);
	System.out.println("Enter First No. :");
	int num1 = SC.nextInt();
	System.out.println("Enter Second No. :");
	int num2 = SC.nextInt();
			System.out.println(num1+num2);
	
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
			System.out.println("After swap"+num1+num2);
		
	}


}