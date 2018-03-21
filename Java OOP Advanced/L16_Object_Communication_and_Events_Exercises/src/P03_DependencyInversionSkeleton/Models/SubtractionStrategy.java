package P03_DependencyInversionSkeleton.Models;

import P03_DependencyInversionSkeleton.Interfaces.CalculationStrategy;

public class SubtractionStrategy implements CalculationStrategy {

    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}
