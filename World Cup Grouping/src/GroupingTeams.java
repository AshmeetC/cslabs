import java.util.*;

public class GroupingTeams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of teams");
        int t = sc.nextInt();
        System.out.println("Enter the number of teams in a group");
        int g = sc.nextInt();
        //System.out.println("Enter in random seed value");
        //Random r = new Random(sc.nextInt());
        //HashSet<String> bucketOne = new HashSet<String>();
        //HashSet<String> bucketTwo = new HashSet<String>();
        //HashSet<String> bucketThree = new HashSet<String>();
        //HashSet<String> bucketFour = new HashSet<String>();
        HashSet<String>[] buckets = new HashSet[g];
        for(int i =0; i<g;i++){
            buckets[i]=new HashSet<String>();
        }
        System.out.println("Enter in the teams");
        //int j = 1;
        ArrayList<String> temp = new ArrayList<String>();
        for(int i =0; i<=t;i++){
            /*if(i<(t/g*j)){
                buckets[-1+j].add(sc.nextLine());
            }
            else{j++;i--;}*/
            String tempS = sc.nextLine();
            temp.add(tempS);
        }
        for(int i = 0; i<g; i++){
            Iterator abc = temp.iterator();
            while(abc.hasNext())
                System.out.println(abc.next());
            System.out.println();
        }
        /*HashSet<String>[] groups = new HashSet[t/g];
        for(int i =0; i<groups.length;i++){
            groups[i]=new HashSet<String>();
        }
        //Iterator<String> iter = bucketOne.iterator();
        //Iterator<String> iter2 = bucketTwo.iterator();
        //Iterator<String> iter3 = bucketThree.iterator();
        //Iterator<String> iter4 = bucketFour.iterator();
        //Iterator<String>[] iters = groups[].iterator();
        ArrayList<Iterator<String>> iters = new ArrayList<>();
        for(int i =0; i<g; i++){
            iters.add(buckets[i].iterator());
        }
        for(int i =0; i<t/g; i++){
            for(j =0; j<g; j++){
                groups[i].add(iters.get(j).next());
            }
        }
        char a = 'A';
        for(int i =0; i<t/g; i++){
            Iterator<String > iter = groups[i].iterator();
            System.out.println("Group " + ((char)(a+i)));
            while(iter.hasNext())
            System.out.println(iter.next());
            System.out.println();
        }*/
    }
}
