package com.softserveinc.processor;

import com.softserveinc.model.Envelope;
import com.softserveinc.service.EnvelopeApi;
import com.softserveinc.util.Console;


public class EnvelopeProcessor {

    private EnvelopeApi envelopeApi;

    public EnvelopeProcessor(EnvelopeApi envelopeApi) {
        this.envelopeApi = envelopeApi;
    }

    public void process() {
        boolean shouldContinue = true;
        while (shouldContinue) {
            float firstSideOfFirstEnvelope = Console.getPositiveFloat
                    ("Please set value to first side of first service.");
            float secondSideOfFirstEnvelope = Console.getPositiveFloat
                    ("Please set value to second side of first service.");
            float firstSideOfSecondEnvelope = Console.getPositiveFloat
                    ("Please set value to first side of second service.");
            float secondSideOfSecondEnvelope = Console.getPositiveFloat
                    ("Please set value to second side of second service.");
            envelopeApi.compare(new Envelope(firstSideOfFirstEnvelope, secondSideOfFirstEnvelope,
                    firstSideOfSecondEnvelope, secondSideOfSecondEnvelope));
            shouldContinue = Console.confirmation("Do you want to continue?");
        }
    }

}