package JavaRecursionPrograms;

public class RemoveDuplicates {
    public static boolean[] map = new boolean[26];

    public static void RD(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if (map[currChar - 'a']) {
            RD(str, index + 1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            RD(str, index + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "aabbbccdcd";
        RD(str, 0, "");

    }
}
