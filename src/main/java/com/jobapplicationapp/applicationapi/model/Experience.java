package com.jobapplicationapp.applicationapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Experience {
    private String company;
    private String title;
    private String startDate;
    private String endDate;
    private String description;
    private boolean isCurrent;
}
