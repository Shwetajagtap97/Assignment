package org.qsp.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YatraPOM {
	@FindBy(name="flight_origin")
	private WebElement from;
	@FindBy(xpath="//div[@class='viewport']/descendant::li[3]")
	private WebElement placefrom;
	@FindBy(name="flight_destination")
	private WebElement goingTo;
	@FindBy(xpath="//div[@class='viewport']/descendant::li[2]")
	private WebElement placeTo;
	
	@FindBy(name="flight_origin_date")
	private WebElement calender;
	@FindBy(xpath="//td[@id='20/01/2020']")
	private WebElement date;
	
	@FindBy(name="flight_destination_date")
	private WebElement rcalender;
	@FindBy(id="27/01/2020")
	private WebElement rdate;
	
	@FindBy(xpath="//span[@class='txt-ellipses flight_passengerBox travellerPaxBox']")
	private WebElement travellers;
	@FindBy(xpath="//span[@id='adultPax']/parent::span/following::span[2]")
	private WebElement adult;
	@FindBy(xpath="//span[@id='childPax']/parent::span/following::span[2]")
	private WebElement child;
	@FindBy(xpath="//span[@id='infantPax']/parent::span/following::span[2]")
	private WebElement infant;
	@FindBy(xpath="//span[text()='Premium Economy']/parent::li")
	private WebElement premium;
	@FindBy(xpath="//span[text()='Business']/parent::li")
	private WebElement business;
	@FindBy(xpath="//span[text()='Economy']/parent::li")
	private WebElement economy;
	
	@FindBy(id="BE_flight_flsearch_btn")
	private WebElement searchf;
	
	public YatraPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void From()
	{
		from.click();
	}
	public void selectDes()
	{
		placefrom.click();
	}
	public void To()
	{
		goingTo.click();
	}
	public void toDesc()
	{
		placeTo.click();
	}
	
	
	public void clickCalendar()
	{
		calender.click();
	}
	public void selecDate()
	{
		date.click();
	}
	public void retCalendar()
	{
		rcalender.click();
	}
	public void rutDate()
	{
		rdate.click();
	}
	public void traveller()
	{
		travellers.click();	
	}
	public void addAdult()
	{
		adult.click();
	}
	public void addChild()
	{
		child.click();
	}
	public void addInfant()
	{
		infant.click();
	}
	public void selBusiness()
	{
		business.click();
	}
	public void selEconomy()
	{
		economy.click();
	}
	public void selPEconomy()
	{
		premium.click();
	}
	public void searchFlights()
	{
		searchf.click();
	}
}
