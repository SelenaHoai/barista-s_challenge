import java.util.ArrayList;

public class Order {
// MEMBER VARIABLES
    private String name;
    private boolean ready;
    private ArrayList<Item>items = new ArrayList<Item>();

// CONSTRUCTOR
    public Order() {
        this.name = "Guest";
        this.ready = false;
    }

// CONSTRUCTOR OVERLOAD
    public Order(String name) {
        this.name = name;
        this.ready = false;   
    }

// METHOD
    // add
    public void addItem(Item item) {
        this.items.add(item);
    }

    // display
    public void displayOrder() {
        for (Item item: items) {
            System.out.println(item.getName() + " " + item.getPrice());
        }
    }

// GETTER & SETTER
    // getter
    public String getName() {
        return this.name;
    }

    // getter
    public double getOrderTotal(){
        double total=0.0;
        for(Item i: this.items){
        total += i.getPrice();}
        return total;
    }

    // getter
        public String getStatusMessage(){
        if(this.ready == true){
            return " Your order is ready";
        }else{
            return "Thank you for waiting. Your order will be ready soon";
        }
    }

    //setter
    public void setReady() {
        this.ready = true;
        System.out.printf("%s, your order is ready.\n", this.name);
    }

    // getter
    public ArrayList<Item>getItems() {
        return this.items;
    }

}


