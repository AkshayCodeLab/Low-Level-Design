package SOLID.OpenClosed;

import SOLID.SRP.services.Invoice;

public class FileInvoiceSaver implements InvoiceSaver {
    @Override
    public void save(Invoice invoice) {
        System.out.println("Saved to file!");
    }
}
