public class Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.setName("Какаду");
        parrot.setBreed("Аратинги");
        parrot.setAge(1);
        parrot.setPrice(10_000);
        System.out.println("аты -" + parrot.getName());
        System.out.println("пародасы- " + parrot.getBreed());
        System.out.println("жашы- " + parrot.getAge());
        System.out.println("баасы -" + parrot.getPrice());
        System.out.println("___________________________________");

        Cat cat = new Cat();
        cat.setName("Мурка");
        cat.setBreed("Сиамская");
        cat.setAge(2);
        System.out.println("аты:" + cat.getName());
        System.out.println("пародасы:" + cat.getBreed());
        System.out.println("жашы:" + cat.getAge());
        System.out.println("_____________________________");

        Fish fish = new Fish();
        fish.setWeight(100_000);
        fish.setPrise(500);
        System.out.println("Веси:" + fish.getWeight());
        System.out.println("Баасы:" + fish.getPrise());
        System.out.println("______________________________");

        Dog dog = new Dog();
        dog.setName("Амиго");
        dog.setBreed("Питбуль");
        dog.setAge(3);
        dog.setPrise(50_000);
        System.out.println("имя:" + dog.getName());
        System.out.println("парода: " + dog.getBreed());
        System.out.println("возраст собаки: " + dog.getAge());
        System.out.println("цена собаки: " + dog.getPrise());


    }
}