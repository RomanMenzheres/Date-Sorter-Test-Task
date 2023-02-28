import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class IDateSorterImpl2 implements IDateSorter{

    /*
        This implementation of IDateSorter sorting list according to month WITHOUT letter 'R' in name
     */

    //Custom Comparator which sorting as we need
    private final Comparator<LocalDate> IDateSorterComparator2 = new IDateSorterComparator2();

    @Override
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {

        unsortedDates.sort(IDateSorterComparator2); //Sorting list

        return unsortedDates; //Returning sorted list
    }

}
