package modulo02.exercicio_inimigos_jogo;

public class Snake extends GenericEnemy {

    @Override
    public void atack() {
        System.out.println("Enemy dealt 10 damage");
        System.out.println("Your character is poisoned");
    }

    @Override
    public void hit(AttackType attack, int damage) {
        if (attack.equals(AttackType.BLOW)) {
            System.out.println("Blow attack! Enemy received " + (damage*2) + " damage");
        } else {
            System.out.println("Enemy received " + damage + " damage");
        }
    }

    @Override
    public void interact() {
        System.out.println("If you light the flame the curse ends");
    }
}
