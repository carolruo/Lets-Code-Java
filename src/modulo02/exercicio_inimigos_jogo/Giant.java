package modulo02.exercicio_inimigos_jogo;

public class Giant extends GenericEnemy {

    @Override
    public void atack() {
        System.out.println("Enemy dealt 20 damage");
        System.out.println("Your character is stunned");
    }

    @Override
    public void hit(AttackType attack, int damage) {
        if (attack.equals(AttackType.FIRE)) {
            System.out.println("Fire attack! Enemy received " + (damage*2) + " damage");
        } else {
            System.out.println("Enemy received " + damage + " damage");
        }
    }

    @Override
    public void interact() {
        System.out.println("I'm sorry");
    }
}
