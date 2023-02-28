import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<LocalDate> unsortedList = new ArrayList<>(); //List with dates

        unsortedList.add(LocalDate.of(2002, Month.JUNE, 28));  //Filling dates in list
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
        System.out.println("Sorted list according to month with letter 'R': "
                + new IDateSorterImpl1().sortDates(unsortedList));
        System.out.println("--------------------------------------");
        System.out.println("Sorted list according to month without letter 'R': "
                + new IDateSorterImpl2().sortDates(unsortedList));
    }
}