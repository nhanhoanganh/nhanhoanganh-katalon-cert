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
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://automationexercise.com/')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Contact us'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise - Contact Us/h2_Get In Touch'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Contact Us/input_Get In Touch_name'), 'nhan')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Contact Us/input_Get In Touch_email'), 'nhantest@katalon.com')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Contact Us/input_Get In Touch_subject'), 'verify contact form')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Contact Us/textarea_Get In Touch_message'), 'ad')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))

WebDriver driver = DriverFactory.getWebDriver()

WebUI.waitForAlert(0)

WebUI.verifyAlertPresent(0)

driver.switchTo().alert().accept()

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Automation Exercise - Contact Us/div_Success Your details have been submitte_fc584e'))

WebUI.closeBrowser()

