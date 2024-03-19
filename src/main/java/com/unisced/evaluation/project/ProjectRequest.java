package com.unisced.evaluation.project;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.Date;

@Getter
@Setter
@Builder
public class ProjectRequest {
    @Id
    @GeneratedValue
     private Integer projectId;
     private String projectName;
     private Date startDate;
     private Date endDate;
     private String description;
     private Boolean status;
}
