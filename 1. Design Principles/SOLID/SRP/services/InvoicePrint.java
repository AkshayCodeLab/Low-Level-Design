package SOLID.SRP.services;

public class InvoicePrint {
    public void printInvoice(Invoice invoice) {
        System.out.println("Invoice Total: " + invoice.calculateTotal());
        System.out.println("Printing invoice...");
    }
}
