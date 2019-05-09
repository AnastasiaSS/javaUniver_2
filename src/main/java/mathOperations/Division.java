package mathOperations;

import org.springframework.stereotype.Component;

@Component
public class Division implements MathOperation {
    public double operate(double x, double y) {
        return x / y;
    }
}
