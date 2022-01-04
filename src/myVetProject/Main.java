package myVetProject;

import animals.*;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Cat> myCatList = new ArrayList<>();

    private static ArrayList<Fish> myFishList = new ArrayList<>();

    public static void main(String[] args) {

        //String petID, String name, int age, String breed, double weight, char sex
        Cat myNewCat = new Cat("15699231", "Aslan", 17, "Birman", 6.0, 'M');

        Cat myOtherNewCat = new Cat("482387234", "Maggy", 0, "mixed", 2.0, 'f');

        myCatList.add(myNewCat);
        myCatList.add(myOtherNewCat);

        System.out.println(myNewCat.getName());
        System.out.println(myOtherNewCat.getName());

        Fish myNewFish = new Fish("123456789", "Nemo", 4, "Clownfish", 0.1, 'M');

        Fish myOtherNewFish = new Fish("24563737", "Bob", 2, "Goldfish", 0.2, 'M');

        myFishList.add(myNewFish);
        myFishList.add(myOtherNewFish);

        System.out.println(myNewFish.getName());
        System.out.println(myOtherNewFish.getName());
    }
}
