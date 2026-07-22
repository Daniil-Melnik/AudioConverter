package testing.model.dataclasses.strategies.rates.impl;

import testing.model.dataclasses.strategies.rates.AvaliableRates;

import java.util.Set;

public class AvaliableRatesMP3 extends AvaliableRates {
    @Override
    public Set<String> getAvaliableRates() {
        return Set.of("8000", "11025", "12000", "16000", "22050", "24000", "32000", "44100", "48000");
    }
}
