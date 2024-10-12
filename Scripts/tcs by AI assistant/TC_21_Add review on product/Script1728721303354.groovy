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
//4. Verify user is navigated to ALL PRODUCTS page successfully
//5. Click on 'View Product' button
//6. Verify 'Write Your Review' is visible
//7. Enter name, email and review
//8. Click 'Submit' button
//9. Verify success message 'Thank you for your review.'
// 1. Launch browser
WebUI.openBrowser('')

// 2. Navigate to url 'http://automationexercise.com'
WebUI.navigateToUrl('http://automationexercise.com')

// 3. Click on 'Products' button
WebUI.click(findTestObject('Page_Automation Exercise/button_Products'))

// 4. Verify user is navigated to ALL PRODUCTS page successfully
WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/text_ALL PRODUCTS'))

// 5. Click on 'View Product' button
WebUI.click(findTestObject('Page_Automation Exercise/button_View Product'))

// 6. Verify 'Write Your Review' is visible
WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/text_Write Your Review'))

// 7. Enter name, email and review
WebUI.setText(findTestObject('Page_Automation Exercise/input_Name'), 'John Doe')
WebUI.setText(findTestObject('Page_Automation Exercise/input_Email'), 'johndoe@example.com')
WebUI.setText(findTestObject('Page_Automation Exercise/textarea_Review'), 'This product is great!')

// 8. Click 'Submit' button
WebUI.click(findTestObject('Page_Automation Exercise/button_Submit'))

// 9. Verify success message 'Thank you for your review.'
WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/text_Thank you for your review.'))