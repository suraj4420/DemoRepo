import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("how many row u want to enter");
int row=sc.nextInt();
System.out.println("Your pattern is:");

for(int i=1;i<=row;i++) {
	for(int j=1;j<=row;j++) {
		System.out.println("");
	}
	for(int k=1;k<=(2*i)-1;k++) {
		System.out.print("*");
	}
	System.out.println("");
}

	}

}

