package com.rk.repo;


import com.rk.dao.LogEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepo extends ElasticsearchRepository<LogEntity, String> {
}
