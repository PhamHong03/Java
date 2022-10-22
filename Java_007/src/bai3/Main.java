package bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.showSound();
        Cat cat = new Cat();
        cat.iRuning();

        Animals a = new Dog();

        Animals tiget = new Animals() {
            @Override
            public void showSound() {
                System.out.println("Humhh humhh");
            }
        };
        tiget.showSound();
        Animals dog2 = new Animals() {
            @Override
            public void showSound() {
                System.out.println("Gau Gau Gau");
                test();
            }
            void test(){
                System.out.println("OKOKKOKKOKOK");
            }
        };
        dog2.showSound();
        IRuning r = () -> System.out.println("Test onRunning: ");

        IRuning r1 = () -> {
            System.out.println("JAJAJAAAa");
            System.out.println("JJJJJJ");
        };

        Action action1 = new Action() {
            @Override
            public void Isruning() {

            }

            @Override
            public void isSleeping() {

            }
        };
        IMessage m = s -> System.out.println("Show massage >>>"+s);
        m.Irunning("1223");

        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(123);
        list.add(456);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Show list data: "+list.get(i));
        }
        for (Integer t:list ) {
            System.out.println(t);
        }

        Stream t = list.stream();
        t.forEach(System.out:: println);
    }
}
