package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver chromeBrowser = new ChromeDriver();
		chromeBrowser.get("https://in.bookmyshow.com/");
		chromeBrowser.manage().window().maximize();
		chromeBrowser.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		chromeBrowser.findElement(By.xpath("//span[text()='Hyderabad']")).click();

		String currentUrl = chromeBrowser.getCurrentUrl();
		System.out.println("Current URL is : " + currentUrl);
		chromeBrowser.findElement(By.xpath("//span[text ()='Search for Movies, Events, Plays, Sports and Activities']"))
				.click();
		Thread.sleep(2000);
		chromeBrowser.findElement(By.xpath("//div[@class='sc-jTzLTM sc-jHXLhC jqQqJt']/span[text()='English']"))
				.click();

		chromeBrowser.findElement(By.xpath("//a[contains(text(),'Ant-Man')][1]")).click();

		WebElement theatre = chromeBrowser.findElement(By.xpath("(//div[@class='__title']/a)[1]"));
		String theatreName = theatre.getText();
		System.out.println("First Theatre Name is : " + theatreName);
//		Thread.sleep(2000);
//		chromeBrowser.findElement(By.xpath("//button[text()='OK']")).click();
		chromeBrowser.findElement(By.xpath("//div[text()='INFO'][1]")).click();
		WebElement parking = chromeBrowser.findElement(By.xpath("//div[contains(text(),'Parking')]"));
		String getParking = parking.getText();
		System.out.println("parking facility available : " + getParking);
		chromeBrowser.findElement(By.xpath("//div[@class='cross-container']")).click();

		chromeBrowser.findElement(By.xpath("(//a[@class='showtime-pill'])[1]")).click();

		chromeBrowser.findElement(By.xpath("//div[text()='Accept']")).click();

		chromeBrowser.findElement(By.xpath("//ul[@id='popQty']/li[@id='pop_1']")).click();
		chromeBrowser.findElement(By.xpath("//div[@id='proceed-Qty']")).click();

		
		chromeBrowser.findElement(By.xpath("//div[@id='B_4_022']")).click();
		chromeBrowser.findElement(By.xpath("//a[@id='btmcntbook']")).click();
		
		Thread.sleep(2000);
		chromeBrowser.findElement(By.xpath("//button[text()='OK']")).click();
		
		WebElement total = chromeBrowser.findElement(By.xpath("//span[@class='__sub-total']"));
		String subTotal = total.getText();

		System.out.println("Sub Total :" + subTotal);

	}

}
