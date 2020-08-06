import java.util.Scanner;
import java.text.ParseException; 
import java.text.SimpleDateFormat;


public class dashboard
{
	public static void main(String args[]) throws ParseException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the task name");
		String task_name=sc.nextLine();
		System.out.println(task_name);
		
		System.out.println("Enter the task details:");
//		String task_details=sc.nextLine();
		
		System.out.println("select the department to assign task"
				+ "\n"
				+ "1.IT"+ "\n"
				+ "2.Marketing"+ "\n"
				+ "3.HR"+ "\n"
				+ "4.Research and development");
		String department=sc.nextLine();
		switch(department)
		{
		case "1":
			System.out.println("IT");
			break;
		case "2":
			System.out.println("Marketing");
			break;
		case "3":
			System.out.println("HR");
			break;
		case "4":
			System.out.println("Research and development");
			break;
			
		}
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		
		System.out.println("Enter the task Start date: dd-MM-yyyy");
		String start_date=sc.nextLine();
		System.out.println(start_date);
	
		
		System.out.println("Enter the Task end date: dd-MM-yyyy");
		String End_date=sc.nextLine();
		System.out.println(End_date);
		
		java.util.Date sd=format.parse(start_date);
		java.util.Date Ed=format.parse(End_date);
		
		
		System.out.println("Enter the task status"
				+ "\n"+"1.Pending"+"\n"+"2.Complete");
		String task_status=sc.nextLine();
		switch(task_status)
		{
		case "1":
			System.out.println("Task is Pending");
			do
			{
				double task_duration_in_time=Ed.getTime()- sd.getTime();
				
				double task_duration_in_second=(task_duration_in_time/1000)%60;
				
				double task_duration_in_Minutes=(task_duration_in_time/(1000*60))%60;
				
				double task_duration_in_Hours=(task_duration_in_time/(1000*60*60))%24;
				
				double task_duration_in_Years=(task_duration_in_time/(10001*60*60*24*365));
				
				double task_duration_in_Days=(task_duration_in_time/(1000*60*60*24))%365;
				
				System.out.println("Task duration in time:"+task_duration_in_time
						+ "\n"+"task duration in seconds:"+task_duration_in_second
					+"\n"+"task duration in minutes:"+task_duration_in_Minutes
					+"\n"+"task duration in hours:"+task_duration_in_Hours
					+"\n"+"task duration in years:"+task_duration_in_Years
					+ "\n"+"task duration in days:"+task_duration_in_Days);
				
			}while(task_name=="1");
			break;
		case "2":
			System.out.println("Task is Completed");
			break;
		}
		
		sc.close();
	}
}