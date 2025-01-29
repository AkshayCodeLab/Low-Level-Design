package SOLID.OpenClosed;

import SOLID.SRP.services.Invoice;

public interface InvoiceSaver {
    void save(Invoice invoice);
}
