package kodlama.io.Devs.dataAccess.concretes;

import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;


import java.util.HashSet;
import java.util.Set;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

    Set<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingLanguageRepository() {
        programmingLanguages = new HashSet<>();
        programmingLanguages.add(new ProgrammingLanguage(1, "Java"));
        programmingLanguages.add(new ProgrammingLanguage(2, "Python"));
        programmingLanguages.add(new ProgrammingLanguage(3, "C++"));
        programmingLanguages.add(new ProgrammingLanguage(4, "PHP"));
        programmingLanguages.add(new ProgrammingLanguage(5, "C#"));

    }

    @Override
    public Set<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public ProgrammingLanguage getById(int id) {

        for (ProgrammingLanguage language : programmingLanguages) {
            if (language.getId() == id) {
                return language;
            }
        }
        return null;
    }

    @Override
    public void addLanguage(int id, String name) {
        programmingLanguages.add(new ProgrammingLanguage(id, name));
    }

    @Override
    public void deleteLanguage(int id) {
        ProgrammingLanguage language = getById(id);
        programmingLanguages.remove(language);
    }

    public void updateLanguage(int id, String name){
        ProgrammingLanguage language = getById(id);
        language.setId(id);
        language.setName(name);
    }
}
