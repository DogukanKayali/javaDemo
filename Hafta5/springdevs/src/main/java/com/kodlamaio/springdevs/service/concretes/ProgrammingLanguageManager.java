package com.kodlamaio.springdevs.service.concretes;

import com.kodlamaio.springdevs.dao.ProgrammingLanguageRepository;
import com.kodlamaio.springdevs.model.ProgrammingLanguage;
import com.kodlamaio.springdevs.service.abstracts.ProgrammingLanguageService;
import com.kodlamaio.springdevs.service.request.languageRequests.CreateLanguageRequest;
import com.kodlamaio.springdevs.service.request.languageRequests.DeleteLanguageRequest;
import com.kodlamaio.springdevs.service.request.languageRequests.UpdateLanguageRequest;
import com.kodlamaio.springdevs.service.response.languageResponse.GetAllLanguagesResponse;
import com.kodlamaio.springdevs.service.response.languageResponse.GetByIdLanguageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository languageRepository;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<GetAllLanguagesResponse> getAll() {
        List<ProgrammingLanguage> languages = languageRepository.findAll();
        List<GetAllLanguagesResponse> languagesResponses = new ArrayList<>();

        for (ProgrammingLanguage language : languages) {
            GetAllLanguagesResponse response = new GetAllLanguagesResponse();
            response.setLanguageId(language.getId());
            response.setLanguageName(language.getName());
            languagesResponses.add(response);
        }
        return languagesResponses;
    }

    @Override
    public void addLanguage(CreateLanguageRequest languageRequest) {
        ProgrammingLanguage language = new ProgrammingLanguage();
        List<ProgrammingLanguage> programmingLanguages = languageRepository.findAll();
        for (ProgrammingLanguage language1 : programmingLanguages) {
            if (language1.getName().equals(languageRequest.getName())) {
                throw new RuntimeException("Bu isimde Programlama dili mevcut");
            }
        }
        if (languageRequest.getName().isEmpty()) {
            throw new RuntimeException("Programlama dili boş bırakılamaz");
        } else {
            language.setName(languageRequest.getName());
            this.languageRepository.save(language);
        }
    }

    @Override
    public void deleteLanguage(DeleteLanguageRequest languageRequest) throws Exception {
        ProgrammingLanguage language = languageRepository.findById(languageRequest.getId()).get();
        try {
            this.languageRepository.delete(language);
        } catch (DataIntegrityViolationException e) {
            throw new Exception("Bu dile ait alt sınıf mevcut");
        }
    }

    @Override
    public GetByIdLanguageResponse getById(int id) {
        List<ProgrammingLanguage> languages = languageRepository.findAll();
        GetByIdLanguageResponse response = new GetByIdLanguageResponse();
        for (ProgrammingLanguage language : languages) {
            if (language.getId() == id) {
                response.setLanguageId(language.getId());
                response.setLanguageName(language.getName());
            }
        }
        return response;

    }

    @Override
    public void update(UpdateLanguageRequest languageRequest) {
        List<ProgrammingLanguage> languages = languageRepository.findAll();

        if (languageRequest.getName().isEmpty() || languageRequest.getId() == ' ') {
            throw new RuntimeException("İsim ve id kısmı boş bırakılamaz");
        }
        for (ProgrammingLanguage language1 : languages) {
            if (language1.getName().equals(languageRequest.getName())) {
                throw new RuntimeException("Programalama dili mevcut");
            }
            }
        for (ProgrammingLanguage language2 : languages) {
            if (language2.getId() == languageRequest.getId()) {
                ProgrammingLanguage language = languageRepository.findById(languageRequest.getId()).get();
                language.setId(languageRequest.getId());
                language.setName(languageRequest.getName());
                languageRepository.save(language);
            }
        }
    }
}
