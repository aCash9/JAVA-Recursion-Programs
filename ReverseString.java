package JavaRecursionPrograms;

public class ReverseString {
    public static void RS(String str,int length) {
        if(length==0)
        {
            System.out.print(str.charAt(0));
            return;
        }
        System.out.print(str.charAt(length));
        RS(str, length-1);
    }
    public static void main(String[] args) {
        String str = "Akash";
        RS(str,str.length()-1);
    }
}
