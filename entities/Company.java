package entities;

public class Company extends TaxPayers {

    private Integer employees;

    public Company() {
        super();
    }

    public Company(String name, Double annualIncome, Integer employees) {
        super(name, annualIncome);
        this.employees = employees;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    @Override
    public Double calculateTax() {
        if (employees <= 10) {
            return getAnnualIncome() * 0.16;
        }
        else {
            return getAnnualIncome() * 0.14;
        }
    }
}
