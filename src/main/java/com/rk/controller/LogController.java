package com.rk.controller;

import com.rk.model.LogRequest;
import com.rk.service.LogService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class LogController {

    private final LogService logService;

    @PostMapping("/store")
    public String storeLog(@RequestBody LogRequest logRequest) {
        logService.storeLogs(logRequest);
        return "DONE";
    }
}
