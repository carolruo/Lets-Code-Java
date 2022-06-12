package modulo03.ex03_livraria.modelo;

import modulo03.ex03_livraria.abstracts.Product;
import modulo03.ex03_livraria.utils.ProductType;

public class Game extends Product {

    private String distributor;
    private String gender;
    private String studio;

    public Game(Long id, String name, double price, ProductType productType, String distributor, String gender, String studio) {
        super(id, name, price, productType);
        this.distributor = distributor;
        this.gender = gender;
        this.studio = studio;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    @Override
    public String toString() {
        return "Game{" + super.toString() +
                " distributor='" + distributor + '\'' +
                ", gender='" + gender + '\'' +
                ", studio='" + studio + '\'' +
                '}';
    }
}
