package com.rk.model;

import lombok.Data;

@Data
public class Request {
    private String logMessage;
    private String logLevel;
    private String timeFrame;
}
