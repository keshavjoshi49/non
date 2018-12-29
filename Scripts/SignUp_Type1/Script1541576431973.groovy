import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://beta.luminela.com/signup?type=1')

WebUI.click(findTestObject('Object Repository/signup/Page_Luminello - Create a New Accou/span_Select your profession'))

WebUI.setText(findTestObject('Object Repository/signup/Page_Luminello - Create a New Accou/input_Select your profession_c'), 
    'ps')

WebUI.click(findTestObject('Object Repository/signup/Page_Luminello - Create a New Accou/span_Psychiatrist'))

WebUI.setText(findTestObject('Object Repository/signup/Page_Luminello - Create a New Accou/input_Select your profession_f'), 
    'test')

WebUI.setText(findTestObject('Object Repository/signup/Page_Luminello - Create a New Accou/input_Select your profession_l'), 
    'test')

not_run: WebUI.setText(findTestObject('Object Repository/signup/Page_Luminello - Create a New Accou/input_Your name must match the'), 
    'md')

not_run: WebUI.click(findTestObject('Object Repository/signup/Page_Luminello - Create a New Accou/em_MD'))

WebUI.setText(findTestObject('Object Repository/signup/Page_Luminello - Create a New Accou/input_here_email_address'), 'keshav+type1joshiDB@luminello.com')

WebUI.setText(findTestObject('Object Repository/signup/Page_Luminello - Create a New Accou/input_here_re_email_address'), 
    'keshav+type1joshiDB@luminello.com')

WebUI.setText(findTestObject('Object Repository/signup/Page_Luminello - Create a New Accou/input_Your email will not be d'), 
    'type1joshiDB')

WebUI.setEncryptedText(findTestObject('Object Repository/signup/Page_Luminello - Create a New Accou/input_Username is available._p'), 
    'e/67DRTm+TMi7R2rUaYGrQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/signup/Page_Luminello - Create a New Accou/input_Username is available._r'), 
    'e/67DRTm+TMi7R2rUaYGrQ==')

WebUI.setText(findTestObject('Object Repository/signup/Page_Luminello - Create a New Accou/input_concat(I  m under someon'), 
    'test')

WebUI.click(findTestObject('Object Repository/signup/Page_Luminello - Create a New Accou/span_License State'))

WebUI.click(findTestObject('Object Repository/signup/Page_Luminello - Create a New Accou/li_Alabama'))

WebUI.click(findTestObject('Object Repository/signup/Page_Luminello - Create a New Accou/span_License Expiration - Mont'))

WebUI.click(findTestObject('Object Repository/signup/Page_Luminello - Create a New Accou/span_January'))

WebUI.click(findTestObject('Object Repository/signup/Page_Luminello - Create a New Accou/span_Day'))

WebUI.click(findTestObject('Object Repository/signup/Page_Luminello - Create a New Accou/li_1'))

WebUI.click(findTestObject('Object Repository/signup/Page_Luminello - Create a New Accou/span_Year'))

WebUI.click(findTestObject('Object Repository/signup/Page_Luminello - Create a New Accou/span_2023'))

not_run: WebUI.click(findTestObject('Object Repository/signup/Page_Luminello - Create a New Accou/label_Please send me email not'))

WebUI.click(findTestObject('Object Repository/signup/Page_Luminello - Create a New Accou/label_I have read and agree to'))

