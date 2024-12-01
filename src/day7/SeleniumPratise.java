package day7;

import org.openqa.selenium.By;

public class SeleniumPratise {
	/*
	 * 2. Viết 1 hàm, truyền vào 2 tham số: LocatorType, LocatorValue.
	 */
	public By getLocator(String locatorType, String locatorValue) {
		By result = null;
		switch (locatorType) {
		case "id": {
			result = By.id(locatorValue);
			break;

		}
		case "name":
		{
			result=By.name(locatorValue);
			break;
		}
		case "linkText":
		{
			result=By.linkText(locatorValue);
			break;
		}
		case "cssSelector":
		{
			result=By.cssSelector(locatorValue);
			break;
		}
		default:
			result=null;
		}

		return result;
	}

}
