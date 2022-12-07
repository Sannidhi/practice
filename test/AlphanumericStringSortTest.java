import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

public class AlphanumericStringSortTest {

    private AlphanumericStringSort alphaNumericSort = new AlphanumericStringSort();

    @Test
    public void shouldSortAndPrintResult() throws Exception {
        assertThat(alphaNumericSort.sort("Sorting0123456789")).isEqualTo("ginortS0246813579");
        assertThat(alphaNumericSort.sort("foobar1237348421")).isEqualTo("abfoor2244811337");
        assertThat(alphaNumericSort.sort("90856123456789")).isEqualTo("02466881355799");
    }

    @Test
    public void shouldReturnErrorIfStringIsNotAlphaNumericASCII() throws Exception {
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            alphaNumericSort.sort("!!!");
        }).withMessage(AlphanumericStringSort.INPUT_EXCEPTION_MESSAGE);
    }

    @Test
    public void shouldReturnErrorIfStringIsNull() throws Exception {
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            alphaNumericSort.sort(null);
        }).withMessage(AlphanumericStringSort.INPUT_EXCEPTION_MESSAGE);
    }
}
