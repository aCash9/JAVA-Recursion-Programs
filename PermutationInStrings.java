package JavaRecursionPrograms;

public class PermutationInStrings {
    public static void permutations(String str, String permutates) {
        if(str.length()==0)
        {
            System.out.println(permutates);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar=str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            permutations(newStr, permutates+currChar);
        }
    }

    public static void main(String[] args) {
        String str="abc";
        permutations(str, "");
    }
}
