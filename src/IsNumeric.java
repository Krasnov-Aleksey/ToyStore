public class IsNumeric {
    public boolean isNumeric(String number){
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
