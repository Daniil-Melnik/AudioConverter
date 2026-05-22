package testing.dataclasses.strategies.rates;

import java.util.Set;

public class AvaliableRatesFLAC extends AvaliableRates{
    @Override
    public Set<String> getAvaliableRates() {
        return Set.of("8", "11.025", "16", "22.05", "32", "44.1", "48", "88.2", "96", "192");
    }
}
