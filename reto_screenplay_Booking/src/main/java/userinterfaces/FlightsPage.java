package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import sun.security.rsa.RSAKeyFactory;

public class FlightsPage {

    public static final Target BTN_SALIR = Target.the("Dar click para salir de la ventana emergente")
            .locatedBy("//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561']");


    public static final Target BTN_FLIGHTS = Target.the("Damos click en el apartado de vuelos")
            .locatedBy("//a[@id='flights']");

    public static final Target BTN_PLACES = Target.the("ingresamos la ciudad o el aeropuerto")
            .locatedBy("//button[@class='css-1ovag24']");

    public static final Target BTN_DESTINATION = Target.the("ingresamos el destino donde queremos viajar")
            .locatedBy("/html/body/div[1]/div[1]/main/div/div/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/button[3]");

    public static final Target TXT_CITY = Target.the("agregar ciudad de destino")
            .locatedBy("//*[@id=':Rjdl3b9:']/div/div/div/div/div/div/div[1]/div/div/div/div/input");

    public static final Target BTN_SELETION = Target.the("Seleccionamos el aeropuerto o lugar de destino")
            .locatedBy("//*[@id='listbox']/li/span[2]/span");

    public static final Target BTN_DATE = Target.the("damos click en el campo de fecha")
            .locatedBy("//*[@id='basiclayout']/div/div/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[2]/button");

    public static final Target DATE_START = Target.the("Selecconamos la fecha de inicio")
            .locatedBy("//span[@data-ui-name='calendar_cell_2023-10-30']");

    public static final Target DATE_END = Target.the("seleccionamos la fecha final")
            .locatedBy("//span[@data-date='2023-11-04']");

    public static final Target BTN_CONSULT = Target.the("damos click para buscar su vuelo")
            .locatedBy("//*[@id='basiclayout']/div/div/div[1]/div/div/div/div/div[2]/div[2]/div/div/button");
}
