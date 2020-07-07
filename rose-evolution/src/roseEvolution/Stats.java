package roseEvolution;

import java.util.List;

//The Stats class contains methods to count and return the number of red, pink and white roses in a given generation.

public class Stats {

    private static int redNum;
    private static int pinkNum;
    private static int whiteNum;

    public static int redCount(List<Rose> roseList) {
        redNum = 0;
        for (int i = 0; i < roseList.size(); i++) {
            if ((roseList.get(i).allelePair.contains(Rose.Allele.RED))
                    && ((roseList.get(i).allelePair.contains(Rose.Allele.WHITE)) == false)) {
                redNum++;
            }
        }

        return redNum;
    }

    public static int pinkCount(List<Rose> roseList) {
        pinkNum = 0;
        for (int i = 0; i < roseList.size(); i++) {
            if ((roseList.get(i).allelePair.contains(Rose.Allele.WHITE))
                    && (roseList.get(i).allelePair.contains(Rose.Allele.RED))) {
                pinkNum++;
            }
        }

        return pinkNum;
    }

    public static int whiteCount(List<Rose> roseList) {
        whiteNum = 0;
        for (int i = 0; i < roseList.size(); i++) {
            if ((roseList.get(i).allelePair.contains(Rose.Allele.WHITE))
                    && ((roseList.get(i).allelePair.contains(Rose.Allele.RED)) == false)) {
                whiteNum++;
            }
        }

        return whiteNum;
    }

}
