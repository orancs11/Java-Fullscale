package Logic;

public class Utilities {

    public static boolean isNumericString(String s){
        try{
            Integer.parseInt(s);
            return true;
        }catch(NumberFormatException nfe){
            System.out.println("Input field is not number");
            return false;
        }
    }

    public static int convertInt(String message){
        return Integer.parseInt(message);
    }
}
