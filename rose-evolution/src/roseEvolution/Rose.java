package roseEvolution;

import java.util.*;

/*
The colour of a rose is defined by a pair of alleles.
Possible combinations are [Red, Red], [Red, White], [White, Red] and [White, White].
Rose class has allelePair method that refers to randomAllele method to pick two random allele values
from Allele enum type and add them to List<Allele> property of each instance of the class.
*/

public class Rose {

    public List<Allele> allelePair;

    public Rose(List<Allele> allelePair) {
        this.allelePair = allelePair;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "allelePair=" + allelePair +
                '}';
    }

    enum Allele {
        RED, WHITE;

        private static final List<Allele> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        public static Allele randomAllele()  {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
    }

    public static List<Allele> allelePair() {
        List<Allele> allelePair = new ArrayList<>();
        allelePair.add(0, Allele.randomAllele());
        allelePair.add(1, Allele.randomAllele());
        return allelePair;
    }

}
