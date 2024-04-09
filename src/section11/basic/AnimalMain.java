package section11.basic;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        Animal[] aniArr = {dog, cat, cow};

        for (Animal animal : aniArr){
            soundAnimal(animal);
        }

    }


    private static void soundAnimal(Animal animal){

        System.out.println("테스트 시작");
        animal.sound();
        System.out.println("테스트 종료");
    }
}
