package mathOperations;

import org.springframework.stereotype.Component;

@Component
public interface MathOperation {
    double operate(double x, double y);
}
