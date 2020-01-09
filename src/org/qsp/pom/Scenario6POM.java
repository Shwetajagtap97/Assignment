package org.qsp.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scenario6POM {
	
		@FindBy (id="search_query_top_elastic_search")
		private WebElement search;
		@FindBy(name="submit_search")
		private WebElement button;
		@FindBy(xpath="//div[@class='top-filter-blocks']/section[@id='Price-form']")
		private WebElement price;
		
		@FindBy(xpath="//span[text()=' Below ']")
		private WebElement below;
		@FindBy(xpath="//div[@class='p-image']")
		private List<WebElement> countList;
		public Scenario6POM (WebDriver driver){
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
		a.moveToElement(price).perform();;
		}
		public void clickBelow()
		{
			below.click();
		}
		public int getCountb()
		{
			int count=0;
			for(WebElement li:countList)
			{
			count++;	
			}
			return count;
		}
		
		
		
		
		
		
		@FindBy(xpath="//span[text()=' Below ']/span[@class='items-count']")
		private WebElement count;
		public String getCount()
		{
			return count.getText();
		}

}
