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
//3. Verify that home page is visible successfully
//4. Scroll down page to bottom
//5. Verify 'SUBSCRIPTION' is visible
//6. Scroll up page to top
//7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
// 1. Launch browser
WebUI.openBrowser('')

// 2. Navigate to url 'http://automationexercise.com'
WebUI.navigateToUrl('http://automationexercise.com')

// 3. Verify that home page is visible successfully
WebUI.verifyElementVisible(findTestObject('Page_Home'))

// 4. Scroll down page to bottom
WebUI.scrollToElement(findTestObject('Object_Subscription'))

// 5. Verify 'SUBSCRIPTION' is visible
WebUI.verifyElementVisible(findTestObject('Object_Subscription'))

// 6. Scroll up page to top
WebUI.scrollToElement(findTestObject('Object_Top'))

// 7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
WebUI.verifyElementVisible(findTestObject('Text_AutomationEngineers'))