package roseEvolution;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
AlleleListBuilder class has allelePicker and alleleListBuilder methods.
The allelePicker method selects one random allele from List<Allele> property of the Rose object provided as a parameter of the method.
The alleleListBuilder method calls allelePicker method to pick one random allele from each of the "parent" roses which are to be provided as its parameters.
In doing so, the method creates a new pair of alleles as a list.
The methods are used then by matingList method of MatingList class to create child objects of Rose class from parent roses.
 */

public class AlleleListBuilder {

    public static Rose.Allele allelePicker(Rose rose) {
        Random RANDOM = new Random();
        Rose.Allele allele = rose.allelePair.get(RANDOM.nextInt(rose.allelePair.size()));
        return allele;
    }

    public static List<Rose.Allele> alleleListBuilder(Rose rose1, Rose rose2) {
        List<Rose.Allele> listAllele = new ArrayList<>();
        listAllele.add(allelePicker(rose1));
        listAllele.add(allelePicker(rose2));
        return listAllele;
    }

}
