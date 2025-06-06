package Lesson_22_CalculateExecutionTime;

public class TestMain {
	
	public static void main(String[] args) throws InterruptedException {
		
		long start = System.nanoTime();
		
		// ***** Program *****
		Thread.sleep(3000);
		// ***** Program *****
		
		long duration = (System.nanoTime() - start)/ 1000000;
		System.out.println(duration + " ms");
		System.out.println(duration / 1000 + " Seconds");
		
		
	}

}
