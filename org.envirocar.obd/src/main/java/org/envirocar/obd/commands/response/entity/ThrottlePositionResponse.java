package org.envirocar.obd.commands.response.entity;

import org.envirocar.obd.commands.response.DataResponse;

/**
 * Created by matthes on 30.10.15.
 */
public class ThrottlePositionResponse extends DataResponse {
    private final int value;

    public ThrottlePositionResponse(int v) {
        this.value = v;
    }

    public int getValue() {
        return value;
    }
}
