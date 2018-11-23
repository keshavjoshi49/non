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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Add_chart/Page_Luminello - Dashboard/a_Charts'))

WebUI.click(findTestObject('Object Repository/Add_chart/Page_Luminello - Patient Search/a_Add a Chart'))

WebUI.setText(findTestObject('Object Repository/Add_chart/Page_Luminello - Patient Info/input_First Name _first_name'), 
    'Basic')

WebUI.setText(findTestObject('Object Repository/Add_chart/Page_Luminello - Patient Info/input_Last Name _last_name'), 'chart')

WebUI.setText(findTestObject('Object Repository/Add_chart/Page_Luminello - Patient Info/input_Middle Init_middle_name'), 
    'm')

WebUI.click(findTestObject('Object Repository/Add_chart/Page_Luminello - Patient Info/a_Select Gender'))

WebUI.click(findTestObject('Object Repository/Add_chart/Page_Luminello - Patient Info/li_Male'))

WebUI.setText(findTestObject('Object Repository/Add_chart/Page_Luminello - Patient Info/input_Address_address'), 'Address 1')

WebUI.setText(findTestObject('Object Repository/Add_chart/Page_Luminello - Patient Info/input_City_city'), 'City 1')

not_run: WebUI.click(findTestObject('Object Repository/Add_chart/Page_Luminello - Patient Info/span_Alabama'))

WebUI.setText(findTestObject('Object Repository/Add_chart/Page_Luminello - Patient Info/input_Zip Code_zip'), '11001')

WebUI.setText(findTestObject('Object Repository/Add_chart/Page_Luminello - Patient Info/input_Cell_phone_number'), '12365447899')

WebUI.setText(findTestObject('Object Repository/Add_chart/Page_Luminello - Patient Info/input_DOB_birth_date'), '01/02/1989')

WebUI.setText(findTestObject('Object Repository/Add_chart/Page_Luminello - Patient Info/input_Critical Info_critical_i'), 
    'My Critical info')

WebUI.setText(findTestObject('Object Repository/Add_chart/Page_Luminello - Patient Info/textarea_Comments_comments'), 'my comments')

WebUI.click(findTestObject('Object Repository/Add_chart/Page_Luminello - Patient Info/button_Save'))

