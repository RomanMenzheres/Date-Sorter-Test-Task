import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<LocalDate> unsortedList = new ArrayList<>(); //List with dates

        unsortedList.add(LocalDate.of(2002, Month.JUNE, 28));  //Filling in the list with dates
        unsortedList.add(LocalDate.of(2002, Month.OCTOBER, 16));
        unsortedList.add(LocalDate.of(2002, Month.FEBRUARY, 12));
        unsortedList.add(LocalDate.of(2002, Month.AUGUST, 20));
        unsortedList.add(LocalDate.of(2002, Month.SEPTEMBER, 24));
        unsortedList.add(LocalDate.of(2002, Month.JULY, 1));
        unsortedList.add(LocalDate.of(2002, Month.OCTOBER, 5));
        unsortedList.add(LocalDate.of(2002, Month.MAY, 9));
        unsortedList.add(LocalDate.of(2002, Month.JANUARY, 8));

        //Printing lists
        System.out.println("Unsorted list: " + unsortedList);
        System.out.println("--------------------------------------");
        System.out.println("Sorted list: " + new IDateSorterImpl().sortDates(unsortedList));

        /*
            Result:
                Unsorted list: [2002-06-28, 2002-10-16, 2002-02-12, 2002-08-20, 2002-09-24, 2002-07-01, 2002-10-05, 2002-05-09, 2002-01-08]
                --------------------------------------
                Sorted list: [2002-01-08, 2002-02-12, 2002-09-24, 2002-10-05, 2002-10-16, 2002-08-20, 2002-07-01, 2002-06-28, 2002-05-09]
         */
    }
}

