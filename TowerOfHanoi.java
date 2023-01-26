package JavaRecursionPrograms;

public class TowerOfHanoi {
    public static void TOH(int n , String src,String hlp,String dest) {
        if(n==1)
        {
            System.out.println("Move Disk "+n+" from "+src+" to "+dest);
            return;
        }
        TOH(n-1, src, dest, hlp);
        System.out.println("Move Disk "+n+" from "+src+" to "+dest);
        TOH(n-1, hlp, src, dest);
    }
    public static void main(String[] args) {
        int n =3;
        TOH(n, "S", "H", "D");
    }
}
/*Basic of this transferring assume there are n disks
 * transfer the n-1 from source to helper using destination as a helper
 * transfer the remaining nth disk from source to destination
 * again transfer those ni1 disks from helper to destination using source as helper
 * and let the recursion to take place 
 */
