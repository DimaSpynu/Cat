import java.lang.reflect.Parameter;

public class Loader {
    public static void main(String[] args) {




        Cat murka = new Cat();
        murka.setName("MURA");
        Cat pavel = murka;
        pavel.setName("VAAS");

        System.out.println(murka.getName());



        Cat cat = new Cat("Кэт");
        Cat vasya = new Cat("Вася");
        Cat olya = new Cat("Оля");
        Cat dima = new Cat("Дима");
        Cat sergey = new Cat("Сергей");


        System.out.println(cat.getWeight());
        System.out.println(vasya.getWeight());
        System.out.println(olya.getWeight());
        System.out.println(dima.getWeight());
        System.out.println("=========================================================");
        //кормим:
        vasya.feed(10.0 * Math.random());
        cat.feed(10.0 * Math.random());
        olya.feed(10.0 * Math.random());
        dima.feed(10.0 * Math.random());
        olya.feed(100 * Math.random());

        System.out.println(olya.getFoodEated());
        System.out.println("=========================================================");
        //мяукаем:
        for (int j = 0; j < 3; j++) {
            olya.meow();
        }
        System.out.println(olya.getStatus());
        System.out.println(olya.getWeight());
        //перекармливем:
        for (int j = 0; j < 1; j++) {
            olya.feed(150.0 * Math.random());
        }
        System.out.println(olya.getStatus());
        System.out.println(olya.getWeight());
        //идём в туалет:

        System.out.println(Cat.getCount());

        Cat kitten = getKitten();
        System.out.println(getKitten());
        System.out.println(kitten.getWeight());
    }
    private static Cat getKitten()
    {
        return new Cat(100 + 1000);

    }

}


