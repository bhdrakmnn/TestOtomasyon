package testiniumHomeWork.test;

import org.junit.Before;
import org.junit.Test;
import testiniumHomeWork.Base.BaseTest;
import testiniumHomeWork.page.HomeWorkPage;

public class HomeWorkTest extends BaseTest {
    HomeWorkPage homeWorkPage;
    @Before
    public void before()
    {
        homeWorkPage=new HomeWorkPage(getWebdriver());
    }
    @Test
    public void test() throws InterruptedException {
        homeWorkPage.click().checkURL().checkDefaultSelected().writeantalya().datechoose().increaseaduolt().clicksearchbutton().containsantalya().randomchoose();
    }
}
