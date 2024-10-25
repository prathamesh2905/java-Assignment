import java.util.*;
class P3{
	public static void main(String[]args){
	Scanner SC = new Scanner(System.in);
	System.out.println("Enter First No. :");
	int num1 = SC.nextInt();
	System.out.println("Enter Second No. :");
	int num2 = SC.nextInt();
	for(int i=num1;i<num2;i++){
		if(i%2==0){
		System.out.println("Cube of "+i+" : "+i*i*i+"Square of "+i+" : "+i*i);

			}
		
		}
	}

}