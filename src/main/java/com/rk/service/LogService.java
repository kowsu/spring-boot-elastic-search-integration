package com.rk.service;

import com.rk.dao.LogEntity;
import com.rk.mapper.LogEntityMapper;
import com.rk.model.LogRequest;
import com.rk.repo.LogRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class LogService {

    private final LogRepo logRepo;
    private final LogEntityMapper logEntityMapper;

    public String storeLogs(LogRequest logRequest) {
        List<LogEntity> entities = logRequest.getRequests().stream().map(logEntityMapper::logEntity).collect(Collectors.toList());
        Iterable<LogEntity> logEntities = logRepo.saveAll(entities);
        return String.format("%s %d", "Entities store count ", logEntities.spliterator().estimateSize());
    }
}
