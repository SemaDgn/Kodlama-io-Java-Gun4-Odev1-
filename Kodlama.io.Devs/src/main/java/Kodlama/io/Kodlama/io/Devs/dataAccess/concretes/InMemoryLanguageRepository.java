package Kodlama.io.Kodlama.io.Devs.dataAccess.concretes;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	private List<Language> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<>();
		languages.add(new Language(1,"Java"));
		languages.add(new Language(2,"C#"));
		languages.add(new Language(3,"Python"));
		languages.add(new Language(4,"Kotlin"));
		languages.add(new Language(5,"Swift"));
	}


	@Override
	public void add(Language language) {
		
		System.out.println("Kurs eklendi." + language.getName());		
	}
	

	@Override
	public void delete(Language language) {
		System.out.println("Kurs silindi." + language.getName());	

	}

	@Override
	public void update(int id,Language language) {
		System.out.println("Kurs güncellendi." + language.getName());	

	}

	@Override
	public List<Language> getAll() {	
		
		return languages;

	}



}
