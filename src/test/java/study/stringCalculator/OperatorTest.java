package study.stringCalculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class OperatorTest {

    Operator operator = new Operator();

    @Test
    void isPlusOperator() {
        assertThat(operator.isPlusOperator('+')).isTrue();
    }

    @Test
    void isPlusOperator_2() {
        assertThat(operator.isPlusOperator('-')).isTrue();
    }

    @Test
    void testIsPlusOperator() {
        assertThat(operator.isMinusOperator('-')).isTrue();
    }

    @Test
    void testIsMinusOperator_2() {
        assertThat(operator.isMinusOperator('-')).isTrue();
    }

    @Test
    void isMinusOperator_2() {
        assertThat(operator.isMinusOperator('%')).isFalse();
    }

    @Test
    void isMinusOperator() {
        assertThat(operator.isMinusOperator('-')).isFalse();
    }

    @Test
    void testIsMinusOperator() {
        assertThat(operator.isMinusOperator("33")).isFalse();
    }

    @Test
    void isMultiplyOperator() {
        assertThat(operator.isMultiplyOperator(('*'))).isTrue();
    }

    @Test
    void testIsMultiplyOperator() {
        assertThat(operator.isMultiplyOperator(("*"))).isTrue();
    }

    @Test
    void isDivideOperator() {
        assertThat(operator.isDivideOperator(('/'))).isTrue();
    }

    @Test
    void testIsDivideOperator() {
        assertThat(operator.isDivideOperator("33333")).isFalse();
    }

    @Test
    void testIsDivideOperator_2() {
        assertThat(operator.isDivideOperator("sadf")).isFalse();
    }
}