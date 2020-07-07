package roseEvolution;

import java.util.List;

/*
The Iterator class has iterator method. The method calls cleanedList and matingList methods repeatedly
until the per cent of white roses in the list satisfies the acceptance requirement which was provided by user
as an actual parameter of roseListBuilder method of RoseListBuilder class.
The iterator method also calls the methods of Stats class to count and print the generations of roses and
the number of non-white and white roses in each of them.
*/

public class Iterator {

    public static void iterator(List<Rose> rosesList, double acceptedPerCentOfWhiteRoses) {

        int generation = 2;

        while (Stats.whiteCount(rosesList) > rosesList.size() / (100 / acceptedPerCentOfWhiteRoses)) {

            List<Rose> iteratorListCleaned = ListCleaner.cleanedList(rosesList);

            List<Rose> iteratorMatingList = MatingList.matingList(iteratorListCleaned);
                System.out.println("Generation " + generation + ": " + iteratorMatingList);
                System.out.println("Red and pink roses: " + (Stats.pinkCount(iteratorMatingList) + Stats.redCount(iteratorMatingList)));
                System.out.println("White roses: " + Stats.whiteCount(iteratorMatingList));

            rosesList = iteratorMatingList;

            ++generation;

        }

    }

}
