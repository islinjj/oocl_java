package team.ita.Inheritance;

public class Felidae extends Animal {

    private String sound;

    public Felidae(String name, int age, float weight) {
        super(name, age, weight);
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void shout(){
        System.out.println("发出声音"+sound);
    }
}
