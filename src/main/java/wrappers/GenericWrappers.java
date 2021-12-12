package wrappers;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public   class GenericWrappers extends Reporting implements Wrappers{
	
	public RemoteWebDriver driver;
	
	public static Properties prop;
	
	public void loadObject() {
		try {
			prop = new Properties();
			prop.load(new FileInputStream("./src/main/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void  unloadObjects() {
		prop=null;
	}
	public void invokeApp(String browser, String url){
		// TODO Auto-generated method stub
		
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEdriverserver.exe");
				driver = new InternetExplorerDriver();
			}	
			
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//System.out.println("The browser "+browser+" is launched with the given URL "+url+" successfully");
			reportStep("The browser "+browser+" is launched with the given URL "+url+" successfully", "pass");
			
			} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser "+browser+" is not launched due to session not created error");
			reportStep("The browser "+browser+" is not launched due to session not created error", "fail");
			} catch (InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launched as URL does not contain http/https");
			reportStep("The browser "+browser+" is not launched as URL does not contain http/https", "fail");
			} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launched due to unknown error");
			reportStep("The browser "+browser+" is not launched due to unknown error", "fail");
			} /*finally {
			takeSnap();
			}*/
		}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The element with id "+idValue+" is entered with data " +data);
			reportStep("The element with id "+idValue+" is entered with data " +data, "pass");
			} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idValue+" is not visisble in the application");
			reportStep("The element with id "+idValue+" is not visisble in the application", "fail");
			}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not interactable in the application");
			reportStep("The element with id "+idValue+" is not interactable in the application", "fail");
			}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not found in the DOM");
			reportStep("The element with id "+idValue+" is not found in the DOM", "fail");
			}catch (StaleElementReferenceException  e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not stable in the DOM");
			reportStep("The element with id "+idValue+" is not stable in the DOM", "fail");
			}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with id "+idValue+" is not entered with Data "+data+" due to unknown error");
			reportStep("The element with id "+idValue+" is not entered with Data "+data+" due to unknown error", "fail");
			}/*finally {
			takeSnap();
			}*/
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with name "+nameValue+" is entered with data" +data);
			reportStep("The element with name "+nameValue+" is entered with data" +data, "pass");
			} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not visible in the application");
			reportStep("The element with name "+nameValue+" is not visible in the application", "fail");
			}catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+nameValue+" is not interactable in the application");
			reportStep("The element with name "+nameValue+" is not interactable in the application", "fail");
			}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not stable in the DOM");
			reportStep("The element with name "+nameValue+" is not stable in the DOM", "fail");
			}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not found in the DOM");
			reportStep("The element with name "+nameValue+" is not found in the DOM", "fail");
			}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with name "+nameValue+" is not entered with Data "+data+"  due to unknown error");
			reportStep("The element with name "+nameValue+" is not entered with Data "+data+"  due to unknown error", "fail");
			}/*finally {
			takeSnap();
			}*/
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The element with xpath value "+xpathValue+" is entered with data" +data);
			reportStep("The element with xpath value "+xpathValue+" is entered with data" +data, "pass");
			}catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath value "+xpathValue+" is not visible in the application");
			reportStep("The element with xpath value "+xpathValue+" is not visible in the application", "fail");
			}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath value "+xpathValue+" is not interactable in the application");
			reportStep("The element with xpath value "+xpathValue+" is not interactable in the application", "fail");
			}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath value "+xpathValue+" is not found in the DOM");
			reportStep("The element with xpath value "+xpathValue+" is not found in the DOM", "fail");
			}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath value "+xpathValue+" is not stable in the application");
			reportStep("The element with xpath value "+xpathValue+" is not stable in the application", "fail");
			}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath value "+xpathValue+" is not entered with Data "+data+" due to unknown error");
			reportStep("The element with xpath value "+xpathValue+" is not entered with Data "+data+" due to unknown error", "fail");
			}/*finally {
			takeSnap();
			}*/
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String giventitle =driver.getTitle();
			if(giventitle.equals(title)) {
				//System.out.println("The title of the Page  "+giventitle+" is matched with the expected title " +title);
				reportStep("The title of the Page  "+giventitle+" is matched with the expected title " +title, "pass");
			}else {
				//System.err.println("The title of the Page "+giventitle+" is not matched with the expected title" +title);
				reportStep("The title of the Page "+giventitle+" is not matched with the expected title" +title, "pass");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The title of the Page" +title+" is not verified due to unknown error");
			reportStep("The title of the Page" +title+" is not verified due to unknown error", "fail");
		}/*finally {
			takeSnap();
		}*/
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String	giventext=driver.findElementById(id).getText();
			 if(giventext.equals(text)) {
				 //System.out.println("The element with id "+id+" is holding the text "+giventext+" is matched with expected text "+text);
				 reportStep("The element with id "+id+" is holding the text "+giventext+" is matched with expected text "+text, "pass");
			 }else {
				 //System.out.println("The element with id "+id+" is holding the text "+giventext+" is not matched with the expected text" +text);
				 reportStep("The element with id "+id+" is holding the text "+giventext+" is not matched with the expected text" +text, "pass");
			 }
			}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
			}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
			}catch (ElementNotInteractableException e) {
				// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
			} catch (StaleElementReferenceException  e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not stable in the DOM");
				reportStep("The element with id "+id+" is not stable in the DOM", "fail");
			}catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" and given "+text+" is not verified due to unknown error");
			reportStep("The element with id "+id+" and given "+text+" is not verified due to unknown error", "fail");
			}/*finally {
			takeSnap();
			}*/
		
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			
			String Verifygiventext = driver.findElementByXPath(xpath).getText();
			
			if(Verifygiventext.equals(text)) {
				//System.out.println("The element with xpath "+xpath+" is holding the text "+Verifygiventext+" is matched withe the expected text" +text);
				reportStep("The element with xpath "+xpath+" is holding the text "+Verifygiventext+" is matched withe the expected text " +text, "pass");
			}else {
				//System.out.println("The element with xpath "+xpath+" is holding the text "+Verifygiventext+" is not matched with the expected text" +text);
				reportStep("The element with xpath "+xpath+" is holding the text "+Verifygiventext+" is not matched with the expected text " +text, "pass");
			}
			} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath  "+xpath+" is not found in DOM");
			reportStep("The element with xpath  "+xpath+" is not found in DOM", "fail");
			}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("the element with xpath  "+xpath+" is not visible in application");
			reportStep("the element with xpath  "+xpath+" is not visible in application", "fail");
			}catch (StaleElementReferenceException  e) {
				// TODO: handle exception
				//System.err.println("The element with xpath value "+xpath+" is not stable in the DOM");
				reportStep("The element with xpath value "+xpath+" is not stable in the DOM", "fail");
			}catch (ElementNotInteractableException e) {
				// TODO Auto-generated catch block
			//System.err.println("The element with xpath value "+xpath+" is not interactable in the application");
			reportStep("The element with xpath value "+xpath+" is not interactable in the application", "fail");
			} 		
			catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath value "+xpath+" and given "+text+" is not verified due to unknown error");
			reportStep("The element with xpath value "+xpath+" and given "+text+" is not verified due to unknown error", "fail");
			}
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String partialtext = driver.findElementByXPath(xpath).getText();
			if(partialtext.contains(text)) {
				//System.out.println("The element with contains xpath "+xpath+" is holding the text "+partialtext+" is matched with the expected text" +text);
				reportStep("The element with contains xpath "+xpath+" is holding the text "+partialtext+" is matched with the expected text " +text, "pass");
			}else {
				//System.out.println("The element with contains xpath "+xpath+" is holding the text "+partialtext+" is not matched with the expected text" +text);
				reportStep("The element with contains xpath "+xpath+" is holding the text "+partialtext+" is not matched with the expected text" +text, "pass");
			}
			} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with contains xpath "+xpath+" is not found in DOM");
			reportStep("The element with contains xpath "+xpath+" is not found in DOM", "fail");
			}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with contains xpath  "+xpath+" is not visible in the application");
			reportStep("The element with contains xpath  "+xpath+" is not visible in the application", "fail");
			}catch (ElementNotInteractableException e) {
				// TODO Auto-generated catch block
			//System.err.println("The element with contains xpath "+xpath+" is not interactable in the application");
			reportStep("The element with contains xpath "+xpath+" is not interactable in the application", "fail");
			}catch (StaleElementReferenceException  e) {
				// TODO: handle exception
				//System.err.println("The element with contains xpath "+xpath+" is not stable in the DOM");
				reportStep("The element with contains xpath "+xpath+" is not stable in the DOM", "fail");
			}catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with contains xpath  "+xpath+" and given "+text+" is not verified due to unknown error");
			reportStep("The element with contains xpath  "+xpath+" and given "+text+" is not verified due to unknown error", "fail");
			}/*finally {
			takeSnap();
		}*/
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			//System.out.println("The element with ID value " +id+ " is clicked");
			reportStep("The element with ID value " +id+ " is clicked", "pass");
			} catch (ElementClickInterceptedException e) {			
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not clickable");
			reportStep("The element with id "+id+" is not clickable", "fail");
			}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not found in DOM");
			reportStep("The element with id "+id+" is not found in DOM", "fail");
			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not visible in the application");
				reportStep("The element with id "+id+" is not visible in the application", "fail");
			}catch (StaleElementReferenceException  e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not stable in the DOM");
				reportStep("The element with id "+id+" is not stable in the DOM", "fail");
			} catch (ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not interactable in the application");
				reportStep("The element with id "+id+" is not interactable in the application", "fail");
			}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not clicked due to unknown error");
			reportStep("The element with id "+id+" is not clicked due to unknown error", "fail");
			}/*finally {
			takeSnap();
		}*/
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element with classname value "+classVal+" is clicked");
			reportStep("The element with classname value "+classVal+" is clicked", "pass");
			} catch (ElementClickInterceptedException e) {			
			// TODO Auto-generated catch block
			//System.err.println("The element with classname value "+classVal+"  is not clickable");
			reportStep("The element with classname value "+classVal+"  is not clickable", "fail");
			}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with classname value "+classVal+" is not found in DOM");
			reportStep("The element with classname value "+classVal+" is not found in DOM", "fail");
			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element with classname value "+classVal+" is not visible in the application");
				reportStep("The element with classname value "+classVal+" is not visible in the application", "fail");
			}catch (StaleElementReferenceException  e) {
				// TODO: handle exception
				//System.err.println("The element with classname value "+classVal+" is not stable in the DOM");
				reportStep("The element with classname value "+classVal+" is not stable in the DOM", "fail");
			} catch (ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element with classname value "+classVal+" is not interactable in the application");
				reportStep("The element with classname value "+classVal+" is not interactable in the application", "fail");
			}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with classname value "+classVal+" is not clicked due to unknown error");
			reportStep("The element with classname value "+classVal+" is not clicked due to unknown error", "fail");
			}/*finally {
			takeSnap();
		}*/
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The element with name "+name+" is clicked");
			reportStep("The element with name "+name+" is clicked", "pass");
			} catch (ElementClickInterceptedException e) {			
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+"  is not clickable");
			reportStep("The element with name "+name+"  is not clickable", "fail");
			}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not found in DOM");
			reportStep("The element with name "+name+" is not found in DOM", "fail");
			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element with name "+name+" is not visible in the application");
				reportStep("The element with name "+name+" is not visible in the application", "fail");
			}catch (ElementNotSelectableException e) {
				// TODO: handle exception
				//System.err.println("The element with name "+name+" is can not be clicked in the DOM");
				reportStep("The element with name "+name+" is can not be clicked in the DOM", "fail");
			}catch (ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element with name "+name+" is not interactable in the application");
				reportStep("The element with name "+name+" is not interactable in the application", "fail");
			}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not clicked due to unknown error");
			reportStep("The element with name "+name+" is not clicked due to unknown error", "fail");
			}/*finally {
			takeSnap();
			}*/
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element linktext "+name+" is clicked");
			reportStep("The element linktext "+name+" is clicked", "pass");
			} catch (ElementClickInterceptedException e) {			
			// TODO Auto-generated catch block
			//System.err.println("The element with linktext "+name+"  is not clickable");
			reportStep("The element with linktext "+name+"  is not clickable", "fail");
			}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not found in DOM");
			reportStep("The element with linktext "+name+" is not found in DOM", "fail");
			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element with linktext "+name+" is not visible in the application");
				reportStep("The element with linktext "+name+" is not visible in the application", "fail");
			}catch (StaleElementReferenceException  e) {
				// TODO: handle exception
				//System.err.println("The element with linktext "+name+" is not stable in the DOM");
				reportStep("The element with linktext "+name+" is not stable in the DOM", "fail");
			} catch (ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element with linktext "+name+" is not interactable in the application");
				reportStep("The element with linktext "+name+" is not interactable in the application", "fail");
			}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not clicked due to unknown error");
			reportStep("The element with linktext "+name+" is not clicked due to unknown error", "fail");
			}/*finally {
			takeSnap();
			}*/
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element linktextnosnap "+name+" is clicked");
			reportStep("The element linktextnosnap "+name+" is clicked", "pass");
			} catch (ElementClickInterceptedException e) {			
			// TODO Auto-generated catch block
			//System.err.println("The element with linktextnosnap "+name+"  is not clickable");
			reportStep("The element with linktextnosnap "+name+"  is not clickable", "fail");
			}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with linktextnosnap "+name+" is not found in DOM");
			reportStep("The element with linktextnosnap "+name+" is not found in DOM", "fail");
			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element with linktextnosnap "+name+" is not visible in the application");
				reportStep("The element with linktextnosnap "+name+" is not visible in the application", "fail");
			}catch (StaleElementReferenceException  e) {
				// TODO: handle exception
				//System.err.println("The element with linktextnosnap "+name+" is not stable in the DOM");
				reportStep("The element with linktextnosnap "+name+" is not stable in the DOM", "fail");
			}catch (ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element with linktextnosnap "+name+" is not interactable in the application");
				reportStep("The element with linktextnosnap "+name+" is not interactable in the application", "fail");
			}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with linktextnosnap "+name+" is not clicked due to unknown error");
			reportStep("The element with linktextnosnap "+name+" is not clicked due to unknown error", "fail");
			}
	}

	public void clickByXpath(String...xpathVal) {
		// TODO Auto-generated method stub
		String xpath=null;
		try {
			if(xpathVal[0].contains("$option$")) {
				xpath=xpathVal[0].replace("$option$", xpathVal[1]);
			} else {
				xpath=xpathVal[0];
			}
			driver.findElementByXPath(xpath).click();
			//System.out.println("The element xpath value "+xpathVal+" is clicked");
			reportStep("The element xpath value "+xpathVal+" is clicked", "pass");
		} catch (ElementClickInterceptedException e) {			
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath value "+xpathVal+"  is not clickable");
			reportStep("The element with xpath value "+xpathVal+"  is not clickable", "fail");
			}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath value "+xpathVal+" is not found in DOM");
			reportStep("The element with xpath value "+xpathVal+" is not found in DOM", "fail");
			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath value "+xpathVal+" is not visible in the application");
				reportStep("The element with xpath value "+xpathVal+" is not visible in the application", "fail");
			}catch (StaleElementReferenceException  e) {
				// TODO: handle exception
				//System.err.println("The element with xpath value "+xpathVal+" is not stable in the DOM");
				reportStep("The element with xpath value "+xpathVal+" is not stable in the DOM", "fail");
			}catch (ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath value "+xpathVal+" is not interactable in the application");
				reportStep("The element with xpath value "+xpathVal+" is not interactable in the application", "fail");
			}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath value "+xpathVal+" is not clicked due to unknown error");
			reportStep("The element with xpath value "+xpathVal+" is not clicked due to unknown error", "fail");
			}/*finally {
			takeSnap();
			}*/
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element xpathnosnap value "+xpathVal+" is clicked");
			reportStep("The element xpathnosnap value "+xpathVal+" is clicked", "pass");
			} catch (ElementClickInterceptedException e) {			
			// TODO Auto-generated catch block
			//System.err.println("The element with xpathnosnap value "+xpathVal+"  is not clickable");
			reportStep("The element with xpathnosnap value "+xpathVal+"  is not clickable", "fail");
			}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with xpathnosnap value "+xpathVal+" is not found in DOM");
			reportStep("The element with xpathnosnap value "+xpathVal+" is not found in DOM", "fail");
			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element with xpathnosnap value "+xpathVal+" is not visible in the application");
				reportStep("The element with xpathnosnap value "+xpathVal+" is not visible in the application", "fail");
			}catch (StaleElementReferenceException  e) {
				// TODO: handle exception
				//System.err.println("The element with xpathnosnap value "+xpathVal+" is not stable in the DOM");
				reportStep("The element with xpathnosnap value "+xpathVal+" is not stable in the DOM", "fail");
			} catch (ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element with xpathnosnap value "+xpathVal+" is not interactable in the application");
				reportStep("The element with xpathnosnap value "+xpathVal+" is not interactable in the application", "fail");
			}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpathnosnap value "+xpathVal+" is not clicked due to unknown error");
			reportStep("The element with xpathnosnap value "+xpathVal+" is not clicked due to unknown error", "fail");
			}
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String gettext=null;
		try {
			 String getText = driver.findElementById(idVal).getText();
			//System.out.println("The element with id "+idVal+" is holding the text "+getText);
			reportStep("The element with id "+idVal+" is holding the text "+getText, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idVal+" is not found in the DOM");
			reportStep("The element with id "+idVal+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not visible in the Appplication");
			reportStep("The element with id "+idVal+" is not visible in the Appplication", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idVal+" is not interactable in the application");
			reportStep("The element with id "+idVal+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException  e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not stable in the DOM");
			reportStep("The element with id "+idVal+" is not stable in the DOM", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id value "+idVal+" is not retured due to unknown error");
			reportStep("The element with id value "+idVal+" is not retured due to unknown error", "fail");
		}/*finally {
			takeSnap();
		}*/
		return gettext;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String gettextxpath=null;
		try {
			 String GetTextXpath = driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The element with xpath "+xpathVal+" is holding the text "+GetTextXpath);
			 reportStep("The element with xpath "+xpathVal+" is holding the text "+GetTextXpath, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the Appplication");
			reportStep("The element with xpath "+xpathVal+" is not visible in the Appplication", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException  e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not stable in the DOM", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath value "+xpathVal+" is not retured due to unknown error");
			reportStep("The element with xpath value "+xpathVal+" is not retured due to unknown error", "fail");
		}/*finally {
			takeSnap();
		}*/
		return gettextxpath;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown = driver.findElementById(id);
			Select sel = new Select(dropdown);
			sel.selectByVisibleText(value);
			//System.out.println("The element with id "+id+" is has been selected with visisble text value "+value);
			reportStep("The element with id "+id+" is has been selected with visisble text value "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the Appplication");
			reportStep("The element with id "+id+" is not visible in the Appplication", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException  e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the DOM");
			reportStep("The element with id "+id+" is not stable in the DOM", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" has been not selected "+value+" text due to unknown error");
			reportStep("The element with id "+id+" has been not selected "+value+" text due to unknown error", "fail");
		}/*finally {
			takeSnap();
		}*/
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdownIndex = driver.findElementById(id);
			Select sele = new Select(dropdownIndex);
			sele.selectByIndex(value);
			//System.out.println("The element with id "+id+" is has been selected using index number value "+value);
			reportStep("The element with id "+id+" is has been selected using index number value "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the Appplication");
			reportStep("The element with id "+id+" is not visible in the Appplication", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException  e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the DOM");
			reportStep("The element with id "+id+" is not stable in the DOM", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" has been not selected "+value+" text due to unknown error");
			reportStep("The element with id "+id+" has been not selected "+value+" text due to unknown error", "fail");
		}/*finally {
			takeSnap();
		}*/
	}

	public void switchToParentWindow() throws NoSuchWindowException {
		// TODO Auto-generated method stub
		
		try {
			
			Set<String> ParentWindowclick = driver.getWindowHandles();
			for(String eachId : ParentWindowclick ) {
				driver.switchTo().window(eachId);
				break;
			}
					
			//System.out.println("The browser window is switched to Parent Window");
			reportStep("The browser window is switched to Parent Window", "pass");
		}catch (StaleElementReferenceException  e) {
			// TODO: handle exception
			//System.err.println("The browser window is not stable in the DOM");
			reportStep("The browser window is not stable in the DOM", "fail");
		} catch (NoSuchWindowException e) {
			// TODO: handle exception
			//System.err.println("The browser window is unable to find the window on the web page to switch");
			reportStep("The browser window is unable to find the window on the web page to switch", "fail");
		}catch (WebDriverException e) {
		// TODO Auto-generated catch block
		//System.err.println("The browser window could not switched to Parent Window due to unknown error");
		reportStep("The browser window could not switched to Parent Window due to unknown error", "fail");
		}/*finally {
			takeSnap();
		}*/
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
			try {
				//driver.switchTo().defaultContent();
			Set<String> LastWindowclick = driver.getWindowHandles();
			for(String id : LastWindowclick ) {
				driver.switchTo().window(id);
			}
			
			//System.out.println("The browser window is switched to last Window");
			reportStep("The browser window is switched to last Window", "pass");
			}catch (StaleElementReferenceException  e) {
				// TODO: handle exception
				//System.err.println("The browser window is not stable in the DOM");
				reportStep("The browser window is not stable in the DOM", "fail");
			} catch (NoSuchWindowException e) {
				// TODO: handle exception
				//System.err.println("The browser window is unable to find the window on the web page to switch");
				reportStep("The browser window is unable to find the window on the web page to switch", "fail");
			}catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser window could not switched to last Window due to unknown error");
			reportStep("The browser window could not switched to last Window due to unknown error", "fail");
		}/*finally {
			takeSnap();
		}*/
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("The alert has been accepted sucessfully");
			reportStep("The alert has been accepted sucessfully", "pass");
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
			//System.err.println("The alert is switching to an invalid or non-existing alert pop-up");
			reportStep("The alert is switching to an invalid or non-existing alert pop-up", "fail");
		} 
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The alert couldn't accepted due to unknown error");
			reportStep("The alert couldn't accepted due to unknown error", "fail");
		}/*finally {
			takeSnap();
		}*/
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("The alert has been dismissed sucessfully");
			reportStep("The alert has been dismissed sucessfully", "pass");
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
			//System.err.println("The alert is switching to an invalid or non-existing alert pop-up");
			reportStep("The alert is switching to an invalid or non-existing alert pop-up", "fail");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The alert couldn't dismissed due to unknown error");
			reportStep("The alert couldn't dismissed due to unknown error", "fail");
		}/*finally {
			takeSnap();
		}*/
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String getalertText = "null";
		try {
			String alertText = driver.switchTo().alert().getText();
			//System.out.println("The information message displayed in AlertBox "+alertText+" is Printed Successfully");
			reportStep("The information message displayed in AlertBox "+alertText+" is Printed Successfully", "pass");
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
			//System.err.println("The alertbox is switching to an invalid or non-existing alert pop-up");
			reportStep("The alertbox is switching to an invalid or non-existing alert pop-up", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The alertbox is not available");
			reportStep("The alertbox is not available", "fail");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The information message displayed in AlertBox is not Printed due to unknown error");
			reportStep("The information message displayed in AlertBox is not Printed due to unknown error", "fail");
		}/*finally {
			takeSnap();
		}*/
		return getalertText;
	}

	public long takeSnap()  {
		// TODO Auto-generated method stub
		long number = 0;
		
		try {
			
			number = (long) (Math.floor(Math.random()*100000000)+100000);
			File temp = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./reports/screenshots/"+number+".png");
			//System.out.println("Screenshot of the current window is captured successfully");
			FileUtils.copyFile(temp, dest);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Screenshot is not taken due to unknown error");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return number;
				
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//reportStep("The current browser tab is closed successfully", "pass",false);
		}catch (NoSuchSessionException e) {
			// TODO Auto-generated catch block
			//System.err.println("The present browser window is not closed due to session error");
			reportStep("The present browser window is not closed due to session error", "fail");
		}catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The present browser window is not Closed properly due to unknown error");
			reportStep("The present browser window is not Closed properly due to unknown error", "fail");
		}
	}

	/*private void reportStep(String string, String string2) {
		// TODO Auto-generated method stub
		
	}*/

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//reportStep("The browser is closed successfully", "pass",false);
		} catch (NoSuchSessionException e) {
			// TODO Auto-generated catch block
			//System.err.println("All browser windows are not closed due to session error");
			reportStep("All browser windows are not closed due to session error", "fail");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("All browsers are not closed properly due to unknown error");
			reportStep("All browsers are not closed properly due to unknown error", "fail");
		}
		
	}

	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The thread is waiting");
			reportStep("The thread is waiting", "fail");
		}
	}

	public void enterXpathpagedown() {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
						
			}catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath is not visible in the application");
			reportStep("The element with xpath is not visible in the application", "fail");
			}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath is not interactable in the application");
			reportStep("The element with xpath is not interactable in the application", "fail");
			}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath is not found in the DOM");
			reportStep("The element with xpath is not found in the DOM", "fail");
			}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath is not stable in the application");
			reportStep("The element with xpath is not stable in the application", "fail");
			}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath is not entered with Data due to unknown error");
			reportStep("The element with xpath is not entered with Data due to unknown error", "fail");
			}/*finally {
			takeSnap();
			}*/
	}

	public void selectValueTextByXPath(String xpathVal, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown = driver.findElementByXPath(xpathVal);
			Select sel = new Select(dropdown);
			waitProperty(2000);
			sel.selectByValue(value);
			waitProperty(2000);
			//System.out.println("The element with xpath "+xpathVal+" is has been selected with visisble text value "+value);
			reportStep("The element with xpath "+xpathVal+" is has been selected with visisble text value "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the Appplication");
			reportStep("The element with xpath "+xpathVal+" is not visible in the Appplication", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException  e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not stable in the DOM", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" has been not selected "+value+" text due to unknown error");
			reportStep("The element with xpath "+xpathVal+" has been not selected "+value+" text due to unknown error", "fail");
		}/*finally {
			takeSnap();
		}*/
	}
	
	public void clickLinktext(String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(data).click();
			//System.out.println("The element with ID value " +data+ " is clicked");
			reportStep("The element with ID value " +data+ " is clicked", "pass");
			} catch (ElementClickInterceptedException e) {			
			// TODO Auto-generated catch block
			//System.err.println("The element with linktext "+data+" is not clickable");
			reportStep("The element with linktext "+data+" is not clickable", "fail");
			}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+data+" is not found in DOM");
			reportStep("The element with linktext "+data+" is not found in DOM", "fail");
			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element with linktext "+data+" is not visible in the application");
				reportStep("The element with linktext "+data+" is not visible in the application", "fail");
			}catch (StaleElementReferenceException  e) {
				// TODO: handle exception
				//System.err.println("The element with linktext "+data+" is not stable in the DOM");
				reportStep("The element with linktext "+data+" is not stable in the DOM", "fail");
			} catch (ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element with linktext "+data+" is not interactable in the application");
				reportStep("The element with linktext "+data+" is not interactable in the application", "fail");
			}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+data+" is not clicked due to unknown error");
			reportStep("The element with linktext "+data+" is not clicked due to unknown error", "fail");
			}/*finally {
			takeSnap();
		}*/
	}
	
	public void selectValueTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown2 = driver.findElementById(id);
			Select sele = new Select(dropdown2);
			//waitProperty(2000);
			sele.selectByValue(value);
			//System.out.println("The element with id "+id+" is has been selected with visisble text value "+value);
			reportStep("The element with id "+id+" is has been selected with visisble text value "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the Appplication");
			reportStep("The element with id "+id+" is not visible in the Appplication", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException  e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the DOM");
			reportStep("The element with id "+id+" is not stable in the DOM", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" has been not selected "+value+" text due to unknown error");
			reportStep("The element with id "+id+" has been not selected "+value+" text due to unknown error", "fail");
		}/*finally {
			takeSnap();
		}*/
	}
	
	public void selectFirstSelectedOption(String id) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown = driver.findElementById(id);
			Select sele = new Select(dropdown);
			//waitProperty(2000);
			sele.getFirstSelectedOption();
			//System.out.println("The element with id "+id+" is has been selected with visisble text value ");
			reportStep("The element with id "+id+" is has been selected with visisble text value ", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the Appplication");
			reportStep("The element with id "+id+" is not visible in the Appplication", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException  e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the DOM");
			reportStep("The element with id "+id+" is not stable in the DOM", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" has been not selected text due to unknown error");
			reportStep("The element with id "+id+" has been not selected text due to unknown error", "fail");
		}/*finally {
			takeSnap();
		}*/
	}
	public void selectValueTextByName(String name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown2 = driver.findElementByName(name);
			Select sele = new Select(dropdown2);
			//waitProperty(2000);
			sele.selectByValue(value);
			//System.out.println("The element with name "+name+" is has been selected with visisble text value "+value);
			reportStep("The element with name "+name+" is has been selected with visisble text value "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+" is not found in the DOM");
			reportStep("The element with name "+name+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not visible in the Appplication");
			reportStep("The element with name "+name+" is not visible in the Appplication", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+" is not interactable in the application");
			reportStep("The element with name "+name+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException  e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not stable in the DOM");
			reportStep("The element with name "+name+" is not stable in the DOM", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" has been not selected "+value+" text due to unknown error");
			reportStep("The element with name "+name+" has been not selected "+value+" text due to unknown error", "fail");
		}/*finally {
			takeSnap();
		}*/
	}
	
	public void selectFirstSelectedOptionXpath(String value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown = driver.findElementById(value);
			Select sele = new Select(dropdown);
			//waitProperty(2000);
			sele.getFirstSelectedOption();
			//System.out.println("The element with Xpath "+value+" is has been selected with visisble text value ");
			reportStep("The element with Xpath "+value+" is has been selected with visisble text value ", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath "+value+" is not found in the DOM");
			reportStep("The element with Xpath "+value+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+value+" is not visible in the Appplication");
			reportStep("The element with Xpath "+value+" is not visible in the Appplication", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath "+value+" is not interactable in the application");
			reportStep("The element with Xpath "+value+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException  e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+value+" is not stable in the DOM");
			reportStep("The element with Xpath "+value+" is not stable in the DOM", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+value+" has been not selected text due to unknown error");
			reportStep("The element with Xpath "+value+" has been not selected text due to unknown error", "fail");
		}/*finally {
			takeSnap();
		}*/
	}
	public void selectVisibileTextByXpath(String Xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown2 = driver.findElementByXPath(Xpath);
			Select sele = new Select(dropdown2);
			//waitProperty(2000);
			sele.selectByVisibleText(value);
			//System.out.println("The element with Xpath "+Xpath+" is has been selected with visisble text value "+value);
			reportStep("The element with Xpath "+Xpath+" is has been selected with visisble text value "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath "+Xpath+" is not found in the DOM");
			reportStep("The element with Xpath "+Xpath+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+Xpath+" is not visible in the Appplication");
			reportStep("The element with Xpath "+Xpath+" is not visible in the Appplication", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath "+Xpath+" is not interactable in the application");
			reportStep("The element with Xpath "+Xpath+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException  e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+Xpath+" is not stable in the DOM");
			reportStep("The element with Xpath "+Xpath+" is not stable in the DOM", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+Xpath+" has been not selected "+value+" text due to unknown error");
			reportStep("The element with Xpath "+Xpath+" has been not selected "+value+" text due to unknown error", "fail");
		}/*finally {
			takeSnap();
		}*/
	}
	}

	


