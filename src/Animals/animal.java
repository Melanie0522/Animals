package Animals;

public class animal {
    private int age;
    private int weight;//kg
    private String eating;
    private String running;
//constructor
    public animal(){
        this.age=1;
        this.weight=50;
        this.eating="herbivore";
        this.running="crawling";
    }
    public animal(int age,int weight,String eating,String running){
        this.age=age;
        this.weight=weight;
        this.eating=eating;
        this.running=running;
    }
//age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
//weight
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
//running
    public String getRunning() {
        return running;
    }
    public void setRunning(String running) {
        this.running = running;
    }
//running
    public String getEating() {
        return eating;
    }
    public void setEating(String eating) {
        this.eating = eating;
    }
}

