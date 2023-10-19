import java.util.*;
public class RankingCandidates {
    public RankingCandidates() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Candidate's name:");
        Candidate first = new Candidate(sc.next());
        System.out.print("Enter list of candidate matches:");
        ArrayList<String> names  = new ArrayList<String>();
        String[] x = sc.nextLine().split(" ");
        while(x[0].equals("")){
            x = sc.nextLine().split(" ");
        }
        for(int i =0; i<x.length; i++){
            names.add(x[i]);
        }
        int lmao = 0;
        while (names.size()>0){
            System.out.println("Choose perfered choice from the following:");
            for(int i =0; i<names.size(); i++){
                System.out.println("" + (i+1) + " " + names.get(i));
            }
            System.out.print("" + (lmao +1) + ". ");
            String k = sc.next();
            Suitor randomFuck = new Suitor(k, lmao);
            first.addSuitorToRank(randomFuck);
            for(int i =0; i<names.size(); i++){
                if(names.get(i).equals(k)){
                    names.remove(i);
                }
            }
            lmao++;
        }
        System.out.println(first.getRanking());
    }
}