package SOLID.SRP.models;

public class Marker {
    private int price;
    private String name;
    private String colour;

    public Marker(int price, String name, String colour) {
        this.price = price;
        this.name = name;
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }
}
