package modulo03.ex03_livraria.modelo;

import modulo03.ex03_livraria.abstracts.Person;

import java.time.LocalDate;

public class Customer extends Person {

    private boolean ofAge;

    public Customer(String name, String rg, String cpf, LocalDate birthDate) {
        super(name, rg, cpf, birthDate);
        this.ofAge = verifyAge();
    }

    private boolean verifyAge() {
        int age = LocalDate.now().getYear() - super.getBirthDate().getYear();

        if(age < 18) {
            return ofAge = false;
        }
        return ofAge = true;
    }

    public boolean getOfAge() {
        verifyAge();
        return ofAge;
    }
}
