package com.kodlamaio.springdevs.service.response.technologyResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class GetByIdTechnologyResponse {
    private int id;
    private String name;
    private int languageId;
}
