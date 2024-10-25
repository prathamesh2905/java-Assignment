import java.util.*;
class P2{
	public static void main(String[]args){
	Scanner SC = new Scanner(System.in);
	System.out.println("Enter First No. :");
	int num1 = SC.nextInt();
	System.out.println("Enter Second No. :");
	int num2 = SC.nextInt();
		
		if(num1<num2){
		System.out.println("The Minimun Number Amogst "+num1+" & "+num2+" is "+num1);
		
		}else{
		System.out.println("The Maximum Number Amogst "+num1+" & "+num2+" is "+num2);

		}
		
		
	}

}