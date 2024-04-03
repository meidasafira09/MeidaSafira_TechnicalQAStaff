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

// Open web browser
WebUI.openBrowser('')

// Mazimize window
WebUI.maximizeWindow()

// Go to URL
WebUI.navigateToUrl(GlobalVariable.BaseUrl)

// Click menu Login
WebUI.click(findTestObject('Login_PageObject/menu_Login'))

// Input valid email and password
WebUI.setText(findTestObject('Login_PageObject/field_email'), GlobalVariable.email)

WebUI.setText(findTestObject('Login_PageObject/field_password'), GlobalVariable.password)

// Click button Login
WebUI.click(findTestObject('Login_PageObject/btn_Login'))

// Click menu account
WebUI.click(findTestObject('Login_PageObject/menu_account'))

// Click menu Logout
WebUI.click(findTestObject('Logout_PageObject/menu_logout'))

// Verify that we have logged out
WebUI.verifyElementVisible(findTestObject('Login_PageObject/menu_Login'))


// Close browser
WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

