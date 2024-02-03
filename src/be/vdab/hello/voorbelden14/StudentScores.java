package be.vdab.hello.voorbelden14;

public class StudentScores {
    public static void main(String[] args) {

        int score1 = 8;
        int score2 = 6;
        int score3 = 9;
        int score4 = 4;
        int maxScore = 10;

        int totaleScore = score1 + score2 + score3 + score4;
        double gemiddeldeScore = (double) totaleScore / 4;
        System.out.println("gemiddeldeScore = " + gemiddeldeScore);
        double percentage = (gemiddeldeScore / maxScore) * 100;
        System.out.println("percentageVanScores = " + percentage);

    }
}
