package Animals;

public class Felidae extends animal{
    private String sound;
//constructor
    public Felidae(){
        sound="meowing meowing";
    }
//sound
    public String getSound(){
        return sound;
    }
    public void setSound(String sound){
        this.sound=sound;
    }
}
