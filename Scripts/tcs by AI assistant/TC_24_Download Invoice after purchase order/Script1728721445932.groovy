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
//4. Add products to cart
//5. Click 'Cart' button
//6. Verify that cart page is displayed
//7. Click Proceed To Checkout
//8. Click 'Register / Login' button
//9. Fill all details in Signup and create account
//10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
//11. Verify ' Logged in as username' at top
//12.Click 'Cart' button
//13. Click 'Proceed To Checkout' button
//14. Verify Address Details and Review Your Order
//15. Enter description in comment text area and click 'Place Order'
//16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
//17. Click 'Pay and Confirm Order' button
//18. Verify success message 'Your order has been placed successfully!'
//19. Click 'Download Invoice' button and verify invoice is downloaded successfully.
//20. Click 'Continue' button
//21. Click 'Delete Account' button
//22. Verify 'ACCOUNT DELETED!' and click 'Continue' button
// 1. Launch browser
WebUI.openBrowser('')

// 2. Navigate to url 'http://automationexercise.com'
WebUI.navigateToUrl('http://automationexercise.com')

// 3. Verify that home page is visible successfully
WebUI.verifyElementVisible(findTestObject('Page_Home'))

// 4. Add products to cart
WebUI.click(findTestObject('Button_AddToCart'))

// 5. Click 'Cart' button
WebUI.click(findTestObject('Button_Cart'))

// 6. Verify that cart page is displayed
WebUI.verifyElementVisible(findTestObject('Page_Cart'))

// 7. Click Proceed To Checkout
WebUI.click(findTestObject('Button_ProceedToCheckout'))

// 8. Click 'Register / Login' button
WebUI.click(findTestObject('Button_RegisterLogin'))

// 9. Fill all details in Signup and create account
WebUI.setText(findTestObject('Input_FirstName'), 'John')
WebUI.setText(findTestObject('Input_LastName'), 'Doe')
WebUI.setText(findTestObject('Input_Email'), 'johndoe@example.com')
WebUI.setText(findTestObject('Input_Password'), 'password123')
WebUI.setText(findTestObject('Input_ConfirmPassword'), 'password123')

// 10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
WebUI.verifyElementVisible(findTestObject('Text_AccountCreated'))
WebUI.click(findTestObject('Button_Continue'))

// 11. Verify ' Logged in as username' at top
WebUI.verifyElementVisible(findTestObject('Text_LoggedInAs'))

// 12. Click 'Cart' button
WebUI.click(findTestObject('Button_Cart'))

// 13. Click 'Proceed To Checkout' button
WebUI.click(findTestObject('Button_ProceedToCheckout'))

// 14. Verify Address Details and Review Your Order
WebUI.verifyElementVisible(findTestObject('Section_AddressDetails'))
WebUI.verifyElementVisible(findTestObject('Section_ReviewOrder'))

// 15. Enter description in comment text area and click 'Place Order'
WebUI.setText(findTestObject('Textarea_Comment'), 'This is a test comment')
WebUI.click(findTestObject('Button_PlaceOrder'))

// 16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
WebUI.setText(findTestObject('Input_NameOnCard'), 'John Doe')
WebUI.setText(findTestObject('Input_CardNumber'), '1234567890123456')
WebUI.setText(findTestObject('Input_CVC'), '123')
WebUI.setText(findTestObject('Input_ExpirationDate'), '12/23')

// 17. Click 'Pay and Confirm Order' button
WebUI.click(findTestObject('Button_PayConfirmOrder'))

// 18. Verify success message 'Your order has been placed successfully!'
WebUI.verifyElementVisible(findTestObject('Text_OrderSuccess'))

// 19. Click 'Download Invoice' button and verify invoice is downloaded successfully.
WebUI.click(findTestObject('Button_DownloadInvoice'))
// Verification of invoice download may require additional custom keyword

// 20. Click 'Continue' button
WebUI.click(findTestObject('Button_Continue'))

// 21. Click 'Delete Account' button
WebUI.click(findTestObject('Button_DeleteAccount'))

// 22. Verify 'ACCOUNT DELETED!' and click 'Continue' button
WebUI.verifyElementVisible(findTestObject('Text_AccountDeleted'))
WebUI.click(findTestObject('Button_Continue'))