package JavaRecursionPrograms;

public class SortedArryaOrNot {
    public static void SAON(int arr[], int size, int index) {
        if (index == size-1) {
            System.out.println("YES");
            return;
        }
        if(arr[index]<arr[index+1])
        {
            SAON(arr, size, index+1);
        }
        else 
        {
            System.out.println("NO");
            return;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 45, 64, 322, 2122, 799090 };
            SAON(arr, 6, 0);
    }
}
