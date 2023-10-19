import java.util.*;
public class SpanishToEnglish {
    private TreeMap<String, String> t;
    public SpanishToEnglish(){
        t = new TreeMap<String, String>();
    }
    public void add(String s, String e){
        t.put(s, e);
    }
    public String get(String s){
        return t.get(s);
    }
}
