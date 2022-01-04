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

WebUI.click(findTestObject('Object Repository/PositiveCaseRoundTrip/Page_Cheap Flights  Tickets Lowest Price wi_79e933/input_Round-Trip_r-1p0dtai r-1ei5mc7 r-1pi2_987bc4'))

WebUI.click(findTestObject('Object Repository/PositiveCaseRoundTrip/Page_Cheap Flights  Tickets Lowest Price wi_79e933/input_Return Date_css-11aywtz r-13awgt0 r-1_74dde6'))

WebUI.click(findTestObject('Object Repository/PositiveCaseRoundTrip/Page_Cheap Flights  Tickets Lowest Price wi_79e933/div_Sun_css-1dbjc4n r-1f720gc r-184en5c'))

WebUI.click(findTestObject('Object Repository/PositiveCaseRoundTrip/Page_Cheap Flights  Tickets Lowest Price wi_79e933/div_Search'))

WebUI.closeBrowser()

