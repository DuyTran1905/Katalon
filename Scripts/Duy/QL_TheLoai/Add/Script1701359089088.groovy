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

WebUI.navigateToUrl('https://localhost:44350/Admin/Login/')

WebUI.setText(findTestObject('Object Repository/Duy/QL_TheLoai/Add/Page_ng nhp - Nh Sch Phng Nam/input_userName'), 'admin1')

WebUI.click(findTestObject('Object Repository/Duy/QL_TheLoai/Add/Page_ng nhp - Nh Sch Phng Nam/label_Mt khu'))

WebUI.setEncryptedText(findTestObject('Object Repository/Duy/QL_TheLoai/Add/Page_ng nhp - Nh Sch Phng Nam/input_passWord'), 
    'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/Duy/QL_TheLoai/Add/Page_ng nhp - Nh Sch Phng Nam/button_ng nhp'))

WebUI.click(findTestObject('Object Repository/Duy/QL_TheLoai/Add/Page_Trang qun l - Hiu Sch ng Triu/a_Qun l sch'))

WebUI.click(findTestObject('Object Repository/Duy/QL_TheLoai/Add/Page_Trang qun l - Hiu Sch ng Triu/a_Danh sch th loi'))

WebUI.click(findTestObject('Object Repository/Duy/QL_TheLoai/Add/Page_Trang qun l - Hiu Sch ng Triu/a_Thm th lai mi'))

WebUI.setText(findTestObject('Object Repository/Duy/QL_TheLoai/Add/Page_Trang qun l - Hiu Sch ng Triu/input_TenTheloai'), 
    Data)

WebUI.click(findTestObject('Object Repository/Duy/QL_TheLoai/Add/Page_Trang qun l - Hiu Sch ng Triu/input_Status'))

WebUI.setText(findTestObject('Object Repository/Duy/QL_TheLoai/Add/Page_Trang qun l - Hiu Sch ng Triu/input_NguoiTao'), 
    'admin1')

WebUI.click(findTestObject('Object Repository/Duy/QL_TheLoai/Add/Page_Trang qun l - Hiu Sch ng Triu/input_btn btn-primary btn-sm'))

WebUI.verifyElementText(findTestObject('Object Repository/Duy/QL_TheLoai/Add/Page_Trang qun l - Hiu Sch ng Triu/span_Thm thnh cng'), 
    'Thêm thành công')

WebUI.closeBrowser()

