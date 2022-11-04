package kodlama.io.Devs.dataAccess.abstracts;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

import java.util.Set;

public interface ProgrammingLanguageRepository {
    Set<ProgrammingLanguage> getAll();

    ProgrammingLanguage getById(int id);

    void addLanguage(int id, String name);

    void deleteLanguage(int id) throws Exception;

    void updateLanguage(int id, String name);
}
