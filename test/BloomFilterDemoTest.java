import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BloomFilterDemoTest {

    private final BloomFilterDemo filter = new BloomFilterDemo();

    @Test
    public void shouldReturnTrueWhenElementIsPresent() throws Exception {
        filter.add(1);
        filter.add(2);
        filter.add(3);

        assertThat(filter.contains(1)).isTrue();
        assertThat(filter.contains(2)).isTrue();
        assertThat(filter.contains(3)).isTrue();

        assertThat(filter.contains(100)).isFalse();
    }
}
