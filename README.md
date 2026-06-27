# Tax Payers - Abstract Classes & Methods System

This project is a practical financial system designed to register tax payers (both individuals and companies) and calculate their respective taxes based on specific government regulations. The main purpose of this project was to master abstract classes, abstract methods, and polymorphism in Java.

## Domain Rules & Architecture

The system uses an abstract base class `TaxPayers` which defines the common state and enforces a contract for tax calculation through an abstract method.

* **Individual (Physical Person):** Taxes are 15% for annual incomes under $20,000.00 and 25% for incomes above that. If they have health expenditures, 50% of those costs are deducted from the final tax.
* **Company (Legal Entity):** Taxes are 16% by default. However, if the company employs more than 10 people, the tax rate drops to 14%.

## Applied Technical Concepts

* **Abstract Classes & Methods:** The `TaxPayers` class cannot be instantiated directly, acting purely as a template. The `calculateTax()` method is abstract, forcing each subclass to implement its specific business tax rule.
* **Polymorphism:** A single generic list (`List<TaxPayers>`) stores both types of contributors. At runtime, the system dynamically invokes the correct implementation of `calculateTax()` for each object.
* **Encapsulation:** All attributes are kept strictly private, utilizing public getters to expose the data safely to the subclasses.

## Tech Stack & Tools

* **Language:** Java 25 (JDK 25)
* **IDE:** IntelliJ IDEA
* **Version Control:** Git & GitHub

## Console Output Example

```text
Enter the number of tax payers: 3
Tax payer #1 data:
Individual or company (i/c)? i
Name: Alex
Anual income: 50000.00
Health expenditures: 2000.00
Tax payer #2 data:
Individual or company (i/c)? c
Name: SoftTech
Anual income: 400000.00
Number of employees: 25
Tax payer #3 data:
Individual or company (i/c)? i
Name: Bob
Anual income: 120000.00
Health expenditures: 1000.00

TAXES PAID:
Alex: $ 11500.00
SoftTech: $ 56000.00
Bob: $ 29500.00

TOTAL TAXES: $ 97000.00
