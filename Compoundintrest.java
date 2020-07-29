import java.util.*;

public class CompoundIntrest {

	public static void main(String[] args) {
		double p,t,r,com;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the price");
		p=sc.nextDouble();
		System.out.println("enter the time");
		t=sc.nextDouble();
		System.out.println("enter the rate");
		r=sc.nextDouble();
		com=p*Math.pow(1+r/100,t)-p;				
		System.out.println("compound intrest="+com);
	}

}
