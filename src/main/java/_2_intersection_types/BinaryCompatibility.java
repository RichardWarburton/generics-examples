package _2_intersection_types;

import java.util.Collection;

public class BinaryCompatibility {


    <T extends Comparable<? super T>> T maxNotGood(Collection<? extends T> coll) {
        return null;
    }

    <T extends Object & Comparable<? super T>> T maxGood(Collection<? extends T> coll) {
        return null;
    }


}
