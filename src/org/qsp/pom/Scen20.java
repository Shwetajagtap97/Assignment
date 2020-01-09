package org.qsp.pom;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scen20 {
	@FindBy(xpath = "//iframe[@class='demo-frame']")
	private WebElement frames;
	@FindBy(id = "slider")
	private WebElement silder;

	public Scen20(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void swtichFrame(WebDriver driver) {
		driver.switchTo().frame(frames);
		System.out.println("Frame Switch");
	}

	public void sild(WebDriver driver) {
		Actions a = new Actions(driver);
		a.dragAndDropBy(silder, 1000, 0).perform();
		System.out.println("Slide done");
	}

	public void sildrevers(WebDriver driver) {
		Actions a = new Actions(driver);
		a.dragAndDropBy(silder, -1000, 0).perform();
		System.out.println("reverse done");
	}

}
