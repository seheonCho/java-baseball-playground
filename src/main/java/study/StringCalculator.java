package study;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StringCalculator {

    int result = 0;

    String[] expression;

    List<Character> operators = new LinkedList<>();

    Operator operator = new Operator();

    StringCalculator() {

    }

    void setExpression(String expression) {
        this.expression = toArr(expression);
    }

    private String[] toArr(String string) {
        return string.split(" ");
    }

    String[] getExpression() {
        return this.expression;
    }

    void promptExpression() {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        expression = toArr(value);
    }

    int getResult() {
        return result;
    }

    // 주어진 식의 첫 숫자 result 값에 세팅
    private void firstNumSetResult() {
        result = toInt(expression[0]);
    }

    // 주어진 식에 대한 연산시작
    void calculate() {

        firstNumSetResult();
        collectOperator();

        for (int i = 2; i < expression.length; i+=2) {
            unitCalculate(toInt(expression[i]));
        }

    }

    private void unitCalculate(int num) {

        char operator = getNextOperator();

        if (this.operator.isPlusOperator(operator)) {
            sumCalculate(num);
            return;
        }

        if (this.operator.isMinusOperator(operator)) {
            minusCalculate(num);
            return;
        }

        if (this.operator.isMultiplyOperator(operator)) {
            multiplyCalculate(num);
            return;
        }

        if (this.operator.isDivideOperator(operator)) {
            divideCalculate(num);
            return;
        }

    }

    // values 에서 연산자만 수집
    void collectOperator() {

        for (int i = 0; i < expression.length; i++) {

            if (operator.isPlusOperator(expression[i])) {
                operators.add(expression[i].charAt(0));
                return;
            }

            if (operator.isMinusOperator(expression[i])) {
                operators.add(expression[i].charAt(0));
                return;
            }

            if (operator.isMultiplyOperator(expression[i])) {
                operators.add(expression[i].charAt(0));
                return;
            }

            if (operator.isDivideOperator(expression[i])) {
                operators.add(expression[i].charAt(0));
                return;
            }

        }

    }

    // collectOperator에서 수집한 연산자 중 좌측의 연산자 가져오고, 해당 연산자 operators에서 삭제.
    private char getNextOperator() {
        char operator = getFirstOperator();
        removeFirstOperator();
        return operator;
    }

    private char getFirstOperator() {
        return operators.get(0);
    }

    private void removeFirstOperator() {
        operators.remove(0);
    }

    private int toInt(String stringValue) {
        return Integer.parseInt(stringValue);
    }

    private void sumCalculate(int a) {
        result += a;
    }

    private void minusCalculate(int a) {
        result -= a;
    }

    private void multiplyCalculate(int a) {
        result *= a;
    }

    private void divideCalculate(int a) {
        result /= a;
    }

    void printResult() {
        System.out.println(result);
    }


}
