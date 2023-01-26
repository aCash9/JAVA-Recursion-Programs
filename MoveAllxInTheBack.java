package JavaRecursionPrograms;

public class MoveAllxInTheBack {
    public static void MAITB(StringBuilder str, int index, int counter) {
        if (index == str.length() - 1) {
            for (int i = 0; i < counter; i++) {
                str.insert(str.length(),'x');
            }
            System.out.println(str);
            return;
        }
        if (str.charAt(index) == 'x') {
            str.delete(index, index + 1);
            counter++;
            MAITB(str, index, counter + 1);
        } else {
            MAITB(str, index + 1, counter);
        }
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("xxakxxxaxxsxhxx");
        MAITB(sb, 0, 0);
    }
}
