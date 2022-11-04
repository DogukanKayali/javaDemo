package kodlama.io.Devs.business.concretes;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository programmingLanguageRepository;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public Set<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public ProgrammingLanguage getById() {
        return programmingLanguageRepository.getById(1);
    }

    @Override
    public void addLanguage() {
        programmingLanguageRepository.addLanguage(8, "Go");
    }

    @Override
    public void deleteLanguage() {
        try {
            programmingLanguageRepository.deleteLanguage(2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateLanguage() {
        programmingLanguageRepository.updateLanguage(3,"JavaScript");
    }

}
