package testing.model.dataclasses.strategies.rates;

import java.util.Set;

public class AvaliableRatesAAC extends AvaliableRates{
    @Override
    public Set<String> getAvaliableRates() {
        return Set.of("8000", "11025", "12000", "16000", "22050", "24000", "32000", "44100", "48000", "96000");
    }
}
