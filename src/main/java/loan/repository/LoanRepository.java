package loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import loan.domain.Loan;

/**
 * Needed to use HSQLDB
 */
@Repository
public interface LoanRepository extends JpaRepository<Loan, String> {

}
