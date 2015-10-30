package org.envirocar.obd.commands.response.entity;

import org.envirocar.obd.commands.response.DataResponse;

/**
 * Created by matthes on 30.10.15.
 */
public class LambdaProbeVoltageResponse extends DataResponse {
    private final double voltage;
    private final double equivalenceRation;

    public LambdaProbeVoltageResponse(double voltage, double er) {
        this.voltage = voltage;
        this.equivalenceRation = er;
    }

    public double getVoltage() {
        return voltage;
    }

    public double getEquivalenceRation() {
        return equivalenceRation;
    }
}
