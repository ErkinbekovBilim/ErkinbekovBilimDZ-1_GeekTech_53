public class HighestRankSamurai{
    private int age;
    private int experience;
    private String name;
    private Rank rank;


    public HighestRankSamurai(int age, int experience, String name, Rank rank) {
        this.age = age;
        this.experience = experience;
        this.name = name;
        this.rank = rank;
    }

    public HighestRankSamurai() {
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }

    public Rank getRank() {
        return rank;
    }

}
