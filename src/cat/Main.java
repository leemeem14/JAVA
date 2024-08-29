package cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("aicat");
        cat.setBreeds("Persian");
        cat.setWeight();


        System.out.printf("이고양이의 이름은 : %s\n",cat.getName());
        System.out.printf("이고양이의 무게는 : %.2f㎏\n",cat.getWeight());
        System.out.printf("이고양이의 종은 : %s\n",cat.getBreeds());

        System.out.print(cat.getName()+" 이 ");
        cat.claw();

        System.out.print(cat.getName()+" 이 ");
        cat.meow();
    }
}