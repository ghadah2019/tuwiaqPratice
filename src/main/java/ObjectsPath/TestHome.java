package ObjectsPath;

// Import necessary classes from Selenium
import org.openqa.selenium.By;


// Define the TestHome class
public class TestHome {

    // Locator for the login button in the home page
   public static final By language = By.xpath("html/body/main/div/nav[2]/div[2]/button[1]");

    public static final By bootCamps = By.xpath("/html/body/main/div/nav[2]/div[1]/div/div/ul/li[2]/a");
    public static final By filterIcon = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[1]/div[1]/button/img");
    public static final By searchBootcamps = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[2]/div/div/div[3]/input");
    public static final By locationClickk = By.xpath("//*[@id='regionSelect']");
    public static final By searchWord = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[2]/div/div/div[3]/input");
    public static final By regionSelectRiyadh = By.xpath("//*[@id='regionSelect']/option[2]");
    public static final By assertionDataScience = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[3]/div/div/div[1]/h2");
    public static final By category = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[1]/div[2]/button[2]");

    ///html/body/main/div/nav[2]/div[2]/button[1]

    ///bellow is for udacity

    //    public static final By learnClick = By.xpath("//button[@id='popover-trigger-:R1l669l5t6H1:']");
//
// public static final By SearchBarElement = By.xpath("//button[@class='chakra-button css-13yc6xg']/preceding::div[@class='css-0']");
//    // Locator for the email address input field in the login form
//    public static final By SearchInputBar = By.xpath("//*[@id='app-header']/div[1]/div[2]/div[2]/div/div/div/input");
//    // Locator for the password input field in the login form
//    public static final By passwordLogin = By.xpath("//*[@id='password']");
//
//    // Locator for the sign in button in the login form
//    public static final By signInBtn = By.xpath("//*[@id='login']/div[4]/form/div/input[13]");
//
//    // Locator for an element to assert upon successful login
//    public static final By assertionUponLogin = By.xpath("//*[@id='dashboard']/div/feed-container/div[1]/div/a");

}
