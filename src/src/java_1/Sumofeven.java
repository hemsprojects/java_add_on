package java_1;

public class Sumofeven {

	public static void main(String[] args) {
		int[] number=new int[5];
		number[0]=1;
		number[1]=2;
		number[2]=3;
		number[3]=4;
		number[4]=5;
		int sum=0;
		System.out.println(number[3]);
		for(int i=0;i<=number.length-1;i++)
		{
			sum=sum+i;
			System.out.println(number[i]);
		}
		System.out.println(+sum);
	}

}
