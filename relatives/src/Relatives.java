import java.util.*;
public class Relatives {
    private TreeMap<Integer, String> relatives;
    private TreeMap<Integer, String> relatives2;
    public Relatives(){
        relatives = new TreeMap<Integer, String>();
        relatives2 = new TreeMap<Integer, String>();
    }
    public void addRelative(int num, String name,String name2){
        relatives.put(num, name);
        relatives2.put(num, name2);
    }
    public ArrayList<String> getRelatives(String name){
        ArrayList<String> relations = new ArrayList<String>();
        for(int i = 0; i < relatives.size(); i++){
            if(relatives.get(i+1).equals(name)){
                relations.add(relatives2.get(i+1));
            }
            if(relatives2.get(i+1).equals(name)){
                relations.add(relatives.get(i+1));
            }
        }
        Collections.sort(relations);
        return relations;
    }
}
