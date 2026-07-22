package testing.model.dataclasses.strategies.rates.impl;

import testing.model.dataclasses.strategies.rates.AvaliableRates;

import java.util.Set;

public class AvaliableRatesAMR extends AvaliableRates {
    @Override
    public Set<String> getAvaliableRates() {
        return Set.of("8000", "16000");
    }
}
