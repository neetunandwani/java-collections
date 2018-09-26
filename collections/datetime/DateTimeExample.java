package datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;


public class DateTimeExample {
    public static void main(String args[]) throws ParseException {
        DateTimeExample dateTimeExample = new DateTimeExample();
        dateTimeExample.oldDateAndTimeExample();
        dateTimeExample.testLocalDateTime();
        dateTimeExample.testZonedDateTime();
        dateTimeExample.testBackwardCompatability();
    }

    public void oldDateAndTimeExample() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/M/yyyy");
        String date = dateFormat.format(new Date());
        System.out.println(date);

        dateFormat = new SimpleDateFormat("dd-M-yyyy HH:mm:ss");
        String dateInString = "31-08-1982 18:20:56";
        Date theDate = dateFormat.parse(dateInString);
        System.out.println(theDate);

        dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        theDate = new Date();
        System.out.println(dateFormat.format(theDate));

        Calendar calendar = Calendar.getInstance();
        theDate = calendar.getTime();
        System.out.println(dateFormat.format(theDate));

        dateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        calendar = new GregorianCalendar(2013, 0, 31);
        System.out.println(dateFormat.format(calendar.getTime()));

        dateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        calendar = new GregorianCalendar(2013, 1, 28, 13, 24, 56);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

        int hour = calendar.get(Calendar.HOUR); // 12 hour clock
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int millisecond = calendar.get(Calendar.MILLISECOND);

        System.out.println(dateFormat.format(calendar.getTime()));

        System.out.println("year \t\t: " + year);
        System.out.println("month \t\t: " + month);
        System.out.println("dayOfMonth \t: " + dayOfMonth);
        System.out.println("dayOfWeek \t: " + dayOfWeek);
        System.out.println("weekOfYear \t: " + weekOfYear);
        System.out.println("weekOfMonth \t: " + weekOfMonth);

        System.out.println("hour \t\t: " + hour);
        System.out.println("hourOfDay \t: " + hourOfDay);
        System.out.println("minute \t\t: " + minute);
        System.out.println("second \t\t: " + second);
        System.out.println("millisecond \t: " + millisecond);


        calendar = new GregorianCalendar(2010, 9, 26, 15, 20, 10);
        System.out.println("Date using GregorianCalendar: " + calendar.getTime());

        System.out.println(System.currentTimeMillis() + " " + new Date().getTime());
    }

    public void testLocalDateTime() {

        // Get the current date and time
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1: " + date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        System.out.println("Month: " + month + "day: " + day + "seconds: " + seconds);

        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        System.out.println("date2: " + date2);

        // 12 december 2014
        LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
        System.out.println("date3: " + date3);

        // 22 hour 15 minutes
        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("date4: " + date4);

        // parse a string
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5: " + date5);

        LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Date in IST=" + todayKolkata);
    }

    public void testZonedDateTime() {

        // Get the current date and time
        ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
        System.out.println("date1: " + date1);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);

        ZonedDateTime date2 = ZonedDateTime.now(id);
        System.out.println("Europe/Paris time: " + date2);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("CurrentZone: " + currentZone);

        // TimeZone to ZoneId
        ZoneId defaultZone = TimeZone.getDefault().toZoneId();
        System.out.println("default zone: " + defaultZone);

        ZonedDateTime gregorianCalendarDateTime = new GregorianCalendar().toZonedDateTime();
        System.out.println("GregorianCalenda timer: " + gregorianCalendarDateTime);
    }

    public void testBackwardCompatability() {

        // Get the current date
        Date currentDate = new Date();
        System.out.println("Current date: " + currentDate);

        // Get the instant of current date in terms of milliseconds
        Instant now = currentDate.toInstant();
        ZoneId currentZone = ZoneId.systemDefault();

        LocalDateTime localDateTime = LocalDateTime.ofInstant(now, currentZone);
        System.out.println("Local date: " + localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, currentZone);
        System.out.println("Zoned date: " + zonedDateTime);
    }
}
