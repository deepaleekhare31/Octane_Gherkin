package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import cucumber.api.java.en.*;
import org.junit.Assert;
//import io.cucumber.java.en.*;

public class SonarLoginSteps {
	
	WebDriver driver = null;
	
	@Given("Browser is Open")
	public void browser_is_Open() {
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.setBinary("C:\\Users\\deekhare\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
		System.getProperty("webdriver.chrome.driver", "D:/UTF_setup_3.4/UTF_setup_py3/UTF_Installer/UTF/UnifiedTestFramework/ExternalTools/Drivers/chromedriver.exe");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("user is on Google home page")
	public void user_is_on_Google_home_page() {
		driver.get("http://google.com");
		driver.close();
		driver.quit();
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,\"button\")][text()=\"Log in\"]")).click();
	}

	@When("^user logins with valid (.*) and (.*)$")
	public void user_logins_with_valid_username_and_password(String username, String password) {
		driver.findElement(By.id("login")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();
		driver.close();
		driver.quit();
	}
	
	@Given("user is admin")
	public void user_is_admin() {
	    System.out.println("User is the admin");
	}

	@Then("print hello world")
	public void print_hello_world() {
//		String number_of_codesmells = "175";
//		Assert.assertEquals("176",number_of_codesmells);
		System.out.println("Hello World!");
	}

}
