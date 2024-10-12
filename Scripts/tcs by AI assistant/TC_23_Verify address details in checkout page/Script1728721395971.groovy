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
//4. Click 'Signup / Login' button
//5. Fill all details in Signup and create account
//6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
//7. Verify ' Logged in as username' at top
//8. Add products to cart
//9. Click 'Cart' button
//10. Verify that cart page is displayed
//11. Click Proceed To Checkout
//12. Verify that the delivery address is same address filled at the time registration of account
//13. Verify that the billing address is same address filled at the time registration of account
//14. Click 'Delete Account' button
//15. Verify 'ACCOUNT DELETED!' and click 'Continue' button
// 1. Launch browser
WebUI.openBrowser('')

// 2. Navigate to url 'http://automationexercise.com'
WebUI.navigateToUrl('http://automationexercise.com')

// 3. Verify that home page is visible successfully
WebUI.verifyElementVisible(findTestObject('Page_Home'))

// 4. Click 'Signup / Login' button
WebUI.click(findTestObject('Button_SignupLogin'))

// 5. Fill all details in Signup and create account
WebUI.setText(findTestObject('Input_FirstName'), 'John')
WebUI.setText(findTestObject('Input_LastName'), 'Doe')
WebUI.setText(findTestObject('Input_Email'), 'johndoe@example.com')
WebUI.setText(findTestObject('Input_Password'), 'password123')
WebUI.setText(findTestObject('Input_ConfirmPassword'), 'password123')
WebUI.click(findTestObject('Button_CreateAccount'))

// 6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
WebUI.verifyElementVisible(findTestObject('Text_AccountCreated'))
WebUI.click(findTestObject('Button_Continue'))

// 7. Verify ' Logged in as username' at top
WebUI.verifyElementVisible(findTestObject('Text_LoggedInAs'))

// 8. Add products to cart
WebUI.click(findTestObject('Button_AddToCart'))

// 9. Click 'Cart' button
WebUI.click(findTestObject('Button_Cart'))

// 10. Verify that cart page is displayed
WebUI.verifyElementVisible(findTestObject('Page_Cart'))

// 11. Click Proceed To Checkout
WebUI.click(findTestObject('Button_ProceedToCheckout'))

// 12. Verify that the delivery address is same address filled at the time registration of account
WebUI.verifyElementText(findTestObject('Text_DeliveryAddress'), 'John Doe, johndoe@example.com, Address')

// 13. Verify that the billing address is same address filled at the time registration of account
WebUI.verifyElementText(findTestObject('Text_BillingAddress'), 'John Doe, johndoe@example.com, Address')

// 14. Click 'Delete Account' button
WebUI.click(findTestObject('Button_DeleteAccount'))

// 15. Verify 'ACCOUNT DELETED!' and click 'Continue' button
WebUI.verifyElementVisible(findTestObject('Text_AccountDeleted'))
WebUI.click(findTestObject('Button_Continue'))