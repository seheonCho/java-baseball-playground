package study;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class StringCalculatorTest {

    /**
     * - 단위 테스트 실습 - 문자열 계산기
     * 다음 요구사항을 JUnit을 활용해 단위 테스트 코드를 추가해 구현한다.
     *
     * - 요구사항
     * 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
     * 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
     * 예를 들어 "2 + 3 * 4 / 2"와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.
     *
     * - 힌트
     * 문자열을 입력 받은 후(scanner의 nextLine() 메소드 활용) 빈 공백 문자열을 기준으로 문자들을 분리해야 한다.
     * String value = scanner.nextLine();
     * String[] values = value.split(" ");
     *
     * - 문자열을 숫자로 변경하는 방법
     * int number = Integer.parseInt("문자열");
     *
     * - 나만의 작성 요령
     * 1. ~~한 경우 어떻게 나와야 하는지
     * 2. give => @ParameterizedTest, @ValueSource
     *    when
     *    then 방식 사용하기.
     */

    StringCalculator cal;

    @BeforeEach
    void setUp() {
        cal = new StringCalculator();
    }

    @AfterEach
    void tearDown() {}

    @ParameterizedTest
    @ValueSource(strings = "1 + 2")
    void 두수더하기(String expression) {

        //when
        cal.setExpression(expression);
        cal.calculate();

        // then
        assertThat(cal.getResult()).isEqualTo(3);
    }

    @ParameterizedTest
    @ValueSource(strings = "1 + 2 + 3 + 4")
    void 네수더하기(String expression) {

        cal.setExpression(expression);
        cal.calculate();

        assertThat(cal.getResult()).isEqualTo(10);

    }

    @ParameterizedTest
    @ValueSource(strings = "3 - 2")
    void 두수빼기(String expression) {
        cal.setExpression(expression);
        cal.calculate();

        assertThat(cal.getResult()).isEqualTo(1);
    }

    @ParameterizedTest
    @ValueSource(strings = "1 - 4 - 9")
    void 세수빼기(String expression) {
        cal.setExpression(expression);
        cal.calculate();

        assertThat(cal.getResult()).isEqualTo(-12);
    }

    @ParameterizedTest
    @ValueSource(strings = "1 - 4 - 9")
    void 세수빼기_실패(String expression) {
        cal.setExpression(expression);
        cal.calculate();

        assertThat(cal.getResult()).isNotEqualTo(1);
    }

    @ParameterizedTest
    @ValueSource(strings = "10 * 5 * 20")
    void 세수곱하기(String expression) {
        cal.setExpression(expression);
        cal.calculate();

        assertThat(cal.getResult()).isEqualTo(1000);
    }

    @ParameterizedTest
    @ValueSource(strings = "1000 / 5 / 20")
    void 세수나누기(String expression) {
        cal.setExpression(expression);
        cal.calculate();

        assertThat(cal.getResult()).isEqualTo(10);
    }

    @ParameterizedTest
    @ValueSource(strings = "1000 / 5 * 20 - 2")
    void 복합계산(String expression) {
        cal.setExpression(expression);
        cal.calculate();

        assertThat(cal.getResult()).isEqualTo(3998);
    }

    @ParameterizedTest
    @ValueSource(strings = "1 + 2 * 3 / 3")
    void 복합계산_실패(String expression) {
        cal.setExpression(expression);
        cal.calculate();

        assertThat(cal.getResult()).isNotEqualTo(4);
    }



}