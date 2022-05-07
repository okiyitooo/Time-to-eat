
package backEnd;

public class Item {
    public String name;
    public String value;
    public String list;
    
    public void Item(){
    }
    
    public Item(String name, String value){
        this.name = name;
        this.value = value;
        this.list = name + " " + value;
    }
}
