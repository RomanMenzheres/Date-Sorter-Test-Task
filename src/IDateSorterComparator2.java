import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.time.Month.*;
import static java.time.Month.DECEMBER;

public class IDateSorterComparator2 implements Comparator<LocalDate> {

    //All month without letter 'R' in name
    private final List<Month> monthWithoutR = Arrays.asList(MAY, JUNE, JULY, AUGUST);

    /*
        Same with IDateSorterComparator1
        But fewer elements in list so less contains compare executing so need less time
     */

    @Override
    public int compare(LocalDate date1, LocalDate date2) {

        boolean monthOfDate1 = monthWithoutR.contains(date1.getMonth());
        boolean monthOfDate2 = monthWithoutR.contains(date2.getMonth());

        if(monthOfDate1){
            return monthOfDate2 ? date2.compareTo(date1) : 1;
        } else {
            return monthOfDate2 ? -1 : date1.compareTo(date2);
        }

    }
}
