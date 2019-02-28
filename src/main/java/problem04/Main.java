package problem04;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int min = 1;
		int max = 9;
		int randomNumber1 = new Random().nextInt(max) + min;
		int randomNumber2 = new Random().nextInt(max) + min;
		
		for(int i=1;i<10;i++)
		{
			System.out.print(i+"x"+randomNumber1);
		}
	}
}