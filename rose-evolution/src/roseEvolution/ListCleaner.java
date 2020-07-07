package roseEvolution;

import java.util.ArrayList;
import java.util.List;

/*
The ListCleaner class has listCleaner method. Each time a new generation of roses is created,
the method checks the values of List<Allele> property of each of the Rose objects in the list.
If the value of at least one of the Allele object in the List<Allele> property is equal to RED, it gets added to cleanedList of roses.
If both of the alleles are white for a given Rose object in the list, the rose is considered to be white
and it doesn't make it to the new generation of roses.
To satisfy the requirements of matingList method of MatingList class, the cleanedList method also makes sure
there is an even number of objects in the cleanedList list of Rose objects it returns.
*/

public class ListCleaner {

    public static List<Rose> cleanedList(List<Rose> initialList) {

        List<Rose> cleanedList = new ArrayList<>();

        for (int i = 0; i < initialList.size(); i++) {
            if ((initialList.get(i).allelePair.contains(Rose.Allele.RED)) == true) {
                cleanedList.add(initialList.get(i));
            }
        }

        if (cleanedList.size() % 2 != 0) {
            cleanedList.remove(0);
        }

        return cleanedList;
    }

}

