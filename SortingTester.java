import java.util.Arrays;
import java.util.Random;

public class SortingTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {-123,-109,-50,0,25,34,9888888},//sorted array
				arr2 = {78,50,1,-8,-10000},//upsidown array
				arr3 = {-123,-109,34,9888888,34,34,-50,-123,9888888,-123,-123,0,34,25,-123,9888888},//not sorted
				arr4 = {2,2,2,2,2,2,0,0,0,0,9,9,9,9}//not sorted

		;
		int[] arr5= new int[100];
		double score = 100;

		int[] arrch=arr1.clone();


		Arrays.sort(arrch);
		try{
			Ex2.sort(arr1);
			if(!Arrays.equals(arr1, arrch)){
				score-=10;
				System.out.println("failed at test 1" );
			}
		}catch (Exception e) {
			// TODO: handle exception
			score-=10;
			System.out.println("failed at test 1 with exception" );
		}
		try{
			arrch=arr2.clone();
			Arrays.sort(arrch);
			Ex2.sort(arr2);
			if(!Arrays.equals(arr2, arrch)){
				score-=10;
				System.out.println("failed at test 2" );
			}
		}catch (Exception e) {
			// TODO: handle exception
			score-=10;
			System.out.println("failed at test 2 with exception" );
		}
		try{
			arrch=arr3.clone();
			Arrays.sort(arrch);
			Ex2.sort(arr3);
			if(!Arrays.equals(arr3, arrch)){
				score-=10;
				System.out.println("failed at test 3" );
			}

		}catch (Exception e) {
			// TODO: handle exception
			score-=10;
			System.out.println("failed at test 3 with exception" );
		}
		try{
			arrch=arr4.clone();
			Arrays.sort(arrch);
			Ex2.sort(arr4);
			if(!Arrays.equals(arr4, arrch)){
				score-=10;
				System.out.println("failed at test 4" );
			}
		}catch (Exception e) {
			// TODO: handle exception
			score-=10;
			System.out.println("failed at test 4 with exception" );
		}
		double t5=60;
		int count=0, countEX=0;
		for (int j = 0; j < 1000; j++) {


			Random rng = new Random();

			for(int i=0;i<arr5.length;i++){
				arr5[i]=rng.nextInt(100)-50; 
			}

			arrch=arr5.clone();
			Arrays.sort(arrch);
			try{
				Ex2.sort(arr5);
				if(!Arrays.equals(arr5, arrch)){
					t5*=99.75/100;
					count++;
				}
			}catch (Exception e) {
				// TODO: handle exception
				t5*=99.75/100;
				countEX++;
			}
		}
		if(count>0||countEX>0)System.out.println("failed at "+count+" and hav exeptions in: "+countEX+" random testes from 1000" );
		score-=60-t5;
		System.out.println("\n\nfinal grade: "+score);

	}


}
