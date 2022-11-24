package com.kodlamaio.springdevs.controller;

import com.kodlamaio.springdevs.service.abstracts.TechnologyService;
import com.kodlamaio.springdevs.service.request.technologyRequests.CreateTechnologyRequest;
import com.kodlamaio.springdevs.service.request.technologyRequests.DeleteTechnologyRequest;
import com.kodlamaio.springdevs.service.request.technologyRequests.UpdateTechnologyRequest;
import com.kodlamaio.springdevs.service.response.technologyResponse.GetAllTechnologyResponse;
import com.kodlamaio.springdevs.service.response.technologyResponse.GetByIdTechnologyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/technology")
public class TechnologyController {
    private TechnologyService technologyService;
    @Autowired
    public TechnologyController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }

    @GetMapping("/getall")
    public List<GetAllTechnologyResponse> getAll(){
        return this.technologyService.getAll();
    }
    @PostMapping("/add")
    public void addLanguage(@RequestBody CreateTechnologyRequest technologyRequest){

        this.technologyService.add(technologyRequest);
    }
    @DeleteMapping("/delete")
    public void deleteLanguage(@RequestBody DeleteTechnologyRequest technologyRequest) {
        this.technologyService.delete(technologyRequest);
    }
    @GetMapping("/get/{id}")
    public GetByIdTechnologyResponse getById(@PathVariable("id")  int id){
        return technologyService.getById(id);
    }
    @PutMapping("/update")
    public void updateLanguage(@RequestBody UpdateTechnologyRequest technologyRequest){
        technologyService.update(technologyRequest);
    }
}
