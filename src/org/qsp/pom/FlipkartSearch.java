package org.qsp.pom;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartSearch {
	@FindBy(xpath="//input[@class='LM6RPg']")
	private  WebElement search;
	@FindBy(xpath="//button[@class='vh79eN']")
	private  WebElement button;
	@FindBy(xpath="//span[text()='Electronics']")
	private WebElement ele;
	@FindBy(xpath="//ul[@class='QPOmNK']/li[2]/a[@title='Mi']")
	private WebElement mi;
	@FindBy(xpath="//div[@data-id='MOBFKPYDENDXZZ7U']/descendant::img[@class='_1Nyybr  _30XEf0']")
	private WebElement img;
	@FindBy(xpath="//li[@class='col col-6-12']/button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	private WebElement add;
	
	public FlipkartSearch(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public void sendTxt(String txt)
	{
		search.sendKeys(txt);
	}
	public void clickonButton(){
		button.click();
	}
	public void mousover(Actions a)
	{
		a.moveToElement(ele).perform();
	}
	public void clickMi()
	{
		mi.click();
	}
	public void clickImg()
	{
		img.click();
	}
	public void clickAdd()
	{
		add.click();
	}
}
