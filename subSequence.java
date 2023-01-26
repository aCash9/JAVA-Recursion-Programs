package JavaRecursionPrograms;

public class subSequence {
    public static void SS(String str,int index,String newString){
        if(index==str.length())
        {
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(index);
        //character get used
        SS(str, index+1, newString+currChar);
        //character doesnot get used
        SS(str, index+1, newString);
    }
    public static void main(String[] args) {
        String str="abc";
        SS(str, 0, "");
    }
}
