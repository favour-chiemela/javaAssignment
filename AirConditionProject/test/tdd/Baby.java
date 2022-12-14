package tdd;

public class Baby {
    private int age;
    private int weightInKilogram;
    private String name;

    public Baby(int babyWeightAtBirth){
        weightInKilogram = babyWeightAtBirth;
    }
    public Baby (String babyNameAtBirth){
        name=babyNameAtBirth;
    }

    public Baby(String babyNameAtBirth, int babyAtWeight){
        name = babyNameAtBirth;
       int  weightInKilogram = babyAtWeight;
    }


    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }

    public int getWeightInKilogram(){
        return weightInKilogram;
    }

}
