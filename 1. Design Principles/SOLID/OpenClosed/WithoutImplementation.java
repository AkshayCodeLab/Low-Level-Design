package SOLID.OpenClosed;

import SOLID.SRP.services.Invoice;

public class WithoutImplementation {

    /*
     * Already tested, already live. now Need to add one more function: saveToFile
     */
    public class InvoiceDao {
        Invoice invoice;

        // constructor

        public void saveToDb() {
            System.out.println("Save to DB");
            // code
        }

        // Modifying existing class to write this new savetofile()
        public void saveToFile() {
            // Entire class got prone to bugs since we modified an existing class
        }

    }
}
