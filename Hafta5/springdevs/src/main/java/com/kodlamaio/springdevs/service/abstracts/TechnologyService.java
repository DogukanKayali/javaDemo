package com.kodlamaio.springdevs.service.abstracts;

import com.kodlamaio.springdevs.service.request.technologyRequests.CreateTechnologyRequest;
import com.kodlamaio.springdevs.service.request.technologyRequests.DeleteTechnologyRequest;
import com.kodlamaio.springdevs.service.request.technologyRequests.UpdateTechnologyRequest;
import com.kodlamaio.springdevs.service.response.technologyResponse.GetAllTechnologyResponse;
import com.kodlamaio.springdevs.service.response.technologyResponse.GetByIdTechnologyResponse;

import java.util.List;

public interface TechnologyService {
    List<GetAllTechnologyResponse> getAll();

    void add(CreateTechnologyRequest technologyRequestRequest);

    void delete(DeleteTechnologyRequest languageRequest);

    GetByIdTechnologyResponse getById(int id);

    void update(UpdateTechnologyRequest technologyRequest);
}
