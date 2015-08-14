package com.smarcotte.ilab_step2;

import javax.swing.JOptionPane;

public class DateTest
{
	public static void main(String[] args)
	{
		// get input
		Date date1 = new Date();
		int month = Integer.parseInt(JOptionPane.showInputDialog("Enter month"));
		int day = Integer.parseInt(JOptionPane.showInputDialog("Enter day"));
		int year = Integer.parseInt(JOptionPane.showInputDialog("Enter year"));
		String message = date1.setDate(year,month,day);

		// show output
		System.out.println("checking increment...");
		System.out.println("Date object constructor for date " + date1.getDate() + "\n");

		// loop 40 times and increment date
		if(message == "")
		{
			for(int i = 0; i < 40; ++i)
			{
				date1.nextDay();
				System.out.println("Incremented Date:" + date1.getDate());
			}
		}
	}
}
