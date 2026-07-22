package testing.model.dataclasses.strategies.rates.impl;

import testing.model.dataclasses.strategies.rates.AvaliableRates;

import java.util.Set;

public class AvaliableRatesMP2 extends AvaliableRates {
    @Override
    public Set<String> getAvaliableRates() {
        return Set.of("32000", "44100", "48000");
    }
}
