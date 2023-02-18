package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {
    Turtle zofka = new Turtle();
    public void start() {

        zofka.turnLeft(90);

        nakresliDum();

        zofka.penUp();
        zofka.turnRight(135);
        zofka.move(100);

        nakresliNohy();

        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(115);
        zofka.move(150);
        zofka.turnRight(90);

        nakresliNohy();


        //TODO implementace domácího úkolu
    }

    public void nakresliDum() {

        for (int i = 0; i < 2; i++) {
            zofka.move(150);
            zofka.turnRight(90);
            zofka.move(100);
            zofka.turnRight(90);
        }
        zofka.penUp();
        zofka.move(150);
        zofka.penDown();

        zofka.turnRight(45);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(70);
    }

    public void nakresliNohy() {
        zofka.penDown();
        zofka.turnRight(25);
        zofka.move(30);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(130);
        zofka.penDown();
        zofka.move(30);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
