package loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import loan.domain.Loan;
import loan.service.LoanService;

@Controller
public class LoanController {

    private final LoanService loanService;

    @Autowired
    public LoanController(final LoanService loanService) {
        this.loanService = loanService;
    }

    @GetMapping("/")
    public String loanForm(Loan loan) {
        return "form";
    }

    /**
     * Creates a Loan
     */
    @PostMapping("/")
    public String postLoan(@Valid @ModelAttribute("loan") final Loan loan,
                                BindingResult bindingResult,
                                RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            return "form";
        }
        redirectAttributes.addFlashAttribute("loan", loanService.createLoan(loan));
        return "redirect:/result";
    }

    /**
     * Retrieves all loans
     */
    @GetMapping("/loans")
    @ResponseBody
    public List<Loan> getAllLoans() {
        return loanService.getList();
    }

    /**
     * Retrieves loan for loanId
     */
    @GetMapping("/loans/{loanId}")
    @ResponseBody
    public Loan getLoan(@PathVariable final Integer loanId) {
        return loanService.getLoan(loanId);
    }

    /**
     * Displays Loan Details
     */
    @GetMapping("/result")
    @ResponseBody
    public Map<String, String> getStatus(@ModelAttribute("loan") @Valid final Loan loan) {
        Map<String, String> loanDisplay = new LinkedHashMap<>();
        loanDisplay.put("Loan ID", String.valueOf(loan.getLoanId()));
        loanDisplay.put("Loan Status", loan.getLoanStatus());
        return loanDisplay;
    }
}
