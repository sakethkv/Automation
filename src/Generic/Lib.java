package Generic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Lib {
	@Test
	public static void RegisterUser()
	{
		Reporter.log("Register USer",true);
	}

	public static void DeleteUser()
	{
		Reporter.log("Delete USer",true);
	}
	

}
