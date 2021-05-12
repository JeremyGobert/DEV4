package be.ehb.multec.data;
import be.ehb.multec.model.*;

import java.util.List;

public interface BoekRepository {
    boek getboek(int id);
    void removeboek(boek boek);
    void addboek(boek boek);
    List<boek> getboeks(String nameFilter);
    void updateBoek(int id, String nameFilter);
}
