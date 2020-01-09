package org.qsp.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DevSelenium {

	@FindBy(xpath="//input[@class='gsc-input']")
	private WebElement txt1;
	public DevSelenium(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
		public void sendTxt(String txt)
		{
			txt1.sendKeys(txt,Keys.ENTER);
		}

}
