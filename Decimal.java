import java.util.*;

public class Decimal{

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the decimal  number");
		n=s.nextInt();
		String bin=Integer.toBinaryString(n);
		System.out.println("binary number is"+bin);
	   
	}

}
