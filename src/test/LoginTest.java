package test;

import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class LoginTest {
	
	WebDriver driver;
	private static FileInputStream fileInputStream;
	private static FileOutputStream fileOutputStream;
	
 @Test
  public void main() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Arun\\su\\chromedriver.exe");
	  driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("http://vis.vervesys.local/Login.aspx");
	    Thread.sleep(1000);
	    
	    WebElement popup1 = driver.findElement(By.className("login_main"));
	    popup1.click();
	    
  }
 

 
 

 @Test(priority=6)
 public void verify1() throws InterruptedException, IOException
 {
	 WebElement username = driver.findElement(By.id("username"));
	    WebElement password = driver.findElement(By.id("password"));
	    WebElement Login = driver.findElement(By.id("logged"));
	    username.sendKeys("Arun");
	    password.sendKeys("Arun@1234");
	    Login.click();
	    Thread.sleep(1000);
	    
	    
	    String title=driver.getTitle();
		  System.out.printf("The Page Title is:" + title);
		  Assert.assertEquals(title, "ARUN");
	    
	    java.io.File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    java.io.File dest = new java.io.File("D:\\Arun\\Java Eclips\\Automation Project\\Rundriv\\screenshot\\userlogin.png"); 
	    
	    copyFileUsingChannel111(src, dest);
		
	    System.out.println("File write success");
	    
	    
	    
	    System.out.println("User login suceessfully");
	    
	    
	    WebElement popup2=driver.findElement(By.name("imgpunchin"));
	    popup2.click();
	    Thread.sleep(1000);
	    
	    
 }
 
 private static void copyFileUsingChannel111(File source, File dest) throws IOException {
	    FileChannel sourceChannel = null;
	    FileChannel destChannel = null;
	    try {
	        fileInputStream = new FileInputStream(source);
			sourceChannel = fileInputStream.getChannel();
	        fileOutputStream = new FileOutputStream(dest);
			destChannel = fileOutputStream.getChannel();
	        destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
	       }finally{
	           sourceChannel.close();
	           destChannel.close();
	   }
	}
 
 
 
 

