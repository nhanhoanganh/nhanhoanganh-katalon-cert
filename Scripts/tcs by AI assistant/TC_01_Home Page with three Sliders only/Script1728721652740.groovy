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

//1) Open the browser
//2) Enter the URL “http://practice.automationtesting.in/”
//3) Click on Shop Menu
//4) Now click on Home menu button
//5) Test whether the Home page has Three Sliders only
//6) The Home page must contains only three sliders
// Open the browser
WebUI.openBrowser('')

// Enter the URL "http://practice.automationtesting.in/"
WebUI.navigateToUrl('http://practice.automationtesting.in/')

// Click on Shop Menu
WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Shop'))

// Click on Home menu button
WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Home'))

// Test whether the Home page has Three Sliders only
WebUI.verifyElementVisible(findTestObject('Page_CURA Healthcare Service/div_ThreeSliders'), 10)

// The Home page must contains only three sliders
WebUI.verifyElementNotPresent(findTestObject('Page_CURA Healthcare Service/div_FourSliders'), 10)