package com.base.es.model;

import lombok.Data;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@Document(indexName = "stu-test")
@Component
public class Stu implements Serializable {

    @Id
    private Long id;

    private String username;

    private String remark;
}
