package Utilities;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import Common.BaseTest;

public class TestUtile extends BaseTest{
	
	public void getScreenShot() {
		File scr= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\Project1\\img.png");
		try {
			FileUtils.copyFile(scr, destination);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
