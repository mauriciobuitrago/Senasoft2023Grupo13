package pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.booking.com/")
public class LoginPage extends PageObject {

    By BTN_HEADER = By.xpath("//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561']");
    By BTN_LOGGIN = By.xpath("//a[@class='a83ed08757 c21c56c305 bf0537ecb5 ab98298258 deab83296e af7297d90d']");
    By TXT_GMAIL = By.xpath("//input[@name='username']");
    By BTN_CONFIRMAR = By.xpath("//button[@class='Iiab0gVMeWOd4XcyJGA3 wPxWIS_rJCpwAWksE0s3 Ut3prtt_wDsi7NM_83Jc TuDOVH9WFSdot9jLyXlw EJWUAldA4O1mP0SSFXPm whxYYRnvyHGyGqxO4ici']");
    By TXT_PASSWORD = By.xpath("//input[@name='password']");
    By LOGINNED = By.xpath("//button[@class='Iiab0gVMeWOd4XcyJGA3 wPxWIS_rJCpwAWksE0s3 Ut3prtt_wDsi7NM_83Jc TuDOVH9WFSdot9jLyXlw EJWUAldA4O1mP0SSFXPm whxYYRnvyHGyGqxO4ici']");
    By LBL_VALIDATE = By.xpath("//h3[text()='¿Eres un robot?']");



    public By getBTN_HEADER() {
        return BTN_HEADER;
    }

    public void setBTN_HEADER(By BTN_HEADER) {
        this.BTN_HEADER = BTN_HEADER;
    }

    public By getBTN_LOGGIN() {
        return BTN_LOGGIN;
    }

    public void setBTN_LOGGIN(By BTN_LOGGIN) {
        this.BTN_LOGGIN = BTN_LOGGIN;
    }

    public By getTXT_GMAIL() {
        return TXT_GMAIL;
    }

    public void setTXT_GMAIL(By TXT_GMAIL) {
        this.TXT_GMAIL = TXT_GMAIL;
    }

    public By getBTN_CONFIRMAR() {
        return BTN_CONFIRMAR;
    }

    public void setBTN_CONFIRMAR(By BTN_CONFIRMAR) {
        this.BTN_CONFIRMAR = BTN_CONFIRMAR;
    }

    public By getTXT_PASSWORD() {
        return TXT_PASSWORD;
    }

    public void setTXT_PASSWORD(By TXT_PASSWORD) {
        this.TXT_PASSWORD = TXT_PASSWORD;
    }

    public By getLOGINNED() {
        return LOGINNED;
    }

    public void setLOGINNED(By LOGINNED) {
        this.LOGINNED = LOGINNED;
    }
    public By getLBL_VALIDATE() {
        return LBL_VALIDATE;
    }

    public void setLBL_VALIDATE(By LBL_VALIDATE) {
        this.LBL_VALIDATE = LBL_VALIDATE;
    }
}