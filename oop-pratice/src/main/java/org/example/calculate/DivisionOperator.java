package org.example.calculate;

public class DivisionOperator implements NewArithmeticOperator {
    @Override
    public boolean supports(String operator) {
        return "/".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber operand1, PositiveNumber operand2) {
        // 0 체크 PositiveNumber에서 하기 때문에 0 체크는 필요 없다.
        return operand1.toInt() / operand2.toInt();
    }
}
