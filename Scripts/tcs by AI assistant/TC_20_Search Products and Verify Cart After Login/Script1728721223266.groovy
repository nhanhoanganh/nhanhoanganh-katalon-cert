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
//5. Enter product name in search input and click search button
//6. Verify 'SEARCHED PRODUCTS' is visible
//7. Verify all the products related to search are visible
//8. Add those products to cart
//9. Click 'Cart' button and verify that products are visible in cart
//10. Click 'Signup / Login' button and submit login details
//11. Again, go to Cart page
//12. Verify that those products are visible in cart after login as well
// 1. Launch browser
WebUI.openBrowser('')

// 2. Navigate to url 'http://automationexercise.com'
WebUI.navigateToUrl('http://automationexercise.com')

// 3. Click on 'Products' button
WebUI.click(findTestObject('Page_Automation Exercise/button_Products'))

// 4. Verify user is navigated to ALL PRODUCTS page successfully
WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/text_ALL PRODUCTS'))

// 5. Enter product name in search input and click search button
WebUI.setText(findTestObject('Page_Automation Exercise/input_Search'), 'Product Name')
WebUI.click(findTestObject('Page_Automation Exercise/button_Search'))

// 6. Verify 'SEARCHED PRODUCTS' is visible
WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/text_SEARCHED PRODUCTS'))

// 7. Verify all the products related to search are visible
WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/text_Product1'))
WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/text_Product2'))
// Add more verifyElementVisible for other products if needed

// 8. Add those products to cart
WebUI.click(findTestObject('Page_Automation Exercise/button_AddToCart_Product1'))
WebUI.click(findTestObject('Page_Automation Exercise/button_AddToCart_Product2'))
// Add more click for other products if needed

// 9. Click 'Cart' button and verify that products are visible in cart
WebUI.click(findTestObject('Page_Automation Exercise/button_Cart'))
WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/text_Product1_InCart'))
WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/text_Product2_InCart'))
// Add more verifyElementVisible for other products in cart if needed

// 10. Click 'Signup / Login' button and submit login details
WebUI.click(findTestObject('Page_Automation Exercise/button_SignupLogin'))
WebUI.setText(findTestObject('Page_Automation Exercise/input_Username'), 'username')
WebUI.setText(findTestObject('Page_Automation Exercise/input_Password'), 'password')
WebUI.click(findTestObject('Page_Automation Exercise/button_Login'))

// 11. Again, go to Cart page
WebUI.click(findTestObject('Page_Automation Exercise/button_Cart'))

// 12. Verify that those products are visible in cart after login as well
WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/text_Product1_InCart'))
WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/text_Product2_InCart'))
// Add more verifyElementVisible for other products in cart if needed