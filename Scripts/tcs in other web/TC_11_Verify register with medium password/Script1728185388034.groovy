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

WebUI.callTestCase(findTestCase('tcs in other web/TC1_navigate to practice automation page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Automation Practice Site/a_My Account'))

WebUI.navigateToUrl('https://practice.automationtesting.in/my-account/')

WebUI.setText(findTestObject('Page_My Account  Automation Practice Site/input__email'), 'nhan2@gmail.com')

WebUI.setText(findTestObject('Page_My Account  Automation Practice Site/input__password'), 'nhanhoang12')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Account  Automation Practice Site/div_Medium'), 0)

WebUI.click(findTestObject('Page_My Account  Automation Practice Site/input_Anti-spam_register'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Account  Automation Practice Site/p_Hello nhan2 (not nhan2 Sign out)'), 
    0)

WebUI.closeBrowser()

