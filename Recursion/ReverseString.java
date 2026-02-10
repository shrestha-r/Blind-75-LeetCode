public class ReverseString{

    public static String reverseString(String string){
        if(string.length() ==  1){
            return string;
        }
        String revString = string.substring(string.length()-1);
        revString += reverseString(string.substring(0,string.length()-1));

        return revString;
    }
    public static void main(String[] args) {
        String string = "new_string";
        System.out.println(reverseString(string));
    }
}



// 543210