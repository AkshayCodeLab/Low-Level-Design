package SOLID.SRP;

public class WithoutSRP {
    class Marker {
        private String name;
        private String color;
        private double price;

        public Marker(String name, String color, double price) {
            this.name = name;
            this.color = color;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }
    }

    /*
     * 3 responsibilies : 3 reasons to change: calculateTotal, savetoDb,
     * printinvoice
     */
    class Invoice {
        private Marker marker;
        private int quantity;

        public Invoice(Marker marker, int quantity) {
            this.marker = marker;
            this.quantity = quantity;
        }

        public double calculateTotal() {
            return marker.getPrice() * quantity;
        }

        public void saveToDb() {
            System.out.println("Saving invoice to database...");
            // Database save logic
        }

        public void printInvoice() {
            System.out.println("Invoice: " + marker.getName() + ", Quantity: " + quantity +
                    ", Total: " + calculateTotal());
        }
    }
}
