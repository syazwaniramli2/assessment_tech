package teckassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Y410P\\Desktop\\selenium-server-4.7.2\\chromedriver\\chromedriver.exe");
		WebDriver D= new ChromeDriver();
		D.manage().window().maximize();
		D.get("https://petstore3.swagger.io/#/user");
		
		//create new user
		Thread.sleep(3000);
		D.findElement(By.xpath("//*[@id=\"operations-user-createUser\"]/div/button")).click();
		Thread.sleep(1000);
		D.findElement(By.xpath("//button[contains(text(),'Try it out')]")).click();
		Thread.sleep(1000);
		D.findElement(By.xpath("//*[@id=\"operations-user-createUser\"]/div[2]/div/div[2]/div[3]/div[2]/div/div[2]/div/textarea")).clear();
		//Thread.sleep(100);
		D.findElement(By.xpath("//*[@id=\"operations-user-createUser\"]/div[2]/div/div[2]/div[3]/div[2]/div/div[2]/div/textarea")).sendKeys("{\r\n"
				+ "  \"id\": 10,\r\n"
				+ "  \"username\": \"adrian\",\r\n"
				+ "  \"firstName\": \"adrian\",\r\n"
				+ "  \"lastName\": \"khor\",\r\n"
				+ "  \"email\": \"adrian@email.com\",\r\n"
				+ "  \"password\": \"12345\",\r\n"
				+ "  \"phone\": \"12345\",\r\n"
				+ "  \"userStatus\": 1\r\n"
				+ "}");
		Thread.sleep(1000);
		D.findElement(By.xpath("//button[contains(text(),'Execute')]")).click();
		
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)D;
		jse.executeScript("window.scrollBy(0,600);");
		
		//read the created user
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,1200);");
		Thread.sleep(1000);
		D.findElement(By.xpath("//*[@id=\"operations-user-getUserByName\"]/div/button")).click();
		Thread.sleep(1000);
		D.findElement(By.xpath("//button[contains(text(),'Try it out')]")).click();
		D.findElement(By.xpath("//*[@id=\"operations-user-getUserByName\"]/div[2]/div/div[1]/div[2]/div/table/tbody/tr/td[2]/input")).sendKeys("adrian");
		Thread.sleep(1000);
		D.findElement(By.xpath("//*[@id=\"operations-user-getUserByName\"]/div[2]/div/div[2]/button")).click();
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,300);");
		
		//update user's username
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,400);");
		Thread.sleep(1000);
		D.findElement(By.xpath("//*[@id=\"operations-user-updateUser\"]/div/button")).click();
		Thread.sleep(1000);
		D.findElement(By.xpath("//button[contains(text(),'Try it out')]")).click();
		D.findElement(By.xpath("//*[@id=\"operations-user-updateUser\"]/div[2]/div/div[2]/div[2]/div/table/tbody/tr/td[2]/input")).sendKeys("adrian");
		Thread.sleep(1000);
		D.findElement(By.xpath("//*[@id=\"operations-user-updateUser\"]/div[2]/div/div[2]/div[3]/div[2]/div/div[2]/div/textarea")).clear();
		D.findElement(By.xpath("//*[@id=\"operations-user-updateUser\"]/div[2]/div/div[2]/div[3]/div[2]/div/div[2]/div/textarea")).sendKeys("{\r\n"
				+ "  \"id\": 10,\r\n"
				+ "  \"username\": \"tester\",\r\n"
				+ "  \"firstName\": \"adrian\",\r\n"
				+ "  \"lastName\": \"khor\",\r\n"
				+ "  \"email\": \"adrian@email.com\",\r\n"
				+ "  \"password\": \"12345\",\r\n"
				+ "  \"phone\": \"12345\",\r\n"
				+ "  \"userStatus\": 1\r\n"
				+ "}");
		Thread.sleep(1000);
		D.findElement(By.xpath("//*[@id=\"operations-user-updateUser\"]/div[2]/div/div[3]/button")).click();
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,600);");
		
		//read updated user
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,-1200);");
		Thread.sleep(1000);
		D.findElement(By.xpath("//*[@id=\"operations-user-getUserByName\"]/div[2]/div/div[1]/div[2]/div/table/tbody/tr/td[2]/input")).clear();
		Thread.sleep(1000);
		D.findElement(By.xpath("//*[@id=\"operations-user-getUserByName\"]/div[2]/div/div[1]/div[2]/div/table/tbody/tr/td[2]/input")).sendKeys("tester");
		Thread.sleep(1000);
		D.findElement(By.xpath("//*[@id=\"operations-user-getUserByName\"]/div[2]/div/div[2]/button[1]")).click();
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,400);");
		
		//delete user
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,3000);");
		Thread.sleep(1000);
		D.findElement(By.xpath("//*[@id=\"operations-user-deleteUser\"]/div/button")).click();
		Thread.sleep(1000);
		D.findElement(By.xpath("//button[contains(text(),'Try it out')]")).click();
		Thread.sleep(1000);
		D.findElement(By.xpath("//*[@id=\"operations-user-deleteUser\"]/div[2]/div/div[2]/div[2]/div/table/tbody/tr/td[2]/input")).sendKeys("tester");
		Thread.sleep(1000);
		D.findElement(By.xpath("//*[@id=\"operations-user-deleteUser\"]/div[2]/div/div[3]/button")).click();
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,400);");
		
		//verify user is deleted
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,-3800);");
		Thread.sleep(1000);
		D.findElement(By.xpath("//*[@id=\"operations-user-getUserByName\"]/div[2]/div/div[2]/button[1]")).click();
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,300);");
		
		Thread.sleep(5000);
		D.close();

	}

}
