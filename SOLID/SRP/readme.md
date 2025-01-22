Correctness of the Implementation 1. Invoice Class:
• This class focuses solely on the business logic, i.e., calculating the total invoice amount.
• Its single responsibility is managing and processing invoice-related calculations. 2. InvoiceDAO Class:
• Responsible for persistence (saving the invoice to a database).
• It decouples the persistence logic from the core business logic. 3. InvoicePrint Class:
• Handles formatting and printing of the invoice.
• It isolates presentation responsibilities from both the business and data layers.

This segregation ensures that each class has one and only one reason to change, making the system easier to maintain, extend, and test.

Advantages of Splitting the Invoice Class 1. Improved Maintainability:
• Changes in business logic (e.g., a new discount policy) affect only the Invoice class.
• Changes in the database structure or storage logic affect only the InvoiceDAO class.
• Changes in printing or formatting affect only the InvoicePrint class. 2. Enhanced Testability:
• Each class can be tested independently. For example:
• Unit tests for Invoice ensure calculations are correct.
• Tests for InvoiceDAO validate database interactions.
• Tests for InvoicePrint check formatting and printing logic. 3. Scalability:
• If new persistence mechanisms (e.g., a cloud database) are added, you only modify or extend the InvoiceDAO class.
• If a new invoice format (e.g., PDF) is needed, you can extend or modify the InvoicePrint class without affecting other parts. 4. Reusability:
• Other parts of the system can reuse the InvoiceDAO class for database operations or the InvoicePrint class for printing, without duplicating functionality. 5. Flexibility:
• The system becomes modular and open to changes. For instance:
• Switching from one database to another requires minimal changes in InvoiceDAO.
• Adding new calculations requires only changes in Invoice. 6. Easier Debugging:
• Isolated responsibilities mean that bugs are easier to pinpoint and fix.
