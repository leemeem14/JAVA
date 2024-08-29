package cat;

public class Cat {
   private String name;
   private String breeds;
    private Double weight;

    void claw(){
        System.out.println("claw slash!");
    }
    void meow(){
        System.out.println("meow!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreeds() {
        return breeds;
    }

    public void setBreeds(String breeds) {
        this.breeds = breeds;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
