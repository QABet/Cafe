package Area;

import java.time.LocalTime;

public class Cafe {
    public static String displayCafeName(String cafeName){

        return cafeName;
    }

    public static LocalTime cafeIsOpen(){
        return LocalTime.of(8,0,0);
    }

    public static LocalTime cafeIsClose(){
        return LocalTime.of(0,0,0);
    }


}
