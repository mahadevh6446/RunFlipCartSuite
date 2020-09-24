package stepDefinitions;

import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.jar.asm.ClassWriter;
import pageObject.FaceBookSerachPage;

public class Steps {
	public WebDriver driver;
	public FaceBookSerachPage fb;

	@Given("^User should launch the broweser$")
	public void user_should_launch_the_broweser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Eclipse\\SeleniumWorkSpace\\SeleniumProject\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		fb = new FaceBookSerachPage(driver);

	}

	@When("^User opens the URL \"([^\"]*)\"$")
	public void user_opens_the_URL(String url) throws Throwable {
		driver.get(url);

	}

	@When("^Click on Close button the login popup$")
	public void click_on_Close_button_the_login_popup() throws Throwable {
		fb.CloseLoginPopup();
	}

	@When("^Click on Search box in home page and Enter the \"([^\"]*)\"$")
	public void click_on_Search_box_in_home_page_and_Enter_the(String text) throws Throwable {
		fb.SearchBox(text);
	}

	@Then("^Click on the Search button$")
	public void click_on_the_Search_button() throws Throwable {
		fb.SearchButton();

	}

	@When("^apply the filters$")
	public void apply_the_filters() throws Throwable {
		fb.MobilePrice();
	}

	@Then("^Get the Mobile name and Price$")
	public void get_the_Mobile_name_and_Price() throws Throwable {
		Thread.sleep(3000);
		fb.getMobileName();
		
	}

	@Then("^Store in in CSV file$")
	public void store_in_in_CSV_file() throws Throwable {

		fb.WriteStringData();

	}

	@Then("^Close the broser$")
	public void close_the_broser() throws Throwable {
		driver.quit();
	}

}
