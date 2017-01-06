import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;


public class TestDriver{
	private static long startTime = System.currentTimeMillis();
	public static void main(String[] args) {
		double total = 0;
		int[] check = new int[1000];
		try {
			Scanner scan = new Scanner( new File("input_1000.txt"));
			int x = 0;
			
			while(scan.hasNext()){
				check[x++] = scan.nextInt();
			}
			scan.close();
			
			int a =0 ;
			a = LinearSearch.LinerSearch(check,5);
			System.out.println(a);
	
			int b = 0;
			b = BinarySearch.searchIndexBinary(check, 1);
			System.out.println(b);
			long endTime = System.currentTimeMillis();
			System.out.println("it took " + (endTime - startTime) + "milliseconds");
	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
}
