import java.time.LocalDate;
import java.util.*;

public class IDateSorterImpl1 implements IDateSorter{

    /*
        This implementation of IDateSorter sorting list according to month WITH letter 'R' in name
     */

    //Custom Comparator which sorting as we need
    private final Comparator<LocalDate> IDateSorterComparator1 = new IDateSorterComparator1();

    @Override
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {

        unsortedDates.sort(IDateSorterComparator1); //Sorting list

        return unsortedDates; //Returning sorted list
    }

}
