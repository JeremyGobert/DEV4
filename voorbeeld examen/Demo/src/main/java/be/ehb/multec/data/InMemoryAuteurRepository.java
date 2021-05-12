package be.ehb.multec.data;

import be.ehb.multec.model.auteur;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*public class InMemoryAuteurRepository implements AuteurRepository {
    private final List<auteur> auteurs;

    public InMemoryAuteurRepository() {
        auteurs = new ArrayList<>();
        auteurs.add(new auteur(1, "kaaakak", "fwinjfow", LocalDate.of(1989, 5, 5)));
        auteurs.add(new auteur(1, "kkak", "fwinjfow", LocalDate.of(1989, 5, 5)));
        auteurs.add(new auteur(1, "kakak", "fwinjfow", LocalDate.of(1989, 5, 5)));
        auteurs.add(new auteur(1, "kak", "fwinjfow", LocalDate.of(1987, 5, 5)));
    }

    @Override
    public List<auteur> getauteurs(String nameFilter, boolean caseSensitive) {
        if(nameFilter == null || nameFilter.trim().length() == 0) return Collections.unmodifiableList(auteurs);
        List<auteur> res = new ArrayList<>();
        for(auteur auteur: auteurs) {
            String naam = auteur.getNaam();
            String voornaam = auteur.getVoornaam();
            if(!caseSensitive) {
                naam = naam.toLowerCase();
                voornaam = voornaam.toLowerCase();
                nameFilter = nameFilter.toLowerCase();
            }
            if(naam.contains(nameFilter) || voornaam.contains(nameFilter))
                res.add(auteur);
        }

        return res;
    }

    @Override
    public auteur getauteur(int id) {
        for(auteur auteur: auteurs)
            if(auteur.getId() == id)
                return auteur;
        return null;
    }

    @Override
    public void removeauteur(auteur auteur) { auteurs.remove(auteur); }

    private int maxID() {
        int id = -1;
        for(auteur auteur: auteurs)
            if(auteur.getId() > id)
                id = auteur.getId();
        return id;
    }


    @Override
    public void addauteur(auteur auteur) {
        if(getauteur(auteur.getId()) == null) {
            auteurs.add(auteur);
            auteur.setId(maxID()+1);
        }
    }




}*/
