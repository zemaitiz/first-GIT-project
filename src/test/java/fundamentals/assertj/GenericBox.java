package fundamentals.assertj;


import org.assertj.core.api.Assertions;
import org.junit.Test;

public class GenericBox {

    @Test
    public void testAssertJMatchers() {

        // given
        String text = "abc";
        String[] stringArray = {"abc", "cde", "efg"};

        // then
        Assertions.assertThat(text)
                .isEqualTo("abc");

      Assertions.assertThat(stringArray)
                .hasSize(3)
    .contains("cde")
    .doesNotContain("xyz");
    }
}
