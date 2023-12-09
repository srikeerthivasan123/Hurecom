package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clients extends Baseclass {

	public Clients() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/app-root/div[1]/app-side-bar/div/div/div/div[2]/ul/li[7]/a")
	public WebElement clients;

	@FindBy(xpath = "(//a[@role='presentation'])[2]")
	public WebElement jobopenings;

	@FindBy(xpath = "//button[@type='button']")
	public WebElement createjob;

	@FindBy(xpath = "//input[@type='text']")
	public WebElement jobid;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	public WebElement jobrequirement;

	@FindBy(xpath = "//input[@formcontrolname='noOfPositions']")
	public WebElement noofpositon;

	@FindBy(xpath = " (//input[@type='text'])[3]")
	public WebElement designation;

	@FindBy(xpath = " //div[@role='button']")
	public WebElement client;

	@FindBy(xpath = " //li[@role='option']")
	public WebElement clientbutton;

	@FindBy(xpath = "//div[@class='p-multiselect-trigger']")
	public WebElement clientlocaton;

	@FindBy(xpath = "//div[@class='p-checkbox-box']")
	public WebElement clientlocaionbt;

	@FindBy(xpath = "(//div[@class='p-multiselect-trigger'])[2]")
	public WebElement ClientSPOCs;

	@FindBy(xpath = "//div[@class='p-checkbox-box']")
	public WebElement ClientSPOCname;

	@FindBy(xpath = " //input[@formcontrolname='maxCostToCompany']")
	public WebElement maximumctc;

	@FindBy(xpath = "(//input[contains(@class,'p-inputtext p-component')])[6]")
	public WebElement minexperience;

	@FindBy(xpath = "(//input[contains(@class,'p-inputtext p-component')])[7]")
	public WebElement maxexperience;

	@FindBy(xpath = "(//div[@role='button'])[2]")
	public WebElement Status;

	@FindBy(xpath = "//li[@role='option']")
	public WebElement statusoption;

	@FindBy(xpath = "(//div[@role='button'])[3]")
	public WebElement statusgroup;

	@FindBy(xpath = "//li[@role='option']")
	public WebElement statusgroupotions;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	public WebElement skillsset;

	@FindBy(className = "ql-editor")
	public WebElement jobdescription;

	@FindBy(xpath = "(//div[@class='p-multiselect-trigger'])[3]")
	public WebElement assign;

	@FindBy(xpath = "(//div[@class='p-checkbox-box'])[3]")
	public WebElement Assingoptions;

	@FindBy(xpath = "//input[@formcontrolname='billDurationInDays']")
	public WebElement billduration;

	@FindBy(xpath = "(//div[@role='button'])[4]")
	public WebElement commission;

	@FindBy(xpath = "//li[@role='option']")
	public WebElement commissionfixed;

	@FindBy(xpath = "//input[@formcontrolname='rateOfCommission']")
	public WebElement rateofcommission;

	@FindBy(xpath = "(//div[@role='button'])[5]")
	public WebElement qualityaudit;

	@FindBy(xpath = "(//li[@role='option'])[2]")
	public WebElement qualityauditbutton;

	@FindBy(xpath = "(//button[@type='button'])[4]")
	public WebElement addatachment;

	@FindBy(xpath = "(//button[@type='button'])[6]")
	public WebElement createbt;

	@FindBy(xpath = "(//button[@type='button'])[5]")
	public WebElement resetbt;

	@FindBy(xpath = "(//button[@type='button'])[1]")
	public WebElement bold;

	@FindBy(xpath = "(//button[@type='button'])[2]")
	public WebElement italic;

	@FindBy(xpath = "(//button[@type='button'])[3]")
	public WebElement underline;

	@FindBy(xpath = "(//button[@type='button'])[7]")
	public WebElement okbt;

	@FindBy(xpath = "//div[@class='message']")
	public WebElement errormsg;

	@FindBy(xpath = "//i[@class='pi pi-pencil']")
	public WebElement updateteam;

	@FindBy(xpath = "(//button[@type='button'])[5]")
	public WebElement updatebt;

	@FindBy(xpath = "(//a[@role='presentation'])[3]")
	public WebElement exporttemplates;

	@FindBy(xpath = "//button[@type='button']")
	public WebElement createexportbutton;

	@FindBy(xpath = "//input[@type='text']")
	public WebElement templatename;

	@FindBy(xpath = "//div[@role='button']")
	public WebElement exportstatus;

	@FindBy(xpath = "//li[@role='option']")
	public WebElement statusactive;

	@FindBy(xpath = "//button[@type='button']")
	public WebElement pickfields;

	@FindBy(xpath = "(//div[@role='checkbox'])[1]")
	public WebElement selectallfields;

	@FindBy(xpath = "(//button[@type='button'])[4]")
	public WebElement applyfields;

	@FindBy(xpath = "(//button[@type='button'])[2]")
	public WebElement Sumbitfields;

	@FindBy(xpath = "(//button[@type='button'])[3]")
	public WebElement successfields;

	@FindBy(xpath = "//i[@class='pi pi-pencil']")
	public WebElement updatefields;

	@FindBy(xpath = "//i[@class='pi pi-trash']")
	public WebElement candidatenamefield;

	@FindBy(xpath = "(//i[@class='pi pi-trash'])[2]")
	public WebElement mobilenumberfield;

	@FindBy(xpath = "(//i[@class='pi pi-trash'])[11]")
	public WebElement designationfield;

	@FindBy(xpath = "(//i[@class='pi pi-trash'])[12]")
	public WebElement workexperience;

	@FindBy(xpath = "(//i[@class='pi pi-trash'])[33]")
	public WebElement recutiername;

	@FindBy(xpath = "(//i[@class='pi pi-trash'])[32]")
	public WebElement accepted;

	@FindBy(xpath = "(//div[@role='checkbox'])[2]")
	public WebElement candiatepickfields;

	@FindBy(xpath = "(//div[@role='checkbox'])[3]")
	public WebElement mobilenumberpickfields;

	@FindBy(xpath = "(//div[@role='checkbox'])[4]")
	public WebElement emailpickfields;

	@FindBy(xpath = "(//div[@role='checkbox'])[5]")
	public WebElement gender;

	@FindBy(xpath = "(//a[@role='presentation'])[4]")
	public WebElement dummyfields;

	@FindBy(xpath = "//button[@type='button']")
	public WebElement createdummyfield;

	@FindBy(xpath = "//input[contains(@class,'p-inputtext p-component')]")
	public WebElement dummyfieldname;

	@FindBy(xpath = "(//button[@type='button'])[2]")
	public WebElement createdummyfieldname;

	@FindBy(xpath = "(//button[@type='button'])[3]")
	public WebElement Okbuttondummyfieldscreation;

	@FindBy(xpath = "(//button[contains(@class,'p-ripple p-element')])[3]")
	public WebElement errorokbuttonfordummyfields;

	@FindBy(xpath = "//div[text()='Dummy Field already exists.']")
	public WebElement errormessageindummyfields;

	@FindBy(xpath = "//div[text()='Export Template Name already exists.']")
	public WebElement errormessageexporttemplates;

	@FindBy(xpath = "(//button[@type='button'])[3]")
	public WebElement okbtforerrortemplate;

	@FindBy(xpath = "(//a[@role='presentation'])[5]")
	public WebElement statusbt;

 	@FindBy(xpath = "//i[@class='pi pi-copy']")
 	public WebElement statuscopybt;
 
 	@FindBy(xpath = "(//input[@type='text'])[2]")
 	public WebElement statusgroupname;
 
 	@FindBy(xpath = "(//button[@type='button'])[7]")
 	public WebElement statusclonebtn;
 	
 	@FindBy(xpath = "(//button[@type='button'])[6]")
 	public WebElement  clonesuccess;
 	
 	@FindBy(xpath="(//i[@class='pi pi-pencil'])[8]")
 	public WebElement editbuttonstatus8;
 
 	public WebElement getEditbuttonstatus8() {
		return editbuttonstatus8;
	}

	@FindBy(xpath = "(//i[@class='pi pi-pencil'])[7]")
 	public WebElement editbuttonstatus;
 
 	@FindBy(xpath = "//div[@role='button']")
 	public WebElement statusgroupdropdown;
 
 	@FindBy(xpath = "(//li[@role='option'])[3]")
 	public WebElement noresposnsestatusbt;
 
 	@FindBy(xpath = "(//li[@role='option'])[4]")
 	public WebElement notintersetedstatusgroupbt;
 
 	@FindBy(xpath = "(//button[@type='button'])[2]")
 	public WebElement  creatastatusbt;
 
 	@FindBy(xpath = "(//input[@type='text'])[3]")
 	public WebElement enterstatusname;
 
 	@FindBy(xpath = "(//button[contains(@class,'p-ripple p-element')])[3]")
 	public WebElement savestatusbt;
  
 	@FindBy(xpath = "(//button[@type='button'])[3]")
 	public WebElement successokbt;
 
 	@FindBy(xpath = "//input[@type='text']")
 	public WebElement updategroupname;
 
 	@FindBy(xpath = "//button[@type='button']")
 	public WebElement updatestatusbt;
 
 	@FindBy(xpath="//span[@class='p-tabview-title ng-star-inserted']")
 	public WebElement lookupname;
 
 	@FindBy(xpath="(//button[@type='button'])[3]")
 	public WebElement updatesuccessokbt;

 

 

 

 



	public WebElement getUpdatesuccessokbt() {
		return updatesuccessokbt;
	}



	public WebElement getLookupname() {
		return lookupname;
	}



	public WebElement getUpdatestatusbt() {
		return updatestatusbt;
	}



	public WebElement getUpdategroupname() {
		return updategroupname;
	}



	public WebElement getSuccessokbt() {
		return successokbt;
	}



	public WebElement getSavestatusbt() {
		return savestatusbt;
	}



	public WebElement getEnterstatusname() {
		return enterstatusname;
	}



	public WebElement getCreatastatusbt() {
		return creatastatusbt;
	}



	public WebElement getNotintersetedstatusgroupbt() {
		return notintersetedstatusgroupbt;
	}

 

	public WebElement getNoresposnsestatusbt() {
		return noresposnsestatusbt;
	}

	public WebElement getStatusgroupdropdown() {
		return statusgroupdropdown;
	}

	public WebElement getEditbuttonstatus() {
		return editbuttonstatus;
	}

	public WebElement getClonesuccess() {
		return clonesuccess;
	}

	public WebElement getStatusclonebtn() {
		return statusclonebtn;
	}

	public WebElement getStatusgroupname() {
		return statusgroupname;
	}

	public WebElement getStatuscopybt() {
		return statuscopybt;
	}

	public WebElement getOkbtforerrortemplate() {
		return okbtforerrortemplate;
	}

	public WebElement getStatusbt() {
		return statusbt;
	}

	public WebElement getErrormessageexporttemplates() {
		return errormessageexporttemplates;
	}

	public WebElement getErrormessageindummyfields() {
		return errormessageindummyfields;
	}

	public WebElement getErrorokbuttonfordummyfields() {
		return errorokbuttonfordummyfields;
	}

	public WebElement getOkbuttondummyfieldscreation() {
		return Okbuttondummyfieldscreation;
	}

	public WebElement getCreatedummyfieldname() {
		return createdummyfieldname;
	}

	public WebElement getDummyfields() {
		return dummyfields;
	}

	public WebElement getCreatedummyfield() {
		return createdummyfield;
	}

	public WebElement getDummyfieldname() {
		return dummyfieldname;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getCandiatepickfields() {
		return candiatepickfields;
	}

	public WebElement getMobilenumberpickfields() {
		return mobilenumberpickfields;
	}

	public WebElement getEmailpickfields() {
		return emailpickfields;
	}

	public WebElement getRecutiername() {
		return recutiername;
	}

	public WebElement getAccepted() {
		return accepted;
	}

	public WebElement getUpdatefields() {
		return updatefields;
	}

	public WebElement getCandidatenamefield() {
		return candidatenamefield;
	}

	public WebElement getMobilenumberfield() {
		return mobilenumberfield;
	}

	public WebElement getDesignationfield() {
		return designationfield;
	}

	public WebElement getWorkexperience() {
		return workexperience;
	}

	public WebElement getSuccessfields() {
		return successfields;
	}

	public WebElement getExporttemplates() {
		return exporttemplates;
	}

	public WebElement getCreateexportbutton() {
		return createexportbutton;
	}

	public WebElement getTemplatename() {
		return templatename;
	}

	public WebElement getExportstatus() {
		return exportstatus;
	}

	public WebElement getStatusactive() {
		return statusactive;
	}

	public WebElement getPickfields() {
		return pickfields;
	}

	public WebElement getSelectallfields() {
		return selectallfields;
	}

	public WebElement getApplyfields() {
		return applyfields;
	}

	public WebElement getSumbitfields() {
		return Sumbitfields;
	}

	public WebElement getUpdatebt() {
		return updatebt;
	}

	public WebElement getUpdateteam() {
		return updateteam;
	}

	public WebElement getOkbt() {
		return okbt;
	}

	public WebElement getErrormsg() {
		return errormsg;
	}

	public WebElement getCreatebt() {
		return createbt;
	}

	public WebElement getResetbt() {
		return resetbt;
	}

	public WebElement getBold() {
		return bold;
	}

	public WebElement getItalic() {
		return italic;
	}

	public WebElement getUnderline() {
		return underline;
	}

	public WebElement getAddatachment() {
		return addatachment;
	}

	public WebElement getClientlocaton() {
		return clientlocaton;
	}

	public WebElement getClientlocaionbt() {
		return clientlocaionbt;
	}

	public WebElement getClientSPOCs() {
		return ClientSPOCs;
	}

	public WebElement getClientSPOCname() {
		return ClientSPOCname;
	}

	public WebElement getMaximumctc() {
		return maximumctc;
	}

	public WebElement getMinexperience() {
		return minexperience;
	}

	public WebElement getMaxexperience() {
		return maxexperience;
	}

	public WebElement getStatus() {
		return Status;
	}

	public WebElement getStatusoption() {
		return statusoption;
	}

	public WebElement getStatusgroup() {
		return statusgroup;
	}

	public WebElement getStatusgroupotions() {
		return statusgroupotions;
	}

	public WebElement getSkillsset() {
		return skillsset;
	}

	public WebElement getJobdescription() {
		return jobdescription;
	}

	public WebElement getAssign() {
		return assign;
	}

	public WebElement getAssingoptions() {
		return Assingoptions;
	}

	public WebElement getBillduration() {
		return billduration;
	}

	public WebElement getCommission() {
		return commission;
	}

	public WebElement getCommissionfixed() {
		return commissionfixed;
	}

	public WebElement getRateofcommission() {
		return rateofcommission;
	}

	public WebElement getQualityaudit() {
		return qualityaudit;
	}

	public WebElement getQualityauditbutton() {
		return qualityauditbutton;
	}

	public WebElement getJobopenings() {
		return jobopenings;
	}

	public WebElement getCreatejob() {
		return createjob;
	}

	public WebElement getJobid() {
		return jobid;
	}

	public WebElement getJobrequirement() {
		return jobrequirement;
	}

	public WebElement getNoofpositon() {
		return noofpositon;
	}

	public WebElement getDesignation() {
		return designation;
	}

	public WebElement getClient() {
		return client;
	}

	public WebElement getClientbutton() {
		return clientbutton;
	}

	public WebElement getClients() {
		return clients;
	}

//	driver.findElement(By.xpath("/html/body/app-root/div[1]/app-side-bar/div/div/div/div[2]/ul/li[7]/a")).click();

}
