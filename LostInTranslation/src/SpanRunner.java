import java.util.*;
public class SpanRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in the number of words in dictionary");
        int n = sc.nextInt();
        System.out.println("Enter in the spanish word and english word");
        SpanishToEnglish t = new SpanishToEnglish();
        for(int i =0; i<n; i++){
            String s = sc.next();
            String e = sc.next();
            t.add(s, e);
        }
        System.out.println("Enter in the number of phrases to translate");
        n = sc.nextInt();
        System.out.println("Enter in the line to translate");
        ArrayList<String> x = new ArrayList<>();
        for(int i=0;i<n+1;i++){
            String sp = sc.nextLine();
            x.add(sp);
        }
        x.remove(0);
        for(String a : x){
            String out ="";
            String[] bored = a.split(" ");
            for(String b : bored) {
                out+=t.get(b) + " ";
            }
            System.out.println(out);
        }
    }
}
