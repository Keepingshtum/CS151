package HW1.submissions.partA.doordash;

public class Restaurant implements Seller{
    private String name;

    public Restaurant(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
