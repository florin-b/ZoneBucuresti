package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import beans.LatLng;
import enums.EnumZona;
import maps.MapsOperations;
import model.DataLoad;

public class ZoneBucuresti {

	public static List<LatLng> getZona(EnumZona zona) {

		List<LatLng> points = new ArrayList<LatLng>();

		try {
			points = DataLoad.getZona(zona);
		} catch (ParserConfigurationException e) {

			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return points;
	}

	public static EnumZona getZonaBucuresti(LatLng point) {

		EnumZona zonaBuc = EnumZona.NEDEFINIT;

		try {

			for (EnumZona zn : EnumZona.values()) {
				List<LatLng> pointsList = DataLoad.getZona(zn);

				boolean contains = MapsOperations.containsPoint(point, pointsList, true);

				if (contains)
					return zn;

			}
		} catch (Exception e) {

		}

		return zonaBuc;
	}

}
