package com.kodlamaio.springdevs.service.response.languageResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetByIdLanguageResponse {
    private int languageId;
    private String languageName;
}
