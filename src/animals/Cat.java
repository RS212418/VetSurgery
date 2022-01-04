package animals;

public class Cat {

    private String petID;
    private String name;
    private int age;
    private String breed;
    private double weight;
    private char sex;

    public Cat(String petID, String name, int age, String breed, double weight, char sex) {
        this.petID = petID;
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        this.sex = sex;
    }

    @Override
    public String toString(){
        return petID + ", " + name + ", " + age + ", " + breed + ", " + weight + ", " + sex;
    }


    public String getPetID() {
        return petID;
    }

    public void setPetID(String petID) {
        this.petID = petID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
