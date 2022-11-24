package com.kodlamaio.springdevs.service.response.technologyResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GetAllTechnologyResponse {
    private int technologyId;
    private String technologyName;
    private int languageId;
}
