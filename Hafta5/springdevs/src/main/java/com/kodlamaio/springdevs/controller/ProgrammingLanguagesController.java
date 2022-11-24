package com.kodlamaio.springdevs.controller;

import com.kodlamaio.springdevs.service.abstracts.ProgrammingLanguageService;
import com.kodlamaio.springdevs.service.request.languageRequests.CreateLanguageRequest;
import com.kodlamaio.springdevs.service.request.languageRequests.DeleteLanguageRequest;
import com.kodlamaio.springdevs.service.request.languageRequests.UpdateLanguageRequest;
import com.kodlamaio.springdevs.service.response.languageResponse.GetAllLanguagesResponse;
import com.kodlamaio.springdevs.service.response.languageResponse.GetByIdLanguageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/languages")
public class ProgrammingLanguagesController {

    private ProgrammingLanguageService languagesService;
    @Autowired
    public ProgrammingLanguagesController(ProgrammingLanguageService languagesService) {
        this.languagesService = languagesService;
    }
    @GetMapping("/getall")
    public List<GetAllLanguagesResponse> getAll(){
        return this.languagesService.getAll();
    }
    @PostMapping("/add")
    public void addLanguage(@RequestBody CreateLanguageRequest languageRequest){

        this.languagesService.addLanguage(languageRequest);
    }
    @DeleteMapping("/delete")
    public void deleteLanguage(@RequestBody DeleteLanguageRequest languageRequest) throws Exception {
        this.languagesService.deleteLanguage(languageRequest);
    }
    @GetMapping("/get/{id}")
    public GetByIdLanguageResponse getById(@PathVariable("id")  int id){
        return languagesService.getById(id);
    }
    @PutMapping("/update")
    public void updateLanguage(@RequestBody UpdateLanguageRequest languageRequest){
        languagesService.update(languageRequest);
    }



}
