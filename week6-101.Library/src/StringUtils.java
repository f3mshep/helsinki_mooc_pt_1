public class StringUtils {

    public static boolean included(String word, String searched){
        if (word == null || searched == null) return false;
        return word.toUpperCase().trim().contains(searched.toUpperCase().trim());
    }

}
