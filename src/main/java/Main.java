import mathOperations.MathOperation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    static public void main(String[] args){

        ApplicationContext context =
                new AnnotationConfigApplicationContext("mathOperations");

        MathOperation mathOperation1 = (MathOperation) context.getBean("multiplication");

        System.out.println(mathOperation1.operate(4,5));

        MathOperation mathOperation2 = (MathOperation) context.getBean("addition");

        System.out.println(mathOperation2.operate(4,5));

        MathOperation mathOperation3 = (MathOperation) context.getBean("subtraction");

        System.out.println(mathOperation3.operate(4,5));

        MathOperation mathOperation4 = (MathOperation) context.getBean("division");

        System.out.println(mathOperation4.operate(4,5));
    }

}
