package org.example.calculate;

import java.util.List;
import java.util.function.Predicate;

public class Calculator {

    private static final List<NewArithmeticOperator> arithmeticOperators = List.of(new AdditionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());

    public static int calculate(int operand1, String operator, int operand2) {
//        if ("+".equals(operator)) {
//            return operand1 + operand2;
//        } else if ("-".equals(operator)) {
//            return operand1 - operand2;
//        } else if ("*".equals(operator)) {
//            return operand1 * operand2;
//        } else if ("/".equals(operator)) {
//            return operand1 / operand2;
//        }
//        return 0;

//        return ArithmeticOperator.calculate(operand1, operator, operand2);

        int result =  arithmeticOperators.stream()
                .filter(a -> a.supports(operator)) // .filter(arithmeticOperator -> arithmeticOperator.supports(operator))
//                .filter(new Predicate<NewArithmeticOperator>() {
//                    @Override
//                    public boolean test(NewArithmeticOperator newArithmeticOperator) {
//                        return newArithmeticOperator.supports(operator);
//                    }
//                })
                .map(a -> a.calculate(operand1, operand2)) // .map(arithmeticOperator -> arithmeticOperator.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));

        return result;
    }
}
