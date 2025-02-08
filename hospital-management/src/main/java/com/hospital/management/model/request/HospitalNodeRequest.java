package com.hospital.management.model.request;

import lombok.Data;

@Data
public class HospitalNodeRequest {

    private String name;

    private String type;

    private Long parentId;
}
