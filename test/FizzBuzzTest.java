import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void shouldReturnFizzWhenNumberIsDivisibleByThree() {
        assertThat(fizzBuzz.compute(6)).isEqualTo("Fizz");
    }
    @Test
    void shouldReturnFizzWizzWhenNumberIsDivisibleByThreeAndPrime() {
        assertEquals("FizzWizz", fizzBuzz.compute(3));
    }

    @Test
    void shouldReturnBuzzWhenNumberIsDivisibleByFive() {
        assertEquals("Buzz", fizzBuzz.compute(10));
    }

    @Test
    void shouldReturnWizzBuzzWhenNumberIsDivisibleByFiveAndPrime() {
        assertEquals("BuzzWizz", fizzBuzz.compute(5));
    }

    @Test
    void shouldReturnTheNumberWhenNotDivisibleByThreeOrFive() {
        assertEquals("1", fizzBuzz.compute(1));
    }

    @Test
    void shouldReturnFizzBuzzIfDivisibleByThreeAndFive() {
        assertEquals("FizzBuzz", fizzBuzz.compute(15));
    }

    @Test
    void shouldReturnWizzIfPrime() {
        assertEquals("Wizz", fizzBuzz.compute(2));
        assertEquals("Wizz", fizzBuzz.compute(7));
        assertEquals("Wizz", fizzBuzz.compute(11));
        assertEquals("1", fizzBuzz.compute(1));
    }

    @Test
    public void shouldReturnAStringOfCommaDelimitedStrings() {
        String result = fizzBuzz.play(15);
        System.out.println(result);
        assertEquals("1, Wizz, FizzWizz, 4, BuzzWizz, Fizz, Wizz, 8, Fizz, Buzz, Wizz, Fizz, Wizz, 14, FizzBuzz", result);
    }
}
