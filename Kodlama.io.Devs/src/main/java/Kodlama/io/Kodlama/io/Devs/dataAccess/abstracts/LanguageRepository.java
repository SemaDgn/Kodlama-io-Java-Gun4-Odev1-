package Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;
import java.util.List;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	
	public void add(Language language) ;
	public void delete(Language language) ;
	public void update(int id,Language language) ;
	public List<Language> getAll() ;

}
