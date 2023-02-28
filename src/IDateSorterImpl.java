import java.time.LocalDate;
import java.time.Month;
import java.util.*;

import static java.time.Month.*;
import static java.time.Month.DECEMBER;

public class IDateSorterImpl implements IDateSorter{

    //All month with letter 'R' in name
    private final List<Month> monthWithR = Arrays.asList(JANUARY, FEBRUARY, MARCH, APRIL,
                                                            SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER);

    /*
        1. Checking if dates have month with letter 'R'
        2. According to month of date1 (month1) and month of date2 (month2)
           we are sorting in order which we need

        For example:
            If both months have 'R' they would sort in ascending order - date1.compareTo(date2)

            If both months don't have 'R' they would sort in descending order - date2.compareTo(date1)

            If  monthOfDate1 has 'R' but monthOfDate2 doesn't, it would think monthOfDate1 lower,
            and it would be higher on the list than monthOfDate2

            If monthOfDate2 has 'R' but monthOfDate1 doesn't, it would think monthOfDate2 lower,
            and it would be higher on the list than monthOfDate1

            PS: Better to use list with months WITHOUT letter 'R' (MAY, JUNE, JULY, AUGUST)
            because them less, so less executes compare, so need less time and resources
            but this version is more readable for me
     */

    @Override
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {

        unsortedDates.sort((date1, date2) -> {
            boolean monthOfDate1 = monthWithR.contains(date1.getMonth());
            boolean monthOfDate2 = monthWithR.contains(date2.getMonth());

            if(monthOfDate1){
                return monthOfDate2 ? date1.compareTo(date2) : -1;
            } else {
                return monthOfDate2 ? 1 : date2.compareTo(date1);
            }
        });

        return unsortedDates; //Returning sorted list
    }

}
