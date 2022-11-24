package com.kodlamaio.springdevs.service.concretes;

import com.kodlamaio.springdevs.dao.ProgrammingLanguageRepository;
import com.kodlamaio.springdevs.dao.TechnologyRepository;
import com.kodlamaio.springdevs.model.ProgrammingLanguage;
import com.kodlamaio.springdevs.model.Technology;
import com.kodlamaio.springdevs.service.abstracts.TechnologyService;

import com.kodlamaio.springdevs.service.request.technologyRequests.CreateTechnologyRequest;
import com.kodlamaio.springdevs.service.request.technologyRequests.DeleteTechnologyRequest;
import com.kodlamaio.springdevs.service.request.technologyRequests.UpdateTechnologyRequest;
import com.kodlamaio.springdevs.service.response.technologyResponse.GetAllTechnologyResponse;
import com.kodlamaio.springdevs.service.response.technologyResponse.GetByIdTechnologyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TechnologyManager implements TechnologyService {

    private TechnologyRepository technologyRepository;

    private ProgrammingLanguageRepository languageRepository;
    @Autowired
    public TechnologyManager(TechnologyRepository technologyRepository, ProgrammingLanguageRepository languageRepository) {
        this.technologyRepository = technologyRepository;
        this.languageRepository = languageRepository;
    }


    @Override
    public List<GetAllTechnologyResponse> getAll() {
        List<Technology> technologies = technologyRepository.findAll();
        List<GetAllTechnologyResponse> technologyResponses = new ArrayList<>();
        for (Technology technology:technologies){
            GetAllTechnologyResponse response = new GetAllTechnologyResponse();
            response.setTechnologyId(technology.getId());
            response.setTechnologyName(technology.getName());
            response.setLanguageId(technology.getLanguage().getId());
            technologyResponses.add(response);
        }
        return technologyResponses;
    }

    @Override
    public void add(CreateTechnologyRequest technologyRequest) {
        Technology technology = new Technology();
        ProgrammingLanguage language = languageRepository.findById(technologyRequest.getLanguageId()).get();
        List<Technology> technologies = technologyRepository.findAll();
        for (Technology technology1:technologies){
            if (technology1.getName().equals(technologyRequest.getName())){
                throw new RuntimeException("Bu isimde alt sınıf mevcut");
            }
        }if(technologyRequest.getName().isEmpty()){
            throw new RuntimeException("İsim boş bırakılamaz");
        }else{
            technology.setName(technologyRequest.getName());
            technology.setLanguage(language);
            technologyRepository.save(technology);
        }
    }
    @Override
    public void delete(DeleteTechnologyRequest technologyRequest) {
        Technology technology = technologyRepository.findById(technologyRequest.getId()).get();
        technologyRepository.delete(technology);

    }
    
    @Override
    public GetByIdTechnologyResponse getById(int id) {
        List<Technology> technologies = technologyRepository.findAll();
        GetByIdTechnologyResponse technologyResponse = new GetByIdTechnologyResponse();
        for (Technology technology:technologies){
            if (technology.getId() == id){
                technologyResponse.setId(technology.getId());
                technologyResponse.setName(technology.getName());
                technologyResponse.setLanguageId(technology.getLanguage().getId());
            }
        }
        return technologyResponse;
    }

    @Override
    public void update(UpdateTechnologyRequest technologyRequest) {
        Technology technology = technologyRepository.findById(technologyRequest.getId()).get();
        technology.setId(technologyRequest.getId());
        technology.setName(technologyRequest.getName());
        technologyRepository.save(technology);

    }
}
