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
//4. Click on 'Signup / Login' button
//5. Verify 'New User Signup!' is visible
//6. Enter name and email address
//7. Click 'Signup' button
//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
//9. Fill details: Title, Name, Email, Password, Date of birth
//10. Select checkbox 'Sign up for our newsletter!'
//11. Select checkbox 'Receive special offers from our partners!'
//12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
//13. Click 'Create Account button'
//14. Verify that 'ACCOUNT CREATED!' is visible
//15. Click 'Continue' button
//16. Verify that 'Logged in as username' is visible
//17. Click 'Delete Account' button
//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
// 1. Launch browser
WebUI.openBrowser('')

// 2. Navigate to url 'http://automationexercise.com'
WebUI.navigateToUrl('http://automationexercise.com')

// 3. Verify that home page is visible successfully
WebUI.verifyElementVisible(findTestObject('Page_Home Page'), 10)

// 4. Click on 'Signup / Login' button
WebUI.click(findTestObject('Button_Signup_Login'))

// 5. Verify 'New User Signup!' is visible
WebUI.verifyElementVisible(findTestObject('Text_New_User_Signup'), 10)

// 6. Enter name and email address
WebUI.setText(findTestObject('Input_Name'), 'John Doe')
WebUI.setText(findTestObject('Input_Email'), 'johndoe@example.com')

// 7. Click 'Signup' button
WebUI.click(findTestObject('Button_Signup'))

// 8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
WebUI.verifyElementVisible(findTestObject('Text_Enter_Account_Info'), 10)

// 9. Fill details: Title, Name, Email, Password, Date of birth
WebUI.setText(findTestObject('Input_Title'), 'Mr.')
WebUI.setText(findTestObject('Input_Name'), 'John Doe')
WebUI.setText(findTestObject('Input_Email'), 'johndoe@example.com')
WebUI.setText(findTestObject('Input_Password'), 'password123')
WebUI.setText(findTestObject('Input_DOB'), '01/01/1990')

// 10. Select checkbox 'Sign up for our newsletter!'
WebUI.check(findTestObject('Checkbox_Newsletter'))

// 11. Select checkbox 'Receive special offers from our partners!'
WebUI.check(findTestObject('Checkbox_Special_Offers'))

// 12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
WebUI.setText(findTestObject('Input_First_Name'), 'John')
WebUI.setText(findTestObject('Input_Last_Name'), 'Doe')
WebUI.setText(findTestObject('Input_Company'), 'ABC Company')
WebUI.setText(findTestObject('Input_Address'), '123 Main Street')
WebUI.setText(findTestObject('Input_Address2'), 'Apt 101')
WebUI.setText(findTestObject('Input_Country'), 'United States')
WebUI.setText(findTestObject('Input_State'), 'California')
WebUI.setText(findTestObject('Input_City'), 'Los Angeles')
WebUI.setText(findTestObject('Input_Zipcode'), '90001')
WebUI.setText(findTestObject('Input_Mobile'), '1234567890')

// 13. Click 'Create Account button'
WebUI.click(findTestObject('Button_Create_Account'))

// 14. Verify that 'ACCOUNT CREATED!' is visible
WebUI.verifyElementVisible(findTestObject('Text_Account_Created'), 10)

// 15. Click 'Continue' button
WebUI.click(findTestObject('Button_Continue'))

// 16. Verify that 'Logged in as username' is visible
WebUI.verifyElementVisible(findTestObject('Text_Logged_In'), 10)

// 17. Click 'Delete Account' button
WebUI.click(findTestObject('Button_Delete_Account'))

// 18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
WebUI.verifyElementVisible(findTestObject('Text_Account_Deleted'), 10)
WebUI.click(findTestObject('Button_Continue'))