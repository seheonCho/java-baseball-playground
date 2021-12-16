package study.learnPractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void 요구사항1_나누기_1_2_학습테스트() {
        String actual = "1,2";
        String[] splitedActual = actual.split(",");
        assertThat(splitedActual[0]).isEqualTo("1");
        assertThat(splitedActual[1]).isEqualTo("2");
    }

    @Test
    void 요구사항1_나누기_1을_쉼표로_스플릿() {
        String actual = "1";
        assertThat(actual.split(",")[0]).isEqualTo("1");
    }

    @Test
    void 요구사항2_subString_으로_괄호제거() {
        String actual = "(1,2)";
        System.out.println(actual.substring(1, actual.length()-1));
    }

    @DisplayName("특정위치의")
    @Test
    void 요구사항3_charAt_메서드_활용() {
        String actual = "abc";

        assertThatThrownBy(() -> {
            actual.charAt(3);
        }).isInstanceOf(IndexOutOfBoundsException.class)
          .hasMessageContaining("String index out of range: "+actual.length());

    }

}
