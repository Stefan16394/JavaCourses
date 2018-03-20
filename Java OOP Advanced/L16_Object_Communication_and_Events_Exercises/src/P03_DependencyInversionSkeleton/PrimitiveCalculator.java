package P03_DependencyInversionSkeleton;


import P03_DependencyInversionSkeleton.Interfaces.CalculationStrategy;
import P03_DependencyInversionSkeleton.Models.AdditionStrategy;
import P03_DependencyInversionSkeleton.Models.DivisionStrategy;
import P03_DependencyInversionSkeleton.Models.MultiplicationStrategy;
import P03_DependencyInversionSkeleton.Models.SubtractionStrategy;

public class PrimitiveCalculator {

    private CalculationStrategy calculationStrategy;

    public PrimitiveCalculator(){
        this.calculationStrategy=new AdditionStrategy();
    }

    public void changeStrategy(char operator){
        switch (operator){
            case '+': this.calculationStrategy=new AdditionStrategy();
                break;
            case '-':this.calculationStrategy=new SubtractionStrategy();
                break;
            case '*':this.calculationStrategy=new MultiplicationStrategy();
                break;
            case '/':this.calculationStrategy=new DivisionStrategy();
                break;

        }
    }

    public int performCalculation(int firstOperand,int secondOperand){
       return this.calculationStrategy.calculate(firstOperand,secondOperand);
    }
}
