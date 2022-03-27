package com.es.service;

import com.es.model.Stu;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface StuRepository  extends ElasticsearchRepository<Stu, String> {
}
