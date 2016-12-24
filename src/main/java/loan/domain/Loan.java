package loan.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Loan {

    @Id
    @GeneratedValue
    private Integer loanId;

    @NotNull
    @Min(1)
    private Integer loanAmount;

    @NotNull
    @Min(1)
    private Integer propertyValue;

    private String loanStatus;

    @NotNull
    @Min(value = 100000000, message = "Bad Value provided for SSN ")
    private Integer ssn;

    public String toString() {
        return "Loan Amount: " + this.loanAmount + " for Property Value: " + this.propertyValue;
    }

    /**
     * Getters and Setters
     */

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public Integer getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Integer loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Integer getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(Integer propertyValue) {
        this.propertyValue = propertyValue;
    }

    public Integer getSsn() {
        return ssn;
    }

    public void setSsn(Integer ssn) {
        this.ssn = ssn;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }
}

