package com.webapps.assignmentsubmissionapp_api.domain;

import jakarta.persistence.*;
import lombok.Data;




@Entity
@Data
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    private String gitHubUrl;
    private String branchName;
    private String codeReviewUrl;
    @ManyToOne(optional = false)
    private User assignedTo;


}
