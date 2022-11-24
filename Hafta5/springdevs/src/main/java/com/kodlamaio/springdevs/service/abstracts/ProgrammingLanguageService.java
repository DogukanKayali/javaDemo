package com.kodlamaio.springdevs.service.abstracts;

import com.kodlamaio.springdevs.service.request.languageRequests.CreateLanguageRequest;
import com.kodlamaio.springdevs.service.request.languageRequests.DeleteLanguageRequest;
import com.kodlamaio.springdevs.service.request.languageRequests.UpdateLanguageRequest;
import com.kodlamaio.springdevs.service.response.languageResponse.GetAllLanguagesResponse;
import com.kodlamaio.springdevs.service.response.languageResponse.GetByIdLanguageResponse;

import java.util.List;

public interface ProgrammingLanguageService {
     List<GetAllLanguagesResponse> getAll();

     void addLanguage(CreateLanguageRequest languageRequest);

     void deleteLanguage(DeleteLanguageRequest languageRequest) throws Exception;

     GetByIdLanguageResponse getById(int id);

     void update(UpdateLanguageRequest languageRequest);
}
