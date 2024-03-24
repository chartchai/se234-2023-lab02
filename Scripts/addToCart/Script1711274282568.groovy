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

WebUI.navigateToUrl('http://3.88.113.10:3000/login')

WebUI.setText(findTestObject('Object Repository/AddTocart/Page_Document/input_Login_username'), 'customer')

WebUI.setEncryptedText(findTestObject('Object Repository/AddTocart/Page_Document/input_Login_password'), '8OjkA1xEfzI=')

WebUI.click(findTestObject('login/Page_Document/button_Log In'))

WebUI.click(findTestObject('Object Repository/AddTocart/Page_SereneStyle/a_WOMEN'))

WebUI.click(findTestObject('Object Repository/AddTocart/Page_SereneStyle/img_search_rounded-lg'))

WebUI.click(findTestObject('Object Repository/AddTocart/Page_SereneStyle/button_Add To Cart'))

WebUI.click(findTestObject('Object Repository/AddTocart/Page_SereneStyle/svg_CONTACT_w-6 h-6'))

WebUI.click(findTestObject('Object Repository/AddTocart/Page_SereneStyle/p_Your Cart'))

