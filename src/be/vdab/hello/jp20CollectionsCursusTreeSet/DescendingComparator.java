package be.vdab.hello.jp20CollectionsCursusTreeSet;

import java.util.Comparator;

public class DescendingComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
