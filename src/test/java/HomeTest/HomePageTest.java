package HomeTest;

import Base.BaseClass;
import Pages.TestPages;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {


    @Test
    public void HomePageLoginMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();
       // homepage.SearchBar();
       // homepage.searchData();
       // homepage.LearnPress();
        homepage.changeLanguage();

        Thread.sleep(2000);

    }

    @Test
    public void tuwaiqTestMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();

        homepage.changeLanguage();
        Thread.sleep(2000);
        homepage.bootcampsCourses();
        Thread.sleep(2000);
        homepage.fitler();
        Thread.sleep(5000);
        homepage.searchIcons();
        Thread.sleep(5000);
        homepage.searchDataa();
        Thread.sleep(5000);
        homepage.location();
        Thread.sleep(5000);
        homepage.selectFromRegion();
        Thread.sleep(5000);
        homepage.categorySelect();
        Thread.sleep(5000);







    }



    @Test
    public void BootcampsMethods() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();

        homepage.changeLanguage();
        Thread.sleep(2000);
        homepage.bootcampsCourses();
        homepage.scrollToPosition(0,600);
        Thread.sleep(2000);




    }
}




