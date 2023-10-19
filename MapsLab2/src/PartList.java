import java.util.*;
public class PartList {
    private TreeMap<String, Integer> parts;
    public PartList(){
        parts = new TreeMap<String, Integer>();
    }
    public void addPart(String partString){
        String[] partray = partString.split(" ");
        String[] parts2 = new String[4];
        if(partray.length>5) {
            parts2[0] = partray[0] + " " + partray[1] + " " + partray[2];
            parts2[1] = partray[3];
            parts2[2] = partray[4];
            parts2[3] = partray[5];
        }
        else{
            parts2[0] = partray[0] + " " + partray[1];
            parts2[1] = partray[2];
            parts2[2] = partray[3];
            parts2[3] = partray[4];
        }
        Part part = new Part(parts2[0], parts2[1], parts2[2], Integer.parseInt(parts2[3]));
        //parts.put(part, 3);
        //System.out.println(parts.get(part));
        if(!parts.containsKey(part.toString())){
            parts.put(part.toString(), 1);
        } else {
            parts.put(part.toString(), parts.get(part.toString())+1);
        }
        /*for(Part x : parts.keySet()){
            if(x.equals(part)) {
                parts.put(part, parts.get(part) + 1);
                return;
            }
            parts.put(part, 1);
        }*/
        //parts.put(part, 1);
    }
    public String toString(){
        String output = "";
        for(String part : parts.keySet()){
            output += part + " - " + parts.get(part) + "\n";
        }
        return output;
    }
    public String orderSheet(int min){
        String output = "";
        for(String part : parts.keySet()){
            if(parts.get(part)<min){
                int x = min-parts.get(part);
                output += x + " " + part + "\n";
            }
        }
        return output;
    }
}
