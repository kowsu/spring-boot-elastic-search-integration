package com.rk.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "log_index")
public class LogEntity {
    @Id
    private String id;
    private String logMessage;
    private String logLevel;
}