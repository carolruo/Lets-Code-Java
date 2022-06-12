package modulo03.ex03_livraria.modelo;

import modulo03.ex03_livraria.abstracts.Product;
import modulo03.ex03_livraria.utils.ProductType;

import java.util.List;

public class Movie extends Product {

    private String studio;
    private List<String> directors;
    private List<String> genders;
    private  List<String> productors;

    public Movie(Long id, String name, double price, ProductType productType, String studio, List<String> directors, List<String> genders, List<String> productors) {
        super(id, name, price, productType);
        this.studio = studio;
        this.directors = directors;
        this.genders = genders;
        this.productors = productors;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public List<String> getDirectors() {
        return directors;
    }

    public void setDirectors(List<String> directors) {
        this.directors = directors;
    }

    public List<String> getGenders() {
        return genders;
    }

    public void setGenders(List<String> genders) {
        this.genders = genders;
    }

    public List<String> getProductors() {
        return productors;
    }

    public void setProductors(List<String> productors) {
        this.productors = productors;
    }

    @Override
    public String toString() {
        return "Movie{" + super.toString() +
                " studio='" + studio + '\'' +
                ", directors=" + directors +
                ", genders=" + genders +
                ", productors=" + productors +
                "} ";
    }
}
