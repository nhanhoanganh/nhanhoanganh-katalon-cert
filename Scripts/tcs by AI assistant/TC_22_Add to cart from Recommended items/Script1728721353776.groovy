import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
//3. Scroll to bottom of page
//4. Verify 'RECOMMENDED ITEMS' are visible
//5. Click on 'Add To Cart' on Recommended product
//6. Click on 'View Cart' button
//7. Verify that product is displayed in cart page
// 1. Launch browser
WebUI.openBrowser('')

// 2. Navigate to url 'http://automationexercise.com'
WebUI.navigateToUrl('http://automationexercise.com')

// 3. Scroll to bottom of page
WebUI.scrollToElement(findTestObject('Page_automationexercise.com/Page_Automation Exercise/a_RECOMMENDED ITEMS'))

// 4. Verify 'RECOMMENDED ITEMS' are visible
WebUI.verifyElementVisible(findTestObject('Page_automationexercise.com/Page_Automation Exercise/a_RECOMMENDED ITEMS'), 10)

// 5. Click on 'Add To Cart' on Recommended product
WebUI.click(findTestObject('Page_automationexercise.com/Page_Automation Exercise/button_Add to cart'))

// 6. Click on 'View Cart' button
WebUI.click(findTestObject('Page_automationexercise.com/Page_Automation Exercise/button_View cart'))

// 7. Verify that product is displayed in cart page
WebUI.verifyElementVisible(findTestObject('Page_automationexercise.com/Page_Automation Exercise/div_Product in cart'), 10)