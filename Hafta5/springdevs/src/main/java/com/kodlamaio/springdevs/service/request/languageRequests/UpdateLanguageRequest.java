package com.kodlamaio.springdevs.service.request.languageRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class UpdateLanguageRequest {
    private int id;
    private String name;
}
