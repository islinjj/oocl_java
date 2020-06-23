package team.ita.Inheritance;

public class Animal {

    private String name;

    private int age;

    private float weight;

    public Animal(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
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

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void eat(){
        System.out.println(name+"is eating");
    }

    public void run(){
        System.out.println(name+"is running");
    }

    @Override
    public String toString() {
        return "Hello! I'm " + name +
                ", I'm " + age + " years old" +
                ", my weight are " + weight;
    }
}
