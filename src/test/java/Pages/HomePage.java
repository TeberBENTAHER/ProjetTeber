package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {
@FindBy(tagName="h6")
	WebElement msg;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li/a/span")
List<WebElement> menus;

public HomePage(){
	PageFactory.initElements(Config.driver, this);
	}

public String verifmsg() {
String actuelmsg = msg.getText();
return actuelmsg;
}
	public void clickOnMenuByName(String NameMenu) {
		try {
		for(WebElement menu:menus) {
			if(menu.getText().contains(NameMenu)) {
				menu.click();
			}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
