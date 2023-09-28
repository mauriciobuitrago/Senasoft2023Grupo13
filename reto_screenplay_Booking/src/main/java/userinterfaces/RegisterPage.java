package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {

    public static final Target BTN_SALIR = Target.the("Dar click para salir de la ventana emergente")
            .locatedBy("//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561']");

    public static final Target BTN_REGISTER = Target.the("Damos click en elñ boton para que nos lleve a la pagina a registranos")
            .locatedBy("//a[@class='a83ed08757 c21c56c305 bf0537ecb5 ab98298258 deab83296e af7297d90d js-header-login-link']");

    public static final Target TXT_GMAIL =  Target.the("creamos un correo")
            .locatedBy("//input[@name='username']");

    public static final Target BTN_CONTINUAR = Target.the("boton para pasar a crear la contraseña")
            .locatedBy("//button[@type='submit']");

    public static final Target TEXT_NEWPASSWORD = Target.the("creamos una contraseña")
            .locatedBy("//input[@name='new_password']");

    public static final Target TEXT_CONFIRMEDPASSWORD = Target.the("confirmamos la contraseña añadida anterriormente")
            .locatedBy("//input[@name='confirmed_password']");

    public static final Target BTN_CREATEACOUNT = Target.the("damos click para confirmar y crear cuenta")
            .locatedBy("//button[@type='submit']");



}
