package testing.dataclasses.strategies.rates;

import java.util.Set;

public class AvaliableRatesWMA extends AvaliableRates{
    @Override
    public Set<String> getAvaliableRates() {
        return Set.of("8", "11.025", "16", "22.05", "32", "44.1", "48");
    }
}
