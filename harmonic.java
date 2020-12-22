import java.util.Scanner;
public class harmonic{
	public static void main(String[] arg){
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a number to present its harmonic value");
		double n=read.nextInt();
		double sum=0;
		for(double i=1;i<=n;i++){
			sum += (1/i);
		}
		System.out.println("Harmonic value of "+n+" is "+sum);
	}
}
