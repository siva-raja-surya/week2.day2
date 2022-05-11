package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leaftap {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();
	
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.className("crmsfa")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("surya");
		
		
		Select dd1=new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		dd1.selectByVisibleText("Employee");
		
		driver.findElement(By.name("firstNameLocal")).sendKeys("siva");
		
		driver.findElement(By.name("personalTitle")).sendKeys("Mechanic");
		
		driver.findElement(By.name("generalProfTitle")).sendKeys("engineer");
		
		driver.findElement(By.name("annualRevenue")).sendKeys("543486468");

		driver.findElement(By.name("annualRevenue")).sendKeys("543486468");
		
		Select dd2=new Select(driver.findElement(By.id("createLeadForm_industryEnumId")));
		dd2.selectByIndex(2);
		
		Select dd3=new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
		dd3.selectByValue("OWN_CCORP");
		
		driver.findElement(By.name("sicCode")).sendKeys("54866");

		driver.findElement(By.name("description")).sendKeys("test leaf, akubfk skuhfkjf skfkajwf kusgi ksjdbfkjb skdjbfksjb");

		driver.findElement(By.name("importantNote")).sendKeys("iorhgh iuwefb bvjsd sieufgiu");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("E");

		Select dd4=new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
		dd4.selectByVisibleText("Automobile");
		
		driver.findElement(By.name("lastNameLocal")).sendKeys("SIVA");

		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("16/03/1999");

		
		driver.findElement(By.name("departmentName")).sendKeys("department");
		
		Select dd6=new Select(driver.findElement(By.id("createLeadForm_currencyUomId")));
		dd6.selectByValue("INR");

		driver.findElement(By.name("numberEmployees")).sendKeys("486");
		
		driver.findElement(By.name("tickerSymbol")).sendKeys("###");
		
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");

		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("625018");

		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("625005");

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sivarajasura16@gmail.com");

		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8098388106");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Raja");

		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");

		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("41 Illam");

		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("koodal nagar");

		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Madurai");

		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("625018");
		
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("18");

		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("James");

		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Ashoke nagar");
		
		Select dd8=new Select(driver.findElement(By.id("createLeadForm_generalCountryGeoId")));
		dd8.selectByValue("IND");
		Select dd7=new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		dd7.selectByValue("IN-TN");
		
		
		driver.findElement(By.name("submitButton")).click();
		
		String name=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("first name: " + name);
		
		if (driver.getTitle().contains("View Lea")) {
			System.out.println("The title of the page is same");
		}
		else {
			System.out.println("The title is not same");
		}
		
			

	}

}
