package PracticTask;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public interface DateTime {
    default String showTime(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(" dd MMM HH:mm:ss");
        String format = simpleDateFormat.format(calendar.getTime());
        return format;
    }
}
