package loan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

import javax.validation.Valid;

import loan.domain.Loan;
import loan.repository.LoanRepository;

@Service
@Validated
public class LoanServiceImpl implements LoanService {

    private final LoanRepository repository;

    @Autowired
    public LoanServiceImpl(final LoanRepository repository) {
        this.repository = repository;
    }

    @Override
    public Loan createLoan(@Valid final Loan loan) {
        loan.setLoanStatus("Rejected");
        if (loan.getLoanAmount() > (1.4*loan.getPropertyValue())) {
            loan.setLoanStatus("Accepted");
        }
        return repository.save(loan);
    }

    @Override
    public List<Loan> getList() {
        return repository.findAll();
    }

    // TODO : Find a better way to retrieve specific entry from HSQLDB
    @Override
    public Loan getLoan(@Valid final Integer loanId) {
        return getList().get(loanId-1);
    }
}
