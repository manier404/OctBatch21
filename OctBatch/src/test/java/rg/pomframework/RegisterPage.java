package rg.pomframework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POJO class
//-->Private variable
//-->getters and setters--> indirect access to the locators
//-->constructors
public class RegisterPage extends BaseClass {
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);//Constructor
	}
	
	@FindBy (xpath = "//input[@placeholder='First Name']")
	private WebElement fName; //-->Private variable
	@FindBy (xpath = "//input[@placeholder='Last Name']")
	private WebElement lName; //-->Private variable
	@FindBy (xpath = "//textarea[@ng-model='Adress']")
	private WebElement address; //-->Private variable
	@FindBy (xpath = "//input[@type='email']")
	private WebElement eMail; //-->Private variable
	@FindBy (xpath = "//input[@type='tel']")
	private WebElement phNum; //-->Private variable
	@FindBy (xpath = "//input[@value='Male']")
	private WebElement gender; //-->Private variable
	@FindBy (xpath = "//input[@id='checkbox2']")
	private WebElement hobbies; //-->Private variable
	@FindBy (xpath = "//button[@type='launguage']")
	private WebElement launguage; //-->Private variable
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement submit; //-->Private variable
	
	
	public WebElement getLaunguage() {		return launguage;}
	public void setLaunguage(WebElement launguage) {		this.launguage = launguage;	}
	//getters and setters --> indirect acces to private variable 
	public WebElement getfName() 			{		return fName;	}
	public void setfName(WebElement fName) 	{		this.fName = fName;	}
	public WebElement getlName() 			{		return lName;	}
	public void setlName(WebElement lName)  {		this.lName = lName;	}
	public WebElement getAddress() 			{		return address;	}
	public void setAddress(WebElement address) {		this.address = address;	}
	public WebElement geteMail() 			{		return eMail;	}
	public void seteMail(WebElement eMail)  {		this.eMail = eMail;	}
	public WebElement getPhNum()  			{		return phNum;	}
	public void setPhNum(WebElement phNum) 	{		this.phNum = phNum;	}
	public WebElement getGender() 			{		return gender;	}
	public void setGender(WebElement gender){		this.gender = gender;	}
	public WebElement getHobbies() 			{		return hobbies;	}
	public void setHobbies(WebElement hobbies) {	this.hobbies = hobbies;	}
	public WebElement getSubmit() 			{		return submit;	}
	public void setSubmit(WebElement submit){		this.submit = submit;	}
	
	

}
