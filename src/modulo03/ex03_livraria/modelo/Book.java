package modulo03.ex03_livraria.modelo;

import modulo03.ex03_livraria.abstracts.Product;
import modulo03.ex03_livraria.utils.ProductType;

import java.util.List;

public class Book extends Product {

    private List<String> genders;
    private String writer;
    private String publishingHouse;

    public Book(Long id, String name, double price, ProductType productType, List<String> genders, String writer, String publishingHouse) {
        super(id, name, price, productType);
        this.genders = genders;
        this.writer = writer;
        this.publishingHouse = publishingHouse;
    }

    public List<String> getGenders() {
        return genders;
    }

    public void setGenders(List<String> genders) {
        this.genders = genders;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    @Override
    public String toString() {
        return "Livro{"  +
                "id=" + super.getId() +
                ", nome='" + super.getName() + '\'' +
                ", preco=" + super.getPrice() +
                "generos=" + genders +
                ", escritor='" + writer + '\'' +
                ", editora='" + publishingHouse + '\'' +
                '}';
    }
}
