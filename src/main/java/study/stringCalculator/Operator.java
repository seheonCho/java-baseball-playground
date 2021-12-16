package study.stringCalculator;

public class Operator {

    /**
     * " + " 더하기 연산자 판별
     * */
    boolean isPlusOperator(char operator) {

        if (EnumOperator.PLUS.operator == operator) {
            return true;
        }
        return false;
    }

    /**
     * " + " 더하기 연산자 판별
     * */
    boolean isPlusOperator(String operator) {

        if (operator.equals(String.valueOf(EnumOperator.PLUS.operator))) {
            return true;
        }
        return false;
    }

    /**
     * " - " 빼기 연산자 판별
     * */
    boolean isMinusOperator(char operator) {

        if (EnumOperator.MINUS.operator == operator) {
            return true;
        }
        return false;
    }

    /**
     * " - " 빼기 연산자 판별
     * */
    boolean isMinusOperator(String operator) {

        if (operator.equals(String.valueOf(EnumOperator.MINUS.operator))) {
            return true;
        }
        return false;
    }

    /**
     * " * " 곱하기 연산자 판별
     * */
    boolean isMultiplyOperator(char operator) {

        if (EnumOperator.MULTIPLY.operator == operator) {
            return true;
        }
        return false;
    }

    /**
     * " * " 곱하기 연산자 판별
     * */
    boolean isMultiplyOperator(String operator) {

        if (operator.equals(String.valueOf(EnumOperator.MULTIPLY.operator))) {
            return true;
        }
        return false;
    }

    /**
     * " / " 나누기 연산자 판별
     * */
    boolean isDivideOperator(char operator) {

        if (EnumOperator.DIVIDE.operator == operator) {
            return true;
        }
        return false;
    }

    /**
     * " / " 나누기 연산자 판별
     * */
    boolean isDivideOperator(String operator) {

        if (operator.equals(String.valueOf(EnumOperator.DIVIDE.operator))) {
            return true;
        }
        return false;
    }
    
}
