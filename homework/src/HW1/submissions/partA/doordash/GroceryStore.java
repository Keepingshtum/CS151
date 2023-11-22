package HW1.submissions.partA.doordash;

public class GroceryStore implements Seller{
    private String name;

    public GroceryStore(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
