package com.example.LLD.paymentgateway.instrument;

public class Instrument {
    private int instrumentId;
    private InstrumentType instrumentType;

    public Instrument(int instrumentId, InstrumentType instrumentType) {
        this.instrumentId = instrumentId;
        this.instrumentType = instrumentType;
    }

    public int getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(int instrumentId) {
        this.instrumentId = instrumentId;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }
}
