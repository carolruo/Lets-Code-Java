package modulo02.exercicio_inimigos_jogo;

public class GenericEnemy {

    public void atack() {
        System.out.println("Dealt 10 damage");
    }

    public void hit(AttackType attack, int damage) {
        System.out.println("Received " + damage + " damage");
    }

    public void interact() {
        System.out.println("Why should I answer my enemy?");
    }
}
