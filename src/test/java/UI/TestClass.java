package UI;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import Common.BaseTest;


public class TestClass extends BaseTest {
	  
	@Test
	public void Test1() {
		driver.get(" https://demo.dealsdray.com/");
		String LoginPageUrl= driver.getCurrentUrl();
		if(LoginPageUrl=="https://demo.dealsdray.com/") {
			System.out.println("TestCase Pass");
		}else {
			System.out.println("TestCase fail");
		}
	}
	@Test
	public void Test2() {
		driver.get(" https://demo.dealsdray.com/");	
		Boolean Present =driver.findElement(By.cssSelector("[type=\"submit\"]")).isDisplayed();
	    Assert.assertEquals(Present,true);
	}
	@Test
	public void Test3()  {
		driver.get(" https://demo.dealsdray.com/");
		driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
	    String Actual = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[1]/h3")).getText();
	    Assert.assertEquals(Actual,"DASHBOARD");
	}
	
	@Test
	public void Test4()  {
		driver.get(" https://demo.dealsdray.com/");
		driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		String CurrentUrl= driver.getCurrentUrl();
		if(CurrentUrl=="https://demo.dealsdray.com/mis/dashboard") {
			System.out.println("TestCase Pass");
		}
		else {
			System.out.println("TestCase fail");
		}
	}
}
