package roseEvolution;

import java.util.ArrayList;
import java.util.List;

/*
Mating list class has matingList method. The method repeatedly picks a random couple of roses from the list of roses of a given generation.
Then the method calls alleleListBuilder method of AlleleListBuilder class to pick one random allele from each of those roses.
Then the method instantiates a new object of Rose class and adds the two picked alleles to the List<Allele> property of a newly created rose.
With every pair of the roses the method randomly picks, it instantiate two new roses picking random alleles from the "parent" roses
each time it creates a new "child" rose, so that the two child roses of the same parent roses can have different pairs of alleles.
As the two new objects of Rose class are instantiated, they get added to matingList list of roses and their parent roses get dropped from the previous list of roses.
The cycle repeats itself until there are no roses left in the initial list and a new generation of roses is fully established in the new list.
*/

public class MatingList {

    public static List<Rose> matingList(List<Rose> list) {

        List<Rose> matingList = new ArrayList<>();

        Rose parentOne;
        Rose parentTwo;

        while (list.size() > 0) {

            int num1 = (int) Math.random() * list.size();
            parentOne = list.get(num1);
            list.remove(num1);

            int num2 = (int) Math.random() * list.size();
            parentTwo = list.get(num2);
            list.remove(num2);

            Rose childOne;
            Rose childTwo;

            childOne = new Rose(AlleleListBuilder.alleleListBuilder(parentOne, parentTwo));
            childTwo = new Rose(AlleleListBuilder.alleleListBuilder(parentOne, parentTwo));

            matingList.add(childOne);
            matingList.add(childTwo);

        }

        return  matingList;
    }

}
