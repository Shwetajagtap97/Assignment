package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scen11 {
	@FindBy (id="search_query_top_elastic_search")
	private WebElement search;
	@FindBy(name="submit_search")
	private WebElement button;
	@FindBy(xpath="//div[@id='scrollTop']")
	private WebElement top;
	
	public Scen11 (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void sendTxt(String str)
	{
		search.sendKeys(str);
	}
	public void clickButton(){
		button.click();
	}
	public void topclick()
	{
		top.click();
	}
}
