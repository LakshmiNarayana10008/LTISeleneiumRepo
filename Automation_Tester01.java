public class Automation_tester1
{
	WebDriver driver;
	@Test
	public class LoginPage()
	{
		System.setProperty("webdriver.chrome.driver","F:\\Narayana\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://mail.rediiff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("userName")).sendKeys("Narayana");
		driver.findElement(By.id("Password")).sendKeys("Narayana");
		driver.findElement(By.id("proceed")).click();
	}
}