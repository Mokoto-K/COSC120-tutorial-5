public class DreamDog {

    private final String breed;
    private final Sex sex;
    private final DeSexed deSexed;
    private int minAge;
    private int maxAge;

    public DreamDog(String breed, Sex sex, DeSexed deSexed, int minAge, int maxAge) {

        this.breed = breed;
        this.sex = sex;
        this.deSexed = deSexed;
        this.minAge = minAge;
        this.maxAge = maxAge;

    }

    public String getBreed() {
        return breed;
    }

    public Sex getSex() {
        return sex;
    }

    public DeSexed getDeSexed() {
        return deSexed;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }
}
