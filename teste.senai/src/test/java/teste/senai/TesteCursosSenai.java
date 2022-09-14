package teste.senai;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCursosSenai {
	//representa o navegador
	private WebDriver driver;
	
	//método pre-teste
	@Before 
	public void ConfigurarTeste() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aline\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	//método teste
	@Test
	public void TesteNavegabilidadeEnter() {
		this.driver.get("https://informatica.sp.senai.br/");
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("Excel");
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys(Keys.ENTER);
	}
	public void TesteNavegabilidadeBotao() {
		this.driver.get("https://informatica.sp.senai.br/");
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("Excel");
		driver.findElement(By.id("Busca1_btnBusca")).click();
	}
	
}
