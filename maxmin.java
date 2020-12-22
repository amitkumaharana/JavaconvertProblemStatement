public class maxmin{
	public static void main(String[] args){
		int max=0,min=0;
		for (int i=0;i<5;i++){
			double value=Math.floor(Math.random()*1000)%900+100;
			System.out.println((int)value);
			if ( i==0 ){
				min=(int)value;
			}
			else{
				if ( max < (int)value ){
					max=(int)value;
				}
				else if ( min > (int)value ){
					min=(int)value;
				}
			}
		}
		System.out.println("Maximum value is : "+max);
		System.out.println("Minimum value is : "+min);
	}
}
