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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')


WebUI.verifyElementPresent(findTestObject('Object Repository/Appointment/Page_CURA Healthcare Service/a_Make Appointment'), 10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Book Appointment/Page_CURA Healthcare Service/a_Make Appointment'))



WebUI.verifyElementPresent(findTestObject('Object Repository/Book Appointment/Page_CURA Healthcare Service/button_Login'), 2)

WebUI.setText(findTestObject('Object Repository/Book Appointment/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setText(findTestObject('Object Repository/Book Appointment/Page_CURA Healthcare Service/input_Password_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Object Repository/Book Appointment/Page_CURA Healthcare Service/button_Login'))



WebUI.selectAllOption(findTestObject('Object Repository/Book Appointment/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center                            Hongkong CURA Healthcare Center                            Seoul CURA Healthcare Center'), FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Object Repository/Book Appointment/Page_CURA Healthcare Service/label_Apply for hospital readmission'))

WebUI.check(findTestObject('Object Repository/Book Appointment/Page_CURA Healthcare Service/label_Medicaid'))

WebUI.setText(findTestObject('Object Repository/Book Appointment/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'), '22-02-2024')

WebUI.setText(findTestObject('Object Repository/Book Appointment/Page_CURA Healthcare Service/textarea_Comment_comment'), 'Hallo')

WebUI.click(findTestObject('Object Repository/Book Appointment/Page_CURA Healthcare Service/button_Book Appointment'))

String actual_result_a = WebUI.getText(findTestObject('Object Repository/Book Appointment/Page_CURA Healthcare Service/label_Apply for hospital readmission'))

String actual_result_b = WebUI.getText(findTestObject('Object Repository/Book Appointment/Page_CURA Healthcare Service/label_Medicaid'))

WebUI.verifyMatch(actual_result_a, 'Checked', false)

WebUI.verifyMatch(actual_result_b, 'Medicaid', false)

WebUI.verifyElementPresent(findTestObject('Object Repository/Book Appointment/Page_CURA Healthcare Service/button_Book Appointment'), 2)