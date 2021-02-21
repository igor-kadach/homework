package eu.senla.task3;

public class Main {
    public static void main(String[] args) {

        int countCat = 10;

        while (countCat > 0) {
            Cat cat = new Cat();
            System.out.println("Name of cat is: " + cat.getName() + " and his age is: " + cat.getAge());
            countCat--;
        }

        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
            cat.setName("Morda");
            cat.setAge(99);
            System.out.println("Name of cat is: " + cat.getName() + " and his age is: " + cat.getAge());
        }

        do {
            Cat cat = new Cat("Bars", 12);
            countCat++;
            System.out.println("Name of cat is: " + cat.getName() + " and his age is: " + cat.getAge());
        } while (countCat < 10);


        Cat cats[] = new Cat[5];
        cats[0] = new Cat("Kotik", 5);
        cats[1] = new Cat("Bars", 29);
        cats[2] = new Cat("Matroskin", 19);
        cats[3] = new Cat("KotVSapogah", 47);
        cats[4] = new Cat("Morda", 33);
        for (Cat i : cats) {
            System.out.println(i);
        }
        System.out.println((cats[2].equals(cats[3])));

    }
}











