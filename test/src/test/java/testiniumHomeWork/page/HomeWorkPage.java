package testiniumHomeWork.page;

import org.openqa.selenium.WebDriver;
import testiniumHomeWork.Base.BasePage;

import java.time.Duration;

import static testiniumHomeWork.constants.ConstanstPage.*;

public class HomeWorkPage extends BasePage {
    public HomeWorkPage(WebDriver driver) {
        super(driver);
    }
    public HomeWorkPage checkDefaultSelected()
    {
        checkselected(otel_control);
        return this;
    }
    public HomeWorkPage checkURL()
    {
        checkurl(url);
        return this;
    }
    public HomeWorkPage click() throws InterruptedException {
        click(popupclose);
        click(cookiesaccept);
        return this;
    }
    public HomeWorkPage writeantalya() throws InterruptedException {
        writethewheretogo(where_to_go);
        click(where_to_go);
        click(first_item);
        return this;
    }
    public HomeWorkPage datechoose() throws InterruptedException {
        choosedate(how_long_stay);
        click(date_next_button);
        Thread.sleep(500);
        click(date_next_button);
        Thread.sleep(500);
        hover(first_day);
        Thread.sleep(500);
        click(first_day);
        click(last_day);
        return this;
    }
    public HomeWorkPage increaseaduolt() throws InterruptedException {
        click(how_many_people);
        click(increment_button);
        cheeckNumber(adoult_number);
        return this;
    }
    public HomeWorkPage clicksearchbutton() throws InterruptedException {
        click(search_button);
        return this;
    }
    public HomeWorkPage containsantalya()
    {
        checkurlcontains(antalya);
        return this;
    }
    public HomeWorkPage randomchoose() throws InterruptedException {
        click(show_other_area);
        checknumber(randomchooseforarea(random_area),locator_of_number);
        return this;
    }

}
