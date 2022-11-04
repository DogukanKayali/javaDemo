package kodlama.io.Devs.business.abstracts;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

import java.util.Set;

public interface ProgrammingLanguageService {
    Set<ProgrammingLanguage> getAll();

    ProgrammingLanguage getById();

    void addLanguage();

    void deleteLanguage();

    void updateLanguage();
}
