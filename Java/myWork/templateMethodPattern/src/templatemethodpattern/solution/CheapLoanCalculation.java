package templatemethodpattern.solution;

/**
 * an extention for calculating cheap loans
 * @author abdullah-fadhel
 */
public class CheapLoanCalculation extends LoanCalculationAlgorithm {


    @Override
    int getBaseAmount() {
        return 100000;
    }

    @Override
    double getInterest() {
        return 3;
    }

    @Override
    int caclulateDiscount() {
        return 5000;
    }
}
