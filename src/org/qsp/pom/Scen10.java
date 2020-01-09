package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scen10 {
	@FindBy (id="search_query_top_elastic_search")
	private WebElement search;
	@FindBy(name="submit_search")
	private WebElement button;
	@FindBy(xpath="//section[@id='Gender-form']")
	private WebElement gender;
	@FindBy(xpath="//section[@id='Gender-form']/descendant::span[@class='items-count']")
	private WebElement count;
	public Scen10 (WebDriver driver){
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
	a.moveToElement(gender).perform();;
	}
	public String getCount()
	{
		return count.getText();
	}
}
