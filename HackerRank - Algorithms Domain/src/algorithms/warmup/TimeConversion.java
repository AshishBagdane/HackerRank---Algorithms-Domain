package algorithms.warmup;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) throws ParseException {
		Scanner in = new Scanner(System.in);
        DateFormat inTime = new SimpleDateFormat("hh:mm:ssaa");
        Date time = inTime.parse(in.next());
        DateFormat outTime = new SimpleDateFormat("HH:mm:ss");
        System.out.println(outTime.format(time));
        in.close();
	}
}
