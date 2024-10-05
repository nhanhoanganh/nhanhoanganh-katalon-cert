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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.automationexercise.com/')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Products'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_Rs. 500Blue TopAdd to cart'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/a_Add to cart'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/button_Continue Shopping'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Cart'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Proceed To Checkout'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Checkout/u_Register  Login'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_New User Signup_name'), 'nhan. checkout')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_New User Signup_email'), 
    'checkout@cart.com')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/button_Signup'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Mr_title'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__password'), 'tzH6RvlfSTg=')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_Day123456789101112131415161718192021_40ab5b'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_MonthJanuaryFebruaryMarchAprilMayJun_aa9ebb'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_Year20212020201920182017201620152014_f874ed'), 
    '2021', true)

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Sign up for our newsletter'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/label_Receive special offers from our partners'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__first_name'), 'wq')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__last_name'), 'rt')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Company_company'), '12')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_(Street address, P.O. Box, Company na_957d3e'), 
    '123')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__state'), 'fr')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__city'), 'gh')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__zipcode'), '126')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__mobile_number'), '8765')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/button_Create Account'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Account Created/b_Account Created'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Account Created/a_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Cart'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Proceed To Checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/textarea_If you would like to add a comment_a4f199'), 
    'correct infor')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Place Order'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Payment/body_Home Products Cart Logout Delete Accou_4752c1'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Payment/input_Name on Card_name_on_card'), 'check out')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Payment/input_Card Number_card_number'), '543')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Payment/input_CVC_cvc'), '222')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Payment/input_Expiration_expiry_month'), '12')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Payment/input_Expiration_expiry_year'), '2-28')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Payment/button_Pay and Confirm Order'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Order Placed/p_Congratulations Your order has been confirmed'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Order Placed/a_Delete Account'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

