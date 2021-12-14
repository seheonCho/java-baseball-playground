package study;

public enum EnumOperator {

    PLUS('+'), MINUS('-'), MULTIPLY('*'), DIVIDE('/');

    public char operator;

    EnumOperator(char operator) {
        this.operator = operator;
    }

}
