import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

public class BloomFilterDemo {

    private final BloomFilter<Integer> filter;

    public BloomFilterDemo() {
        filter = BloomFilter.create(
                Funnels.integerFunnel(),
                500,
                0.01);

        /*
        String filter example:
        BloomFilter<String> blackListedIps
            = BloomFilter.create(
                Funnels.stringFunnel(
                    Charset.forName("UTF-8")),
                10000);
         */
    }

    public void add(int element) {
        filter.put(element);
    }

    public boolean contains(int element) {
        return filter.mightContain(element);
    }
}
