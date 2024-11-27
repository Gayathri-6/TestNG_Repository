package Class52_Parallel;

import org.testng.annotations.Test;


public class Parallel_class1 {
	@Test
	public void tets1()
	{
		System.out.println("class1--tets1 thread name--"+Thread.currentThread().getName());
	}
	
	@Test
	public void tets2()
	{
		System.out.println("class1--tets2 thread name--"+Thread.currentThread().getName());
	}
	
	@Test
	public void tets3()
	{
		System.out.println("class1--tets3 thread name--"+Thread.currentThread().getName());
	}
	
	@Test
	public void tets4()
	{
		System.out.println("class1--tets4 thread name--"+Thread.currentThread().getName());
	}
	
	

}
