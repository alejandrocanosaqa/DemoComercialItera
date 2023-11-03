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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://pruebasqafenix.com/')

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('Object Repository/IniciarSesionEnTiendaVirtual/Page_Inicio -/button_Aceptar'))

WebUI.click(findTestObject('Object Repository/IniciarSesionEnTiendaVirtual/Page_Inicio -/a_Mi Cuenta'))

WebUI.setText(findTestObject('Object Repository/IniciarSesionEnTiendaVirtual/Page_Mi Cuenta -/input__username'), 'tejonloco0@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/IniciarSesionEnTiendaVirtual/Page_Mi Cuenta -/input__password'), 
    'SsTbB7FmLcVcexv/GALMDg==')

WebUI.click(findTestObject('Object Repository/IniciarSesionEnTiendaVirtual/Page_Mi Cuenta -/button_Acceder'))

WebUI.verifyElementText(findTestObject('Object Repository/IniciarSesionEnTiendaVirtual/Page_Mi Cuenta -/p_Hola Sonia (no eres Sonia Cerrar sesin)'), 
    'Hola Sonia (¿no eres Sonia? Cerrar sesión)')

WebUI.click(findTestObject('Object Repository/IniciarSesionEnTiendaVirtual/Page_Mi Cuenta -/a_Pedidos'))

WebUI.click(findTestObject('Object Repository/IniciarSesionEnTiendaVirtual/Page_Mi Cuenta -/a_Tarjetas regalo'))

WebUI.click(findTestObject('Object Repository/IniciarSesionEnTiendaVirtual/Page_Mi Cuenta -/a_Descargas'))

WebUI.click(findTestObject('Object Repository/IniciarSesionEnTiendaVirtual/Page_Mi Cuenta -/a_Direcciones'))

WebUI.click(findTestObject('Object Repository/IniciarSesionEnTiendaVirtual/Page_Mi Cuenta -/a_Detalles de la cuenta'))

WebUI.click(findTestObject('Object Repository/IniciarSesionEnTiendaVirtual/Page_Mi Cuenta -/a_Escritorio'))

WebUI.click(findTestObject('Object Repository/IniciarSesionEnTiendaVirtual/Page_Mi Cuenta -/a_Salir'))

WebUI.closeBrowser()

