package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target BTN_SALIR = Target.the("Dar click para salir de la ventana emergente")
            .locatedBy("//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561']");

    public static final Target BTN_LOGIN = Target.the("Dar click en el boton de inicio de secccion")
            .locatedBy("//a[@class='a83ed08757 c21c56c305 bf0537ecb5 ab98298258 deab83296e af7297d90d js-header-login-link']");

    public static final Target TXT_GMAIL = Target.the("Ingresamos la direccion de correo electronico registrada anteriormente")
            .locatedBy("//input[@name='username']");

    public static final Target BTN_CONFIRMAR = Target.the("dar click en el boton para confirmar")
            .locatedBy("//button[@class='Iiab0gVMeWOd4XcyJGA3 wPxWIS_rJCpwAWksE0s3 Ut3prtt_wDsi7NM_83Jc TuDOVH9WFSdot9jLyXlw EJWUAldA4O1mP0SSFXPm whxYYRnvyHGyGqxO4ici']");

    public static final Target TXT_PASSWORD = Target.the("agregamos la contraseña para el logueo")
            .locatedBy("//input[@type='password']");

    public static final Target BTN_INICIO = Target.the("damos click en el boton para iniciar seccion")
            .locatedBy("//button[@class='Iiab0gVMeWOd4XcyJGA3 wPxWIS_rJCpwAWksE0s3 Ut3prtt_wDsi7NM_83Jc TuDOVH9WFSdot9jLyXlw EJWUAldA4O1mP0SSFXPm whxYYRnvyHGyGqxO4ici']");

}
