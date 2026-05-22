package testing.dataclasses.strategies.rates;

import java.util.Set;

public class AvaliableRatesAMR extends AvaliableRates{
    @Override
    public Set<String> getAvaliableRates() {
        return Set.of("8", "16");
    }
}
