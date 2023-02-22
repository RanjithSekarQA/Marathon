package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBuy {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver chromeBrowser = new ChromeDriver();
		chromeBrowser.manage().window().maximize();
		chromeBrowser.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		chromeBrowser.get("https://www.amazon.in/");
		chromeBrowser.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags for boys");
		chromeBrowser.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		WebElement results  = chromeBrowser.findElement(By.xpath("(//span[text()='\"bags for boys\"']/preceding-sibling::span)[1]"));
		String totalResults = results.getText();
		System.out.println(totalResults);
		
		chromeBrowser.findElement(By.xpath("//span[text()='Brand']/following::span[text()='Safari']")).click();
		Thread.sleep(2000);
		chromeBrowser.findElement(By.xpath("//span[text()='Brands']/following::span[text()='DZert']")).click();
		Thread.sleep(2000);
		chromeBrowser.findElement(By.xpath("//span[text()='Sort by:']")).click();
		chromeBrowser.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		Thread.sleep(2000);
		WebElement name  = chromeBrowser.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
		String bagName = name.getText();
		System.out.println("Name of the Bas is : " + bagName);
		//WebElement price  = chromeBrowser.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal']/following::span/span)[1]"));
		WebElement price  = chromeBrowser.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		String discountPrice = price.getText();
		System.out.println("Price is :"+ discountPrice);
	}
}
