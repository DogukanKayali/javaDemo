package kodlama.io.Devs.webApi.controllers;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguageController {
    private ProgrammingLanguageService programmingLanguageService;

    public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getall")
    public Set<ProgrammingLanguage> getAll(){
        return programmingLanguageService.getAll();
    }
    @GetMapping("/getid")
    public ProgrammingLanguage getById(){
        return programmingLanguageService.getById();
    }
    @GetMapping("/add")
    public void addLanguage(){
        programmingLanguageService.addLanguage();
    }
    @GetMapping("/delete")
    public void deleteLanguage() throws Exception {
        programmingLanguageService.deleteLanguage();
    }
    @GetMapping("/update")
    public void updateLanguage(){
        programmingLanguageService.updateLanguage();
    }
}
