import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Day2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date date = new Date();
		Scanner scan = new Scanner(System.in);
		try{
		System.out.println("Enter Day: ");
		date.setDate(scan.nextInt());
		System.out.println("Enter Month: ");
		date.setMonth(scan.nextInt()-1);
		System.out.println("Enter Year: ");
		date.setYear(scan.nextInt()-1900);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sdf.format(date));
		System.out.println("Enter n of day:");
		int n = scan.nextInt();
		scan.close();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_YEAR, n);
			
			Calendar cal1 = Calendar.getInstance();
			cal1.setTime(date);
			cal1.add(Calendar.DAY_OF_YEAR, n-14);
			
			Calendar cal2 = Calendar.getInstance();
			cal2.setTime(date);
			cal2.add(Calendar.DAY_OF_YEAR, n+14);
		
		System.out.println(sdf.format(calendar.getTime())+" ("+sdf.format(cal1.getTime())+" - "+sdf.format(cal2.getTime())+")"); 
		}
		catch (Exception eRR){
			System.out.println("Enter a day and month in format '00' and year '0000'!");
		}
		}
		
}
