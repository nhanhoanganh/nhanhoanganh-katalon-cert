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
//3. Click on 'Products' button
//4. Verify that Brands are visible on left side bar
//5. Click on any brand name
//6. Verify that user is navigated to brand page and brand products are displayed
//7. On left side bar, click on any other brand link
//8. Verify that user is navigated to that brand page and can see products
// 1. Launch browser
WebUI.openBrowser('')

// 2. Navigate to url 'http://automationexercise.com'
WebUI.navigateToUrl('http://automationexercise.com')

// 3. Click on 'Products' button
WebUI.click(findTestObject('Page_Automation Exercise/button_Products'))

// 4. Verify that Brands are visible on left side bar
WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/sidebar_Brands'))

// 5. Click on any brand name
WebUI.click(findTestObject('Page_Automation Exercise/link_AnyBrandName'))

// 6. Verify that user is navigated to brand page and brand products are displayed
WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/brandProducts'))

// 7. On left side bar, click on any other brand link
WebUI.click(findTestObject('Page_Automation Exercise/link_OtherBrandName'))

// 8. Verify that user is navigated to that brand page and can see products
WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/otherBrandProducts'))