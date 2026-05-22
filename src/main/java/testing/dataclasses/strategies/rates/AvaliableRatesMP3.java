package testing.dataclasses.strategies.rates;

import java.util.Set;

public class AvaliableRatesMP3 extends AvaliableRates{
    @Override
    public Set<String> getAvaliableRates() {
        return Set.of("8", "11.025", "12", "16", "22.05", "24", "32", "44.1", "48");
    }
}
