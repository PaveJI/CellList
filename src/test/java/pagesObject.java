import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pagesObject {

        @FindBy(xpath ="//*[@id=\"gwt-debug-contentPanel\"]/div[2]/div/div[2]/div/div[3]/div/div/div/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/div/div/table/tbody/tr[2]/td[2]/input")
        public WebElement firstNameLabel;

        @FindBy(xpath ="//*[@id=\"gwt-debug-contentPanel\"]/div[2]/div/div[2]/div/div[3]/div/div/div/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/div/div/table/tbody/tr[3]/td[2]/input")
        public WebElement lastName;

        @FindBy(className = "gwt-ListBox")
        public WebElement category;

        @FindBy(xpath ="//*[@id=\"gwt-debug-contentPanel\"]/div[2]/div/div[2]/div/div[3]/div/div/div/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/div/div/table/tbody/tr[5]/td[2]/input")
        public WebElement dirthDay;

        @FindBy(xpath ="//*[@id=\"gwt-debug-contentPanel\"]/div[2]/div/div[2]/div/div[3]/div/div/div/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/div/div/table/tbody/tr[6]/td[2]/textarea")
        public WebElement address;

        @FindBy(linkText ="Create Contact")
        public WebElement createContractButton;

        @FindBy(linkText ="Generate 50 Contacts")
        public WebElement create50ContractButton;

        @FindBy(linkText ="Update Contact")
        public WebElement updateContractButton;

        @FindBy(className ="GNHGC04CJJ")
        public WebElement cellList;

}
