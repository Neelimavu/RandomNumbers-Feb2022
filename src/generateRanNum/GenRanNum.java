

package generateRanNum;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GenRanNum {
	
	
	public static boolean check(int[] arr, int toCheckValue)
    {
        
        boolean test = false;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == toCheckValue) {
                test = true;
                break;
            }
        }
        return test;
    } 
	
	public static void main(String[] args) {

		Random  ran = new Random();
		int[] numbers = new int[500];
		int randomNum;
		int x=0;
		while (x<500) 
		{
			randomNum=ran.nextInt(1000);
			if(!check(numbers, randomNum) && randomNum!=0) 
			{
				numbers[x]=randomNum;
				x++;
			}
		}
		Arrays.sort(numbers);
//		System.out.println(numbers.length);
		for(int i=0; i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Which smallest number you want in 500 values: ");
		x = sc.nextInt();
		System.out.println(numbers[--x]);
	}
}

