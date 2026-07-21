package testing.model.dataclasses.strategies.rates;

import java.util.Set;

public class AvaliableRatesFLAC extends AvaliableRates{
    @Override
    public Set<String> getAvaliableRates() {
        return Set.of("8000", "11025", "16000", "22050", "32000", "44100", "48000", "88200", "96000", "192000");
    }
}
