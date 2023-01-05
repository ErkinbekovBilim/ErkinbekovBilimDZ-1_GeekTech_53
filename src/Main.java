import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Mission mission = new Mission ("liberate the village" , 17);
        AssistantsOfTheHighestRank assistantsOfTheHighestRank = new AssistantsOfTheHighestRank(45, 25, "Kratos",
                Rank.SHUGO_DAIMYO, 4567, "Cat", mission);
        System.out.println(assistantsOfTheHighestRank.getInfo());
        assistantsOfTheHighestRank.MissionReport();
        System.out.printf("ObjectA");
        System.out.printf("--------------------------------------");
        Mission question = new Mission ("Rob an enemy kingdom" , 7);
        GuardsOfTheHighestRank guardsOfTheHighestRank = new GuardsOfTheHighestRank(51, 31, "Maigua",
                Rank.HATAMOTO, 3411, "Fox", question, 18990, 1.86);
        System.out.println(guardsOfTheHighestRank.getInfo());
        System.out.printf("ObjectB");
        System.out.printf("--------------------------------------");
        Mission quest = new Mission ("Rob an enemy kingdom" , 5);
        GuardsOfTheHighestRank guardsOfTheHighestRank1 = new GuardsOfTheHighestRank(48, 24, "Hanyu",
                Rank.HATAMOTO, 3000, "Snake", quest, 19990, 1.96);
        System.out.println(guardsOfTheHighestRank1.getInfo());
        System.out.printf("ObjectC");
        System.out.printf("--------------------------------------");


    }
}