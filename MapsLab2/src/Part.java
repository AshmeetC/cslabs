import java.util.*;
public class Part {
    private String name;
    private String make;
    private String model;
    private int year;
    public Part(String n, String m, String mod, int y){
        name=n;
        make=m;
        model=mod;
        year=y;
    }
    public String toString(){
        String x = make + " " + model + " " + year + " " + name;
        return x;
    }
    public boolean equals(Object obj) {
        // if the memory references are equal, then the objects are same hence return true.
        if (this.toString().equals(obj.toString())) {
            return true;
        }
        return false;
    }
}