@Test(priority=1)
 public void verify2() throws InterruptedException, IOException
 {
	 WebElement username = driver.findElement(By.id("username"));
	    WebElement password = driver.findElement(By.id("password"));
	    WebElement Login = driver.findElement(By.id("logged"));
	    username.sendKeys("Adfsfrun");
	    password.sendKeys("Arudsfdsn@1234");
	    Login.click();
	    Thread.sleep(2000);
	    
	    
	    java.io.File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    java.io.File dest = new java.io.File("D:\\Arun\\Java Eclips\\Automation Project\\Rundriv\\screenshot\\scenario1.png"); 
	    
	    copyFileUsingChannel111(src, dest);
		System.out.println("File write success");
	    
	    
	    
	    
	    System.out.println("Username and Password wrongly entered!");

	    
	    
	    
	    
 }
 
 private static void copyFileUsingChannel124(File source, File dest) throws IOException {
	    FileChannel sourceChannel = null;
	    FileChannel destChannel = null;
	    try {
	        fileInputStream = new FileInputStream(source);
			sourceChannel = fileInputStream.getChannel();
	        fileOutputStream = new FileOutputStream(dest);
			destChannel = fileOutputStream.getChannel();
	        destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
	       }
	    finally
	    {
	           sourceChannel.close();
	           destChannel.close();
	   }
	}
 

 @Test(priority=2)
 public void verify3() throws InterruptedException, IOException
 {
	 WebElement username = driver.findElement(By.id("username"));
	    WebElement password = driver.findElement(By.id("password"));
	    WebElement Login = driver.findElement(By.id("logged"));
	    username.sendKeys("Arunfhgfh");
	    password.sendKeys("Arun@1234");
	    Login.click();
	    Thread.sleep(2000);
	   
	    java.io.File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    java.io.File dest = new java.io.File("D:\\Arun\\Java Eclips\\Automation Project\\Rundriv\\screenshot\\scenrio2.png"); 
	    
	    copyFileUsingChannel111(src, dest);
		System.out.println("File write success");
	    
	    
	    System.out.println("Wrong username entered");

	   
 }
 
 
 private static void copyFileUsingChannel(File source, File dest) throws IOException {
	    FileChannel sourceChannel = null;
	    FileChannel destChannel = null;
	    try {
	        fileInputStream = new FileInputStream(source);
			sourceChannel = fileInputStream.getChannel();
	        fileOutputStream = new FileOutputStream(dest);
			destChannel = fileOutputStream.getChannel();
	        destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
	       }finally{
	           sourceChannel.close();
	           destChannel.close();
	   }
	}
 
 
 @Test(priority=3)
 public void verify4() throws InterruptedException, IOException
 {
	 WebElement username = driver.findElement(By.id("username"));
	    WebElement password = driver.findElement(By.id("password"));
	    WebElement Login = driver.findElement(By.id("logged"));
	    username.sendKeys("Arun");
	    password.sendKeys("Ardgdgun@1234");
	    Login.click();
	    Thread.sleep(2000);
	    
	    java.io.File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    java.io.File dest = new java.io.File("D:\\Arun\\Java Eclips\\Automation Project\\Rundriv\\screenshot\\scenairo3.png"); 
	    
	    copyFileUsingChannel111(src, dest);
		System.out.println("File write success"); 
	    
	    
	    System.out.println("Wrong Password entered");
	    
 
 
 
 
 
 }
 
 private static void copyFileUsingChannel11(File source, File dest) throws IOException {
	    FileChannel sourceChannel = null;
	    FileChannel destChannel = null;
	    try {
	        fileInputStream = new FileInputStream(source);
			sourceChannel = fileInputStream.getChannel();
	        fileOutputStream = new FileOutputStream(dest);
			destChannel = fileOutputStream.getChannel();
	        destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
	       }finally{
	           sourceChannel.close();
	           destChannel.close();
	   }
	}
 
 @Test(priority=4)
 public void verify5() throws InterruptedException, IOException
 {
	 WebElement username = driver.findElement(By.id("username"));
	    WebElement password = driver.findElement(By.id("password"));
	    WebElement Login = driver.findElement(By.id("logged"));
	    username.sendKeys("");
	    password.sendKeys("");
	    Login.click();
	    Thread.sleep(2000);
	    java.io.File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    java.io.File dest = new java.io.File("D:\\Arun\\Java Eclips\\Automation Project\\Rundriv\\screenshot\\scenarios4.png"); 
	    
	    copyFileUsingChannel111(src, dest);
		System.out.println("File write success");
	 
	    
	    
	    System.out.println("Blank Credentails entered");
	    
	    
	       
	    
 }
 
 private static void copyFileUsingChannel1(File source, File dest) throws IOException {
	    FileChannel sourceChannel = null;
	    FileChannel destChannel = null;
	    try {
	        fileInputStream = new FileInputStream(source);
			sourceChannel = fileInputStream.getChannel();
	        fileOutputStream = new FileOutputStream(dest);
			destChannel = fileOutputStream.getChannel();
	        destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
	       }finally{
	           sourceChannel.close();
	           destChannel.close();
	   }
	}
 
 @Test(priority=5)
 public void verify6() throws InterruptedException, IOException
 {
	 WebElement username = driver.findElement(By.id("username"));
	    WebElement password = driver.findElement(By.id("password"));
	    WebElement Login = driver.findElement(By.id("logged"));
	    username.sendKeys("sdfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffzzzzz #$@#98675");
	    password.sendKeys("SFSDDDDDDDD   SDFSSS546416+)&*^%%#@@#$%^&()S");
	    Login.click();
	    Thread.sleep(2000);
	    
	    java.io.File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    java.io.File dest = new java.io.File("D:\\Arun\\Java Eclips\\Automation Project\\Rundriv\\screenshot\\scenarios9.png"); 
	    
	    copyFileUsingChannel111(src, dest);
		System.out.println("File write success");
	 
	    
	    
	    System.out.println("Blank Credentails entered");
	    
	    
	       
	    
 }
 
 private static void copyFileUsingChannel1236(File source, File dest) throws IOException {
	    FileChannel sourceChannel = null;
	    FileChannel destChannel = null;
	    try {
	        fileInputStream = new FileInputStream(source);
			sourceChannel = fileInputStream.getChannel();
	        fileOutputStream = new FileOutputStream(dest);
			destChannel = fileOutputStream.getChannel();
	        destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
	       }finally{
	           sourceChannel.close();
	           destChannel.close();
	   }
	}
 
 
 
 
 @AfterTest
 
 public void close()
 {
     driver.close();
 }
 

}

