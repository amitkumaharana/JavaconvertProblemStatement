public class adddice{
	public static void main(String[] args){
		double dice_throw1=Math.floor(Math.random()*10)%6+1;
		double dice_throw2=Math.floor(Math.random()*10)%6+1;
		System.out.println((int)dice_throw1);
		System.out.println((int)dice_throw2);
		System.out.println((int)dice_throw1+(int)dice_throw2);
	}
}
