package JavaRecursionPrograms;

import java.lang.Character.Subset;
import java.util.*;

public class SubSet {
    public static void print(ArrayList<Integer> subset){
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubset(int n ,ArrayList<Integer> subset){
        if(n==0)
        {
            print(subset);
            return;
        }
        //number is used
        subset.add(n);
        findSubset(n-1, subset);

        //number is not used
        subset.remove(subset.size()-1);
        findSubset(n-1, subset);
    }
    public static void main(String[] args) {
        int n =3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
}
