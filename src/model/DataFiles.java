package model;

import enums.EnumZona;

public class DataFiles {

	public static String getDataFile(EnumZona zona) {

		switch (zona) {
		case ZONA_A:
			return "resources/BUC_Zona_A.xml";
		case ZONA_B1:
			return "resources/BUC_Zona_B1.xml";
		case ZONA_B2:
			return "resources/BUC_Zona_B2.xml";
		default:
			return null;

		}

	}

}
