package com.softserveinc.main.service.implementation;

import com.softserveinc.main.model.Envelope;
import com.softserveinc.main.service.EnvelopeApi;

public class EnvelopeService implements EnvelopeApi {

    @Override
    public int compare(Envelope envelope){
        if (envelope.getFirstSideOfFirstEnvelope() > envelope.getFirstSideOfSecondEnvelope()
                && envelope.getSecondSideOfFirstEnvelope() > envelope.getSecondSideOfSecondEnvelope()) {
            return 1;
        } else if (envelope.getFirstSideOfFirstEnvelope() < envelope.getFirstSideOfSecondEnvelope()
                && envelope.getSecondSideOfFirstEnvelope() < envelope.getSecondSideOfSecondEnvelope()) {
            return 2;
        } else if (envelope.getFirstSideOfFirstEnvelope() == envelope.getFirstSideOfSecondEnvelope()
                && envelope.getSecondSideOfFirstEnvelope() == envelope.getSecondSideOfSecondEnvelope()) {
            return 0;
        } else {
            return -1;
        }
    }
}
