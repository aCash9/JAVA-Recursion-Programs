package JavaRecursionPrograms;

public class GuestCalling {
    public static int callGuest(int n) {
        if (n <= 1) {
            return 1;
        }
        //calling the guest alone
        int alone=callGuest(n-1);
        //calling the guest in pair
        int pair=callGuest(n-2)*(n-1);
        return alone+pair;
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(callGuest(n));
    }
}
