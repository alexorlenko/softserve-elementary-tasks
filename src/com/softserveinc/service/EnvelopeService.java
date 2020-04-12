package com.softserveinc.service;

import com.softserveinc.model.Envelope;

public class EnvelopeService implements EnvelopeApi {

    @Override
    public void compare(Envelope envelope){
        if (envelope.getFirstSideOfFirstEnvelope() > envelope.getFirstSideOfSecondEnvelope()
                && envelope.getSecondSideOfFirstEnvelope() > envelope.getSecondSideOfSecondEnvelope()) {
            System.out.println("Second service can be placed into the first one.");
        } else if (envelope.getFirstSideOfFirstEnvelope() < envelope.getFirstSideOfSecondEnvelope()
                && envelope.getSecondSideOfFirstEnvelope() < envelope.getSecondSideOfSecondEnvelope()) {
            System.out.println("First service can be placed into the second one.");
        } else if (envelope.getFirstSideOfFirstEnvelope() == envelope.getFirstSideOfSecondEnvelope()
                && envelope.getSecondSideOfFirstEnvelope() == envelope.getSecondSideOfSecondEnvelope()) {
            System.out.println("Envelopes are equal.");
        } else {
            System.out.println("Envelopes can't be included into each other.");
        }
    }
}
