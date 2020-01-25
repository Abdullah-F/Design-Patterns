package templatemethodpattern.solution;

/**
 * the base class for loan calculation
 * @author abdullah-fadhel
 */
public abstract class LoanCalculationAlgorithm {


    public int calculateLoan(){
        return (int) (getBaseAmount()*getInterest()-caclulateDiscount());
    }


    abstract int getBaseAmount();

    abstract double getInterest();

    abstract int caclulateDiscount();
}
