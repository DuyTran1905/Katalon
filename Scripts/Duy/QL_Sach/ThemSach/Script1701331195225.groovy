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

WebUI.setText(findTestObject('Object Repository/Duy/QL_Sach/Add/Page_ng nhp - Nh Sch Phng Nam/input_userName'), 'admin1')

WebUI.setEncryptedText(findTestObject('Object Repository/Duy/QL_Sach/Add/Page_ng nhp - Nh Sch Phng Nam/input_passWord'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/Duy/QL_Sach/Add/Page_ng nhp - Nh Sch Phng Nam/button_ng nhp'))

WebUI.click(findTestObject('Object Repository/Duy/QL_Sach/Add/Page_Trang qun l - Hiu Sch ng Triu/a_Qun l sch'))

WebUI.click(findTestObject('Object Repository/Duy/QL_Sach/Add/Page_Trang qun l - Hiu Sch ng Triu/a_Danh sch sn phm'))

WebUI.click(findTestObject('Object Repository/Duy/QL_Sach/Add/Page_Trang qun l - Hiu Sch ng Triu/a_Thm sn phm mi'))

WebUI.setText(findTestObject('Object Repository/Duy/QL_Sach/Add/Page_Trang qun l - Hiu Sch ng Triu/input_Name'), TenSach)

WebUI.setText(findTestObject('Object Repository/Duy/QL_Sach/Add/Page_Trang qun l - Hiu Sch ng Triu/input_TacGia'), TacGia)

WebUI.setText(findTestObject('Object Repository/Duy/QL_Sach/Add/Page_Trang qun l - Hiu Sch ng Triu/input_NhaXuatBan'), NXB)

WebUI.setText(findTestObject('Object Repository/Duy/QL_Sach/Add/Page_Trang qun l - Hiu Sch ng Triu/textarea_Mota'), MoTa)

WebUI.click(findTestObject('Object Repository/Duy/QL_Sach/Add/Page_Trang qun l - Hiu Sch ng Triu/div_Gi Bn ()                               _0ea6bd'))

WebUI.setText(findTestObject('Object Repository/Duy/QL_Sach/Add/Page_Trang qun l - Hiu Sch ng Triu/input_GiaTien'), GiaBan)

WebUI.setText(findTestObject('Object Repository/Duy/QL_Sach/Add/Page_Trang qun l - Hiu Sch ng Triu/input_GiaNhap'), GiaNhap)

WebUI.setText(findTestObject('Object Repository/Duy/QL_Sach/Add/Page_Trang qun l - Hiu Sch ng Triu/input_PriceSale'), '0')

WebUI.click(findTestObject('Object Repository/Duy/QL_Sach/Add/Page_Trang qun l - Hiu Sch ng Triu/a_Chn nh'))

WebUI.switchToWindowTitle('CKFinder 2')

WebUI.click(findTestObject('Object Repository/Duy/QL_Sach/Add/Page_CKFinder 2/div'))

WebUI.click(findTestObject('Object Repository/Duy/QL_Sach/Add/Page_CKFinder 2/div'))

WebUI.switchToWindowTitle('CKFinder 2')

WebUI.click(findTestObject('Object Repository/Duy/QL_Sach/Add/Page_CKFinder 2/div'))

WebUI.doubleClick(findTestObject('Object Repository/Duy/QL_Sach/Add/Page_CKFinder 2/div'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Duy/QL_Sach/Add/Page_Trang qun l - Hiu Sch ng Triu/select_Chn th loiKhoa HcTiu ThuytTr Chi in _bb7f90'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Duy/QL_Sach/Add/Page_Trang qun l - Hiu Sch ng Triu/input_Status'))

WebUI.click(findTestObject('Object Repository/Duy/QL_Sach/Add/Page_Trang qun l - Hiu Sch ng Triu/input_btn btn-primary btn-sm'))

WebUI.closeBrowser()

