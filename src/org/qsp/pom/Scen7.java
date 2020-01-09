package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scen7 {
	@FindBy (id="search_query_top_elastic_search")
	private WebElement search;
	@FindBy(name="submit_search")
	private WebElement button;
	@FindBy(xpath="//div[@class='top-filter-blocks']/section[@id='Delivery Time-form']/span")
	private WebElement delivery;
	@FindBy(xpath="//div[@class='top-filter-blocks']/section[@id='Delivery Time-form']/descendant::span[@class='items-count']")
	private WebElement count;
	public Scen7 (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void sendTxt(String str)
	{
		search.sendKeys(str);
	}
	public void clickButton(){
		button.click();
	}
	public void mouseOver(WebDriver driver)
	{
	Actions a=new Actions(driver);
	a.moveToElement(delivery).perform();;
	}
	public String getCount()
	{
		return count.getText();
	}

}
