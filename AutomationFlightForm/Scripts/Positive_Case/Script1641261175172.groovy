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

WebUI.navigateToUrl('https://m.traveloka.com/en-id/flight')

WebUI.click(findTestObject('Object Repository/PositiveCase/Page_Cheap Flights  Tickets Lowest Price wi_79e933/input_From_css-11aywtz r-13awgt0 r-1sixt3s _a6b6b0'))

WebUI.click(findTestObject('Object Repository/PositiveCase/Page_Cheap Flights  Tickets Lowest Price wi_79e933/div_Jakarta, IndonesiaJKTA - All Airports i_3328ed'))

WebUI.click(findTestObject('Object Repository/PositiveCase/Page_Cheap Flights  Tickets Lowest Price wi_79e933/input_From_css-11aywtz r-13awgt0 r-1sixt3s _a6b6b0'))

WebUI.setText(findTestObject('Object Repository/PositiveCase/Page_Cheap Flights  Tickets Lowest Price wi_79e933/input_BDJ - Syamsudin Noor_css-11aywtz r-13_61b320'), 
    'padang')

WebUI.click(findTestObject('Object Repository/PositiveCase/Page_Cheap Flights  Tickets Lowest Price wi_79e933/span_, Indonesia'))

WebUI.click(findTestObject('Object Repository/PositiveCase/Page_Cheap Flights  Tickets Lowest Price wi_79e933/body_Want Rp50k off good foodDownload Trave_a6ac46'))

WebUI.click(findTestObject('Object Repository/PositiveCase/Page_Cheap Flights  Tickets Lowest Price wi_79e933/div_5'))

WebUI.click(findTestObject('Object Repository/PositiveCase/Page_Cheap Flights  Tickets Lowest Price wi_79e933/body_Want Rp50k off good foodDownload Trave_a6ac46_1'))

WebUI.click(findTestObject('Object Repository/PositiveCase/Page_Cheap Flights  Tickets Lowest Price wi_79e933/img'))

WebUI.click(findTestObject('Object Repository/PositiveCase/Page_Cheap Flights  Tickets Lowest Price wi_79e933/div_Select'))

WebUI.click(findTestObject('Object Repository/PositiveCase/Page_Cheap Flights  Tickets Lowest Price wi_79e933/body_Want Rp50k off good foodDownload Trave_a6ac46_1_2'))

WebUI.click(findTestObject('Object Repository/PositiveCase/Page_Cheap Flights  Tickets Lowest Price wi_79e933/div_An affordable way to fly, with tasty me_a22512'))

WebUI.click(findTestObject('Object Repository/PositiveCase/Page_Cheap Flights  Tickets Lowest Price wi_79e933/div_Select'))

WebUI.click(findTestObject('Object Repository/PositiveCase/Page_Cheap Flights  Tickets Lowest Price wi_79e933/div_Search'))

WebUI.closeBrowser()

