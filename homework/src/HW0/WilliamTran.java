package HW0;

import java.util.ArrayList;

public class WilliamTran {
    public int max;
    public ArrayList<String> a;

    public WilliamTran() {
        a = new ArrayList<>();
        a.add("According");
        a.add("to");
        a.add("all");
        a.add("known");
        a.add("laws");
        a.add("of");
        a.add("aviation");
    }

    public int findMax(){
        max = 0;
        for (int i = 1; i < a.size(); i++){
            if (a.get(i).length() > a.get(max).length()){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args){
        WilliamTran w = new WilliamTran();
        System.out.println(w.a.get(w.findMax()));
    }
}
