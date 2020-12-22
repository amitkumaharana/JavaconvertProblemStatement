import java.util.Scanner;
public class powerof2{
	public static void main(String[] args){
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a value upto which you want the power of 2");
		int num=read.nextInt();
		for(int i=0;i<=num;i++){
			double result=Math.pow(2,i);
			System.out.println("2^"+i+" = "+(int)result);
		}
	}
}
