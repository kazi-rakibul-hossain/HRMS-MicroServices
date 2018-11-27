package ca.concordia.soen6841.dbservice.model;

import javax.persistence.*;

@Entity
@Table(name = "Invoice")
public class Invoice extends AuditModel {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "salary_after_tax")
    private Integer salaryAfterTax;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tax_id", nullable = false)
    private Tax tax;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "salary_id", nullable = false)
    private Salary salary;

    public Invoice() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSalaryAfterTax() {
        return salaryAfterTax;
    }

    public void setSalaryAfterTax(Integer salaryAfterTax) {
        this.salaryAfterTax = salaryAfterTax;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
}
