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

WebUI.navigateToUrl('https://automationexercise.com/')

WebUI.verifyElementPresent(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise/a_Home'), 0)

WebUI.click(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise/a_Signup  Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Signup  Login/h2_New User Signup'), 
    'New User Signup!')

WebUI.setText(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Signup  Login/input_New User Signup_name'), 
    'nhan2')

WebUI.setText(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Signup  Login/input_New User Signup_email'), 
    'nhantest@katalon.com')

WebUI.click(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Signup  Login/button_Signup'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Signup/b_Enter Account Information'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Signup/input_Mrs_title'))

WebUI.setText(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Signup/input__password'), 
    'nhan123')

WebUI.selectOptionByValue(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Signup/select_Day123456789101112131415161718192021_40ab5b'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Signup/select_MonthJanuaryFebruaryMarchAprilMayJun_aa9ebb'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Signup/select_Year20212020201920182017201620152014_f874ed'), 
    '2001', true)

WebUI.click(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Signup/label_Sign up for our newsletter'))

WebUI.click(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Signup/label_Receive special offers from our partners'))

WebUI.setText(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Signup/input__first_name'), 
    'nhan')

WebUI.setText(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Signup/input__last_name'), 
    'hoang')

WebUI.setText(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Signup/input_Company_company'), 
    'katalon')

WebUI.setText(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Signup/input_(Street address, P.O. Box, Company na_957d3e'), 
    'cmt8')

WebUI.setText(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Signup/input_Address 2_address2'), 
    '3/2')

WebUI.selectOptionByValue(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Signup/select_IndiaUnited StatesCanadaAustraliaIsr_09757b'), 
    'Canada', true)

WebUI.setText(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Signup/input__state'), 'abc')

WebUI.setText(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Signup/input__city'), 'xyz')

WebUI.setText(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Signup/input__zipcode'), 
    '12000')

WebUI.setText(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Signup/input__mobile_number'), 
    '0912827872')

WebUI.click(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Signup/button_Create Account'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Account Created/b_Account Created'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Account Created/a_Continue'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise/a_Logout'), 0)

WebUI.click(findTestObject('Object Repository/Automation_exercise/Page_Automation Exercise - Account Created/a_Continue'))

WebUI.closeBrowser()

