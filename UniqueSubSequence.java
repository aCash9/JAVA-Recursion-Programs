package JavaRecursionPrograms;

import java.util.HashSet;

public class UniqueSubSequence {
    public static void USS(String str,int index,String newString,HashSet<String> set){
        if(index==str.length()){
            if(set.contains(newString))
                return;
            else{
                set.add(newString);
                System.out.println(newString);
                return;
            }
        }
        char currChar=str.charAt(index);
        //character get used
        USS(str, index+1, newString+currChar,set);
        //character doesnot get used
        USS(str, index+1, newString,set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set=new HashSet<>();
        USS(str, 0, "",set);
    }
}
