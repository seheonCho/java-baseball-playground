package study.stringCalculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class EnumOperatorTest {

    EnumOperator enumOperator;

    @Test
    void values() {
        assertThat(enumOperator.values().length).isEqualTo(4);
    }

    @Test
    void valueOf() {
        //TODO
    }
}