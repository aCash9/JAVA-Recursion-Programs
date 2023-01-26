package JavaRecursionPrograms;

public class FirstAndLastOccurence {
    public static int first = -1;
    public static int last = -1;

    public static void FALO(String str, int index, char ch) {
        if (index == str.length()) {
            System.out.println(first+1);
            System.out.println(last+1);
            return;
        }
        if (str.charAt(index) == ch) {
            if (first == -1)
                first = index;
            else
                last = index;
        }
        FALO(str, index + 1, ch);
    }

    public static void main(String[] args) {
        String str = "dshdfgsddaskdan";
        FALO(str, 0, 'd');
    }
}
