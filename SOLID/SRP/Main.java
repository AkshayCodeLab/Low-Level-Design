package SOLID.SRP;

import java.util.Arrays;

import SOLID.SRP.models.Marker;
import SOLID.SRP.services.Invoice;
import SOLID.SRP.services.InvoiceDao;
import SOLID.SRP.services.InvoicePrint;

public class Main {
    public static void main(String[] args) {
        Marker marker1 = new Marker(500, "pencil", "red");
        Marker marker2 = new Marker(400, "pen", "blue");

        Invoice invoice = new Invoice(Arrays.asList(marker1, marker2));

        System.out.println("This is the total invoice: " + invoice.calculateTotal());

        InvoiceDao invoiceDao = new InvoiceDao(invoice);
        invoiceDao.saveToDb();
        InvoicePrint invoicePrint = new InvoicePrint();
        invoicePrint.printInvoice(invoice);
    }
}
