package com.adactin.baseclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class BaseClass {

	public static WebDriver driver;
	

//----------------------------------------------browserLaunch-----------------------------------------------------------------//	
	public static WebDriver Browserlaunch(String browsername) throws Exception {
		try {
			if (browsername == "chrome") {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Workspace_Project\\AdactinCucumber\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();

			} else if (browsername == "firefox") {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Workspace_Project\\AdactinCucumber\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
		} catch (Exception e) {
			throw new Exception("invalid");
		}

		return driver;

	}
//----------------------------------------------browserLaunch-----------------------------------------------------------------//	

//----------------------------------------------getUrl-----------------------------------------------------------------//	

	public static void getUrl(String url) throws Exception {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("url is invalid");
		}
	}
//----------------------------------------------getUrl-----------------------------------------------------------------//	

//----------------------------------------------currentUrl-----------------------------------------------------------------//	
	public static String getCurrentUrl() throws Exception {
		String currentUrl = null;
		try {
			currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("if url is not present");
		}
		return currentUrl;
	}
//----------------------------------------------currentUrl-----------------------------------------------------------------//	

//----------------------------------------------Scroll-----------------------------------------------------------------//	

	public static void scroll(WebElement elements) {
		try {
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("arguments[0].scrollIntoView();", elements);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// ----------------------------------------------Scroll-----------------------------------------------------------------//

	// ----------------------------------------------SendKeys-----------------------------------------------------------------//

	public static void sendkeys(WebElement element, String value) {
			element.sendKeys(value);
		}
		
	
	// ----------------------------------------------SendKeys-----------------------------------------------------------------//

//----------------------------------------------GetTitle-----------------------------------------------------------------//	

	public static String getTitle() {
		String title = null;
		try {
			title = driver.getTitle();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return title;
	}
//----------------------------------------------GetTitle-----------------------------------------------------------------//	

//----------------------------------------------DropDown-----------------------------------------------------------------//	

	public static void dropdown(WebElement element, String value, String i) {
		Select s = new Select(element);
		if (value.equals("index")) {
			s.selectByIndex(Integer.parseInt(i));
		} else if (value.equals("value")) {
			s.selectByValue(value);
		} else if (value.equals("text")) {
			s.selectByVisibleText(value);
		}
	}
//----------------------------------------------DropDown-----------------------------------------------------------------//	

//----------------------------------------------To Click-----------------------------------------------------------------//	
	public static void clickElemenet(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//----------------------------------------------To Click-----------------------------------------------------------------//	

//----------------------------------------------NavigateTo-----------------------------------------------------------------//	

	public static void navigateto(String url) {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//----------------------------------------------NavigateTo-----------------------------------------------------------------//	

//----------------------------------------------NavigateBack-----------------------------------------------------------------//	

	public static void navigateback() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//----------------------------------------------NavigateBack-----------------------------------------------------------------//	

//----------------------------------------------NavigateForward-----------------------------------------------------------------//	

	public static void navigateforward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//----------------------------------------------NavigateForward-----------------------------------------------------------------//	

//----------------------------------------------NavigateRefresh-----------------------------------------------------------------//	

	public static void navigaterefresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//----------------------------------------------NavigateRefresh-----------------------------------------------------------------//	

//----------------------------------------------GetText-------------------------------------------------------------------------//	

	public static void getText(WebElement element) {
		try {
			System.out.println(element.getText());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//----------------------------------------------GetText-----------------------------------------------------------------//	

//----------------------------------------------getAttribute-----------------------------------------------------------------//	

	public static void getAttribute(WebElement element) {
		try {
			String attribute = element.getAttribute("value");
			System.out.println(attribute);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//----------------------------------------------getAttribute-----------------------------------------------------------------//	

//----------------------------------------------radioButton-----------------------------------------------------------------//	

	public static void radioButton(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//----------------------------------------------radioButton-----------------------------------------------------------------//	

//----------------------------------------------getOptions-----------------------------------------------------------------//	

	public static void getOptions(WebElement element) {
		Select y = new Select(element);
		List<WebElement> options = y.getOptions();
		for (WebElement y1 : options) {
			System.out.println(y1.getText());
		}
	}
//----------------------------------------------getOptions-----------------------------------------------------------------//	

//----------------------------------------------firstSelectedOption-----------------------------------------------------------------//	

	public static void firstSelectedOption(WebElement element) {
		Select y = new Select(element);
		WebElement firstSelectedOption = y.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}
//----------------------------------------------firstSelectedOption-----------------------------------------------------------------//	

//----------------------------------------------screenShot-----------------------------------------------------------------//	

	public static void screenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotfile = ts.getScreenshotAs(OutputType.FILE);
		File savefile = new File("C:\\Users\\Tamilselvan\\eclipse-workspace\\screenshot");
		Files.copy(screenshotfile, savefile);
	}
//----------------------------------------------screenShot-----------------------------------------------------------------//	

//----------------------------------------------windowHandles-----------------------------------------------------------------//	

	public static void windowHandles(WebElement element) {
		String singleWindow = driver.getWindowHandle();
		element.click();
		Set<String> multiwindow = driver.getWindowHandles();
		String y = null;
		for (String d : multiwindow) {
			if (!d.equals(singleWindow)) {
				y = d;
			}

		}
		driver.switchTo().window(y);
	}
//----------------------------------------------windowHandles-----------------------------------------------------------------//

//----------------------------------------------Alert-----------------------------------------------------------------//	

	public static void alertt(WebElement element, String value) {
		element.click();
		Alert alert = driver.switchTo().alert();
		if (value == "accept") {
			alert.accept();
			driver.switchTo().defaultContent();
		} else {
			alert.dismiss();
			driver.switchTo().defaultContent();
		}
	}
//----------------------------------------------Alert-----------------------------------------------------------------//	

//----------------------------------------------AlertText-----------------------------------------------------------------//	

	public static void alertText(WebElement element, String r, String value) {
		element.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(value);
	}
//----------------------------------------------AlertText-----------------------------------------------------------------//	

//----------------------------------------------close-----------------------------------------------------------------//	

	public static void closee() {
		driver.close();
	}
//----------------------------------------------close-----------------------------------------------------------------//	

//----------------------------------------------quit-----------------------------------------------------------------//	

	public static void quitt() {
		driver.quit();
	}
//----------------------------------------------quit-----------------------------------------------------------------//	

//----------------------------------------------doubleClick-----------------------------------------------------------------//	

	public static void doubleclicks(WebElement element) {
		Actions ac1 = new Actions(driver);
		ac1.doubleClick(element).build().perform();
	}
//----------------------------------------------doubleClick-----------------------------------------------------------------//	

//----------------------------------------------click-----------------------------------------------------------------//	

	public static void clicks(WebElement element) {
		Actions ac2 = new Actions(driver);
		ac2.click(element).build().perform();
	}
//----------------------------------------------click-----------------------------------------------------------------//

//----------------------------------------------rightClick-----------------------------------------------------------------//	

	public static void rightclicks(WebElement element) {
		Actions ac3 = new Actions(driver);
		ac3.contextClick(element).build().perform();
	}
//----------------------------------------------rightClick-----------------------------------------------------------------//	

//----------------------------------------------sendkeysWithAction-----------------------------------------------------------------//	

	public static void sendkeysActions(WebElement element, String value) {
		Actions ac4 = new Actions(driver);
		ac4.sendKeys(element, value).build().perform();
	}
//----------------------------------------------sendkeysWithAction-----------------------------------------------------------------//	

//----------------------------------------------robot-----------------------------------------------------------------//	

	public static void robott(WebElement element, String value) throws Exception {
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
//----------------------------------------------robot-----------------------------------------------------------------//	

//----------------------------------------------Drag&Drop-----------------------------------------------------------------//	

	public static void dragDrop(WebElement element1, WebElement element2) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(element1, element2).build().perform();
	}
//----------------------------------------------Drag&Drop-----------------------------------------------------------------//	

//----------------------------------------------i-Frames-----------------------------------------------------------------//	

	public static void iframes(WebElement element) {
		driver.switchTo().frame(element);
	}
//----------------------------------------------i-Frames-----------------------------------------------------------------//	

//----------------------------------------------ExplicitWait-----------------------------------------------------------------//	

	public static void waitForElement(WebElement element) {
		try {
			WebDriverWait wb = new WebDriverWait(driver, 30);
			wb.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//----------------------------------------------ExplicitWait-----------------------------------------------------------------//	

//----------------------------------------------isDisplayed-----------------------------------------------------------------//	

	public static boolean elementIsDisplayed(WebElement element) {
		boolean displayed = false;
		try {
			displayed = element.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return displayed;
	}
//----------------------------------------------isDisplayed-----------------------------------------------------------------//	

//----------------------------------------------isEnabled-----------------------------------------------------------------//	

	public static void elementIsEnabled(WebElement element) {
		boolean enabled = false;
		try {
			enabled = element.isEnabled();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//----------------------------------------------isEnabled-----------------------------------------------------------------//

//----------------------------------------------isSelected-----------------------------------------------------------------//	

	public static void elementIsSelected(WebElement element) {
		boolean selected = false;
		try {
			selected = element.isSelected();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//----------------------------------------------isSelected-----------------------------------------------------------------//

//----------------------------------------------mouseOver-----------------------------------------------------------------//	

	public static void mouseOver(WebElement element) {

		try {
			Actions ac = new Actions(driver);
			if (elementIsDisplayed(element)) {
				ac.moveToElement(element).build().perform();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//----------------------------------------------mouseOver-----------------------------------------------------------------//	

	
	
	
	
	
	
	
	
}
