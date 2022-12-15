package Kodlama.io.Kodlama.io.Devs.business.concretes;
import java.util.List;
import org.springframework.stereotype.Service;
import Kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	
	private  LanguageRepository languageRepository;
	public LanguageManager(LanguageRepository languageRepository) {		
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {		
		return languageRepository.getAll();
	}


	@Override
	public void add(Language language) throws Exception {
		
		if(language != null) {
			for (Language lng : languageRepository.getAll()) {
				if(language.getName().equals(lng.getName())){
					throw new Exception("Aynı isimde olamaz.");
				}
				languageRepository.add(language);
			}
		}
		else
			throw new Exception("Boş yazılamaz.");
		
		
	}

	@Override
	public void delete(Language language) {
		languageRepository.delete(language);
		
	}


	@Override
	public void update(int id, Language language) {
		languageRepository.update(id,language);
		
	}

}
