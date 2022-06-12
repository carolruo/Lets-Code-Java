package modulo03.ex03_livraria.modelo;

import modulo03.ex03_livraria.abstracts.Product;
import modulo03.ex03_livraria.utils.ProductType;

import java.util.List;

public class MusicAlbum extends Product {

    private String band;
    private List<String> genders;
    private List<String> musicLabel;

    public MusicAlbum(Long id, String name, double price, ProductType productType, String bands, List<String> genders, List<String> musicLabel) {
        super(id, name, price, productType);
        this.band = bands;
        this.genders = genders;
        this.musicLabel = musicLabel;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public List<String> getGenders() {
        return genders;
    }

    public void setGenders(List<String> genders) {
        this.genders = genders;
    }

    public List<String> getMusicLabel() {
        return musicLabel;
    }

    public void setMusicLabel(List<String> musicLabel) {
        this.musicLabel = musicLabel;
    }

    @Override
    public String toString() {
        return "MusicAlbum{" + super.toString() +
                " band='" + band + '\'' +
                ", genders=" + genders +
                ", musicLabel=" + musicLabel +
                "} ";
    }
}
