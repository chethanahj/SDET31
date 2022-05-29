import org.openqa.selenium.WebDriverException;

public class Try {

	
	
	@Test
	Pu
	{
		
		
		
		try {
			System.out.println(10/0);
			
		}
		
		catch (NullPointerException e) {
			
			System.out.println("n");
		}
		
catch (WebDriverException e) {
			
			System.out.println("w");
		}
catch (Exception e) {
			
			System.out.println("e");
		}
		finally {
			System.out.println("k");
		}
		
	}
}
