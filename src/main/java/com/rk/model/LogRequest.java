package com.rk.model;

import lombok.Data;

import java.util.List;

@Data
public class LogRequest {
    private List<Request> requests;
}
