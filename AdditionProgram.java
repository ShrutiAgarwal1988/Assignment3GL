
import java.util.Scanner;

public class AdditionProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj1=new Scanner(System.in);
int result=0;
System.out.println("enter first number");
int a=obj1.nextInt();
System.out.println("enter second number");
int b=obj1.nextInt();
Main obj=new Main();
result=obj.performAddition(a,b);
System.out.println(result);


	}

}
