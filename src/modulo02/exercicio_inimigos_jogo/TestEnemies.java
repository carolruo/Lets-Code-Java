package modulo02.exercicio_inimigos_jogo;

public class TestEnemies {
    public static void main(String[] args) {

        Vampire vampire = new Vampire();
        Snake snake = new Snake();
        Giant giant = new Giant();

        vampire.hit(AttackType.PIERCING, 10);

        snake.interact();

        giant.atack();
    }
}
