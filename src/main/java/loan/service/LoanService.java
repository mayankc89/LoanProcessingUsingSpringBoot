package loan.service;

import java.util.List;

import loan.domain.Loan;

public interface LoanService {

    Loan createLoan(Loan loan);

    List<Loan> getList();

    Loan getLoan(Integer loanId);

}
