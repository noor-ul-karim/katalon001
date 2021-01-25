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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\nukdb\\Documents\\SQA\\katalon\\Android-NativeDemoApp-0.2.1.apk', true)

Mobile.tap(findTestObject('Object Repository/SignUp Case/android.widget.TextView - '), 0)

Mobile.tap(findTestObject('Object Repository/SignUp Case/android.widget.TextView - Sign up (1)'), 0)

Mobile.setText(findTestObject('Object Repository/SignUp Case/android.widget.EditText - Email (1)'), 'hello12@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/SignUp Case/android.widget.EditText - Password (1)'), '12345678', 0)

Mobile.setText(findTestObject('Object Repository/SignUp Case/android.widget.EditText - Confirm password (1)'), '12345678', 
    0)

Mobile.tap(findTestObject('Object Repository/SignUp Case/android.widget.TextView - SIGN UP (2)'), 0)

Mobile.closeApplication()