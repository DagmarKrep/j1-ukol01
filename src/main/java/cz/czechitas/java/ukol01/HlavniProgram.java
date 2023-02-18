package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {
    Turtle zofka = new Turtle();
    public void start() {

//        zofka.penUp();
//        zofka.turnRight(90);
//        zofka.move(200);
//        zofka.turnRight(90);
//        zofka.move(200);
//        zofka.penDown();
//        zofka.turnLeft(180);
//
//        nakresliPrasatko();
//
//        zofka.penUp();
//        zofka.turnLeft(155);
//        zofka.move(450);
//        zofka.turnLeft(90);
//        zofka.move(450);
//        zofka.turnRight(90);
//        zofka.penDown();

        nakresliOsmiuhelnik();

        zofka.penUp();
        zofka.move(200);
        zofka.penDown();

        nakresliKolecko();

        zofka.penUp();
        zofka.turnLeft(15);
        zofka.move(180);
        zofka.penDown();

        nakresliSlunicko();

        }
    public void nakresliOsmiuhelnik() {
        zofka.turnRight(90);
        for (int i = 0; i < 8; i++) {
            zofka.move(50);
            zofka.turnRight(45);
        }
    }

    public void nakresliKolecko() {
        for (int i = 0; i < 75 ; i++) {
            zofka.move(5);
            zofka.turnRight(5);
        }
    }

    public void nakresliSlunicko() {
        for (int z = 0; z < 12; z++) {
            for (int i = 0; i < 6 ; i++) {
                zofka.move(5);
                zofka.turnRight(5);
            }
            zofka.turnLeft(90);
            zofka.move(30);
            zofka.penUp();
            zofka.turnRight(180);
            zofka.move(30);
            zofka.turnLeft(90);
            zofka.penDown();
        }
    }


//    public void nakresliPrasatko() {
//
//        zofka.turnLeft(90);
//
//        nakresliDum();
//
//        zofka.penUp();
//        zofka.turnRight(135);
//        zofka.move(100);
//
//        nakresliNohy();
//
//        zofka.penUp();
//        zofka.turnRight(180);
//        zofka.move(30);
//        zofka.turnRight(115);
//        zofka.move(150);
//        zofka.turnRight(90);
//
//        nakresliNohy();
//    }

//    public void nakresliDum() {
//
//        for (int i = 0; i < 2; i++) {
//            zofka.move(150);
//            zofka.turnRight(90);
//            zofka.move(100);
//            zofka.turnRight(90);
//        }
//        zofka.penUp();
//        zofka.move(150);
//        zofka.penDown();
//
//        zofka.turnRight(45);
//        zofka.move(70);
//        zofka.turnRight(90);
//        zofka.move(70);
//    }
//
//    public void nakresliNohy() {
//        zofka.penDown();
//        zofka.turnRight(25);
//        zofka.move(30);
//        zofka.penUp();
//        zofka.turnRight(180);
//        zofka.move(30);
//        zofka.turnRight(130);
//        zofka.penDown();
//        zofka.move(30);
//    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
