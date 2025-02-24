package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickitem {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/?tag=hydcaabkg-20&hvadid=677796472754&hvpos=&hvnetw=g&hvrand=4310626240234943376&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9000792&hvtargid=kwd-31636821&ref=pd_sl_2gqjnc4wf3_e&hydadcr=11828_13481604&gad_source=1");
		//driver.wait(10);
        driver.findElement(By.xpath("//a[@href='/Best-Sellers-generic/zgbs/?ref_=nav_cs_bestsellers']")).click();
		driver.close();
	}

}

