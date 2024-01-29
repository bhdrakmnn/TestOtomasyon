package testiniumHomeWork.constants;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.pagefactory.ByAll;

import java.util.ArrayList;
import java.util.List;

public class ConstanstPage {
    public static final By otel_control= By.xpath("(//*[@class=\"sc-5391ca11-0 hxzxnh\"]/button)[1]/span");
    public static final By popupclose=By.className("ins-close-button");
    public static final By cookiesaccept=By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    public static final String url="https://www.setur.com.tr/";
    public static final String antalya="antalya";
    public static final By where_to_go=By.xpath("//*[@placeholder=\"Otel Adı Veya Konum\"]");
    public static final By first_item= By.xpath("(//*[@class=\"sc-94dcce44-3 cmIbdD\"])[1]");
    public static final By how_long_stay=By.xpath("((//*[@class=\"sc-d78bffa1-1 hPPmzY\"])[2]/span)[2]");
    public static final By date_next_button=By.xpath("//*[@class=\"sc-8de9de7b-0 kCGMge sc-147d3380-2 cULZMP\"]");
    public static final By first_day=By.xpath("(((//*[@class=\"CalendarMonth_verticalSpacing CalendarMonth_verticalSpacing_1\"])[3]/tbody/tr)[1]/td)[1]");
    public static final By last_day=By.xpath("(((//*[@class=\"CalendarMonth_verticalSpacing CalendarMonth_verticalSpacing_1\"])[3]/tbody/tr)[1]/td)[7]");
    public static final By how_many_people=By.xpath("//*[@class=\"sc-b2c3f6ee-18 bRTqaJ\"]");
    public static final By increment_button=By.xpath("(//*[@data-testid=\"increment-button\"])[1]");
    public static final By adoult_number=By.xpath("(//*[@class=\"sc-423a98f0-2 kxWULs\"])[1]");
    public static final By search_button=By.xpath("//*[@class=\"sc-8de9de7b-0 dYTYAP\"]");
    public static final By show_other_area=By.xpath("//*[@class=\"sc-2569635-7 dSWwPj\"]");
    public static final By random_area=By.xpath("(//*[@class=\"sc-e4b3cd20-2 kCeBES\"])");
    public static final By locator_of_number=By.xpath("(//*[@class=\"sc-21021e1e-3 eqVmWj\"])[1]");
}
