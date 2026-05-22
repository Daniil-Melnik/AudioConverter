package testing.dataclasses.strategies.rates;

import java.util.Set;

public class AvaliableRatesMP2 extends AvaliableRates{
    @Override
    public Set<String> getAvaliableRates() {
        return Set.of("32", "44.1", "48");
    }
}
