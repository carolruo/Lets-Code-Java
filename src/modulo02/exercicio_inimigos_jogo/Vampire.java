package modulo02.exercicio_inimigos_jogo;

public class Vampire extends GenericEnemy {

    @Override
    public void atack() {
        System.out.println("Enemy dealt 20 damage");
        System.out.println("Your character is bleeding");
    }

    @Override
    public void hit(AttackType attack, int damage) {
        if (attack.equals(AttackType.PIERCING)) {
            System.out.println("Piercing attack! Enemy received " + (damage*2) + " damage");
        } else {
            System.out.println("Enemy received " + damage + " damage");
        }
    }

    @Override
    public void interact() {
        System.out.println("What is a man?");
    }
}
