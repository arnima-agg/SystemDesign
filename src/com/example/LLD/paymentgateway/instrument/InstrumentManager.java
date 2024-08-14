package com.example.LLD.paymentgateway.instrument;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class InstrumentManager {
    Map<Integer, List<Instrument>> instrumentMap = new HashMap<>();
    InstrumentFactory instrumentFactory = new InstrumentFactory();

    public void addInstrument(Instrument instrument) {
        Instrument instrument1 = instrumentFactory.getInstance(instrument.getInstrumentType());
    }
}
