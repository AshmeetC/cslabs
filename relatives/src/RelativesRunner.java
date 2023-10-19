import java.util.*;
public class RelativesRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in the number of relations:");
        int n = sc.nextInt();
        System.out.println("Enter in the relations");
        Relatives r = new Relatives();

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            String name2 = sc.next();
            r.addRelative(i+1, name,name2);
        }
        System.out.println("Enter in the number of people to check:");
        n = sc.nextInt();
        System.out.println("Enter in the people");
        for(int i =0; i<n; i++){
            String names = sc.next();
            ArrayList relatives = r.getRelatives(names);
            System.out.println(names + " is related to " + relatives);
        }
    }
}
