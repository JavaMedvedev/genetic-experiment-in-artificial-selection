package roseEvolution;

import java.util.ArrayList;
import java.util.List;
/*
RoseListBuilder class has roseListBuilder method. The method creates Rose objects of the number
specified by user as its actual parameter.
The created Rose objects get added to a list of Rose objects.
To instantiate a Rose object, the method calls allelePair method of Rose class which randomly picks two values
of Allele enum type and adds them to List<Allele> property of the Rose object being instantiated.
 */

public class RoseListBuilder {

    private static List<Rose> list = new ArrayList<>();

    public static List roseListBuilder(int numberOfRoses) {

        while (list.size() < numberOfRoses) {
            list.add(new Rose(Rose.allelePair()));
        }

        return list;
    }

}
