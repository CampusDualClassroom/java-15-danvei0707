package com.campusdual.classroom;

import java.util.Calendar;

public class Exercise15 {

	public static void main(String[] args) {
		FreshMerchandise fm = new FreshMerchandise("Manzanas", "001-9", "Frutería de ayer S.L.", 8, "C", "114D", 53,
				Calendar.getInstance().getTime());
		fm.printSpecificData();
	}

}
