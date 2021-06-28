package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Steps {
	
	ChromeDriver driver;
	
	@Given("Abrir Chrome")
	public void abrir_Chrome() {
		System.out.println("En este paso abre el navegador Googel Chrome");
		System.setProperty("webdriver.chrome.driver", "D:\\Ingenieria en informatica\\Evaluaciones\\02_Integracion Continua\\Evaluacion 2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("D:\\Ingenieria en informatica\\Evaluaciones\\02_Integracion Continua\\Evaluacion 2\\Login.html");
	}
	
	@When("Ingresa Username {string} y Password {string}")
	public void ingresa_Username_y_Password(String string, String string2) {
		System.out.println("En este paso ingrese las credenciales de usuario");
		System.out.println("En este paso ingrese el nombre de usuario y contraseña en la pagina Login");
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
	}
	
	@Then("Incicia sesión")
	public void inicia_sesion() {
		System.out.println("En este paso inicia sesión con los datos ingresados desde nuestro archivo Mytest.feature");
		driver.findElement(By.id("loginbtn")).click();
	}

}
