package org.qsp.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scen8 {
	@FindBy (id="search_query_top_elastic_search")
	private WebElement search;
	@FindBy(name="submit_search")
	private WebElement button;
	@FindBy(xpath="//section[@id='Metal-form']")
	private WebElement metal;
	@FindBy(xpath="//span[text()=' Platinum ']/span[@class='items-count']")
	private WebElement count;
	@FindBy(xpath="")
	private List<WebElement> li;
	public Scen8 (WebDriver driver){
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
	a.moveToElement(metal).perform();;
	}
	public String getCount()
	{
		return count.getText();
	}

}
