package com.softserveinc.main.processor;

import com.softserveinc.main.model.Envelope;
import com.softserveinc.main.service.EnvelopeApi;
import com.softserveinc.main.util.Util;


public class EnvelopeProcessor {

    private EnvelopeApi envelopeApi;

    public EnvelopeProcessor(EnvelopeApi envelopeApi) {
        this.envelopeApi = envelopeApi;
    }

    public void process() {
        boolean shouldContinue = true;
        while (shouldContinue) {
            float firstSideOfFirstEnvelope = Util.getPositiveFloat
                    ("Please set value to first side of first envelope.");
            float secondSideOfFirstEnvelope = Util.getPositiveFloat
                    ("Please set value to second side of first envelope.");
            float firstSideOfSecondEnvelope = Util.getPositiveFloat
                    ("Please set value to first side of second envelope.");
            float secondSideOfSecondEnvelope = Util.getPositiveFloat
                    ("Please set value to second side of second envelope.");
            switch (envelopeApi.compare(new Envelope(firstSideOfFirstEnvelope, secondSideOfFirstEnvelope,
                    firstSideOfSecondEnvelope, secondSideOfSecondEnvelope))) {
                case 1:
                    System.out.println("Second envelope can be placed into the first one.");
                    break;
                case 2:
                    System.out.println("First envelope can be placed into the second one.");
                    break;
                case 0:
                    System.out.println("Envelopes are equal.");
                    break;
                case -1:
                    System.out.println("Envelopes can't be included into each other.");
                    break;
            }
            shouldContinue = Util.confirmation("Do you want to continue?");
        }
    }

}