package study.learnPractice;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class SetTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    //Test Case 구현

    @Test
    void 요구사항1_setSize_메서드활용() {
        assertThat(numbers.size()).isEqualTo(4);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void 요구사항2_contains_메소드활용(int input) {
        // @ValueSource : 지정한 배열을 파라미터 값으로 순서대로 넘겨준다.
        // 다음 세줄을 어노테이션과 jupiter.api.Assertions 클래스로 반복되는 작업을 줄일 수 있다.
//        assertThat(numbers.contains(1)).isEqualTo(1);
//        assertThat(numbers.contains(2)).isEqualTo(2);
//        assertThat(numbers.contains(3)).isEqualTo(3);
        assertTrue(numbers.contains(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"1,true", "2,true", "3,true", "4,false", "5,false"}, delimiter = ',')
    void toLowerCase_ShouldGenerateTheExpectedLowercaseValue(String input, Boolean flag) {
        int actualValue = Integer.parseInt(input);
        assertThat(numbers.contains(actualValue)).isEqualTo(flag);
    }


}
