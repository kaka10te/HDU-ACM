import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String date = cin.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date startDate = null;
            startDate = sdf.parse(date);
//            try {
//                startDate = sdf.parse(date);
//            } catch (ParseException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
            Calendar startCalendar = Calendar.getInstance();
            startCalendar.setTime(startDate);
            int index = startCalendar.get(Calendar.DAY_OF_YEAR);
            System.out.println(index);
        }
        cin.close();
    }
}
