package pageObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.opencsv.CSVWriter;

public class FaceBookSerachPage<WeElement> {
	public WebDriver ldriver;

	public FaceBookSerachPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "/html/body/div[2]/div/div/button")
	@CacheLookup
	WebElement CloseLogin;
	@FindBy(xpath = "//input[@name='q']")
	@CacheLookup
	WebElement SearchBox;

	@FindBy(xpath = "//*[@type='submit']")
	@CacheLookup
	WebElement SearchButton;

	@FindBy(xpath = "(//Select[@class='fPjUPw'])[2]")
	@CacheLookup
	WebElement applyFilter;

	@FindBy(xpath = "//div[@class='_3wU53n']")
	@CacheLookup
	WebElement mobilename;

	@FindBy(xpath = "//div[@class='_1vC4OE _2rQ-NK']")
	@CacheLookup
	WebElement mobilePrice;

	public void CloseLoginPopup() {
		CloseLogin.click();
	}

	public void SearchBox(String Text) {
		SearchBox.sendKeys(Text);
	}

	public void SearchButton() {
		SearchButton.click();
	}

	public void MobilePrice() {
		Select stat = new Select(ldriver.findElement(By.xpath("(//Select[@class='fPjUPw'])[2]")));
		stat.selectByVisibleText("₹30000");
	}

	public void getMobileName() throws IOException {
		int mobile = ldriver.findElements(By.xpath("//div[@class='_3wU53n']")).size();
		for (int i = 1; i < mobile; i++) {
			String mobilprice = ldriver.findElement(By.xpath("(//div[@class='_1vC4OE _2rQ-NK'])[" + i + "]")).getText();
			String mobilename = ldriver.findElement(By.xpath("(//div[@class='_3wU53n'])[" + i + "]")).getText();
			System.out.println(mobilename + ", " + mobilprice);
		}

	}
	public void WriteStringData() throws IOException {
		int mobile = ldriver.findElements(By.xpath("//div[@class='_3wU53n']")).size();
		for (int i = 1; i < mobile; i++) {
			String mobilprice = ldriver.findElement(By.xpath("(//div[@class='_1vC4OE _2rQ-NK'])[" + i + "]")).getText();
			String mobilename = ldriver.findElement(By.xpath("(//div[@class='_3wU53n'])[" + i + "]")).getText();
			System.out.println(mobilename + ", " + mobilprice);
			String data1 = mobilename + ", " + mobilprice;
			//File file = new File("E:\\Eclipse\\SeleniumWorkSpace\\CucumberTestApp\\Output.csv");
			File file = new File("E:\\Eclipse\\SeleniumWorkSpace\\CucumberTestApp\\Name.csv"); 
	        //Scanner sc = new Scanner(System.in); 
	        try { 
	            // create FileWriter object with file as parameter 
	            FileWriter outputfile = new FileWriter(file); 
	  
	            // create CSVWriter with ';' as separator 
	            CSVWriter writer = new CSVWriter(outputfile, ';', 
	                                             CSVWriter.NO_QUOTE_CHARACTER, 
	                                             CSVWriter.DEFAULT_ESCAPE_CHARACTER, 
	                                             CSVWriter.DEFAULT_LINE_END); 
	  
	            // create a List which contains Data 
	            List<String[]> data = new ArrayList<String[]>(); 
	  
	            System.out.println("Enter no of rows"); 
	            int noOfRow = mobile;
	            System.out.println("Enter Data"); 
	            for (int j = 0; j < noOfRow; j++) { 
	                String row = mobilename + "_" + mobilprice; 
	                String[] rowdata = row.split("_"); 
	                data.add(rowdata); 
	            } 
	  
	            writer.writeAll(data); 
	  
	            // closing writer connection 
	            writer.close(); 
	        } 
	        catch (IOException e) { 
	            // TODO Auto-generated catch block 
	            e.printStackTrace(); 
	        } 
		}

	}
}