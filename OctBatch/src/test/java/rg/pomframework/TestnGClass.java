package rg.pomframework;

import org.testng.annotations.Test;

public class TestnGClass extends BaseClass {
	BaseClass base = new BaseClass(); 
	RegisterPage reg = new RegisterPage();
	
	@Test
	private void tc1() {
		base.getChromeDriver();
		base.loadUrl("http://demo.automationtesting.in/Register.html");
	}
	@Test
	private void tc2() {
		base.textBox(reg.getlName(), "Vannan");
		base.textBox(reg.getfName(), "Mani");
		base.textBox(reg.getAddress(), "Chennai");
		base.textBox(reg.geteMail(), "t.manier404");
		
	}
	@Test
	private void tc3() {

	}
	@Test
	private void tc4() {

	}
	@Test
	private void tc5() {
		base.btnClick(reg.getSubmit());
		base.screenshot("reg");
	}
}
