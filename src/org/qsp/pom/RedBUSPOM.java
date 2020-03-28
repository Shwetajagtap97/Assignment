package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedBUSPOM {
	@FindBy(id="src")
	private WebElement from;
	@FindBy(id="dest")
	private WebElement to;
	@FindBy(xpath="//div[@class='fl search-box date-box gtm-onwardCalendar']")
	private WebElement onword;
	@FindBy(id="//td[text()='19']")
	private WebElement onwordate;
	@FindBy(id="//div[@class='fl search-box date-box gtm-returnCalendar']")
	private WebElement returnd;
	@FindBy(id="//div[@id='rb-calendar_onward_cal']/descendant::td[@class='next']")
	private WebElement next;
	@FindBy(id="//td[text()='3']")
	private WebElement returndate;
	@FindBy(id="search_btn")
	private WebElement search;
	public RedBUSPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	public void sendFrom(String str)
	{	from.click();
		from.sendKeys(str);
	}
	public void sendTo(String str)
	{	to.click();
		to.sendKeys(str);
	}
	public void selOwardCal()
	{
		onword.click();
	}
	public void onwarDate(){
		onwordate.click();
	}
	public void selReturnCal()
	{
		returnd.click();
	}
	public void returnDate(){
		returndate.click();
	}
	public void serachBus(){
		search.click();
	}
	public void next()
	{
		next.click();
	}
}
