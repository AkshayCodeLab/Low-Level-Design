package SOLID.SRP.services;

public class InvoiceDao {
    private Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDb() {
        System.out.println("Successfully Saved to Db: " + invoice.calculateTotal());
    }
}
