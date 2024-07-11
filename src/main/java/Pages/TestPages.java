package Pages;

// Import necessary classes from Selenium and TestNG
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.security.Key;

import static ObjectsPath.TestHome.*; // Import all static fields (locators) from TestHome class

// Define the TestPages class
public class TestPages {
    WebDriver driver = null; // Declare WebDriver instance variable

    // Constructor to initialize WebDriver instance
    public TestPages(WebDriver driver) {
        this.driver = driver; // Assign WebDriver instance from parameter to local driver variable
    }

    // Method to open GitHub homepage
    public void OpenUrl (){
        driver.get("https://tuwaiq.edu.sa/"); // Navigate to GitHub URL
    }
    public void changeLanguage() {
        WebElement english = driver.findElement(language); // Find login button element
        english.click(); // Click on the login button
    }
    public void bootcampsCourses() {
        WebElement courses = driver.findElement(bootCamps); // Find login button element
        courses.click(); // Click on the login button
    }

    public void fitler() {
        WebElement filterClick = driver.findElement(filterIcon); // Find login button element
        filterClick.click(); // Click on the login button
    }

    public void location() {
        WebElement locationClick = driver.findElement(locationClickk); // Find login button element
        locationClick.click(); // Click on the login button
    }

    public void selectFromRegion() {
        WebElement lregionClick = driver.findElement(regionSelectRiyadh); // Find login button element
        lregionClick.click(); // Click on the login button
    }

    public void categorySelect() {
        WebElement categoryClick = driver.findElement(category); // Find login button element
        categoryClick.click(); // Click on the login button
    }

    public void searchIcons() {
        WebElement searchI = driver.findElement(searchBootcamps); // Find login button element
        searchI.click(); // Click on the login button
    }

    public void scrollToPosition(int x , int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(arguments[0], arguments[1]);",x, y);
    }
    public void searchDataa () throws InterruptedException {

       driver.findElement(searchWord).sendKeys("علم البيانات وتعلم الالة"); // Find email address field and enter email

       Thread.sleep(3000); // Pause execution for 3000 milliseconds (not recommended; use explicit waits instead)
       driver.findElement(searchWord).sendKeys(Keys.RETURN);
        boolean homepageview = driver.findElement(assertionDataScience).isDisplayed(); // Check if assertion element is displayed
      Assert.assertTrue(homepageview, "home page is not displayed!");
    }


/////bellow is for udacity
//    // Method to click on the login button on the home page
//    public void SearchBar() {
//        WebElement searchItem = driver.findElement(SearchBarElement); // Find login button element
//        searchItem.click(); // Click on the login button
//    }
//
//    public void LearnPress() {
//        WebElement learnItem = driver.findElement(learnClick); // Find login button element
//        learnItem.click(); // Click on the login button
//    }
//
//    // Method to enter login credentials and verify login
//    public void searchData () throws InterruptedException {
//
//        driver.findElement(SearchInputBar).sendKeys("data"); // Find email address field and enter email
//
//        // Thread.sleep(3000); // Pause execution for 3000 milliseconds (not recommended; use explicit waits instead)
//        driver.findElement(SearchInputBar).sendKeys(Keys.RETURN); // Find password field and enter password
//        // driver.findElement(signInBtn).click(); // Click on sign-in button
//
////        boolean homepageview = driver.findElement(assertionUponLogin).isDisplayed(); // Check if assertion element is displayed
////        Assert.assertTrue(homepageview, "home page is not displayed!"); // Assert that homepageview is true
//    }
//

}
