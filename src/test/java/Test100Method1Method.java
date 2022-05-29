import org.testng.annotations.Test;

public class Test100Method1Method {

	@Test(groups="method1Only")
	public void groupA()
	{
		
		System.out.println("hj");
	}
	
	@Test
	public void groupB()
	{
		
		System.out.println("B");
	}
	@Test
	public void groupC()
	{
		
		System.out.println("c");
	}
	@Test
	public void groupD()
	{
		
		System.out.println("D");
	}
}
