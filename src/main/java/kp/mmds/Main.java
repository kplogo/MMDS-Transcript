package kp.mmds;

import kp.mmds.importer.Importer;
import kp.mmds.importer.LogImport;
import kp.mmds.importer.TrackImport;

public class Main {

	public static void main(String[] arg) {
		System.out.println("Import piosenek");
		Importer.importFile("unique_tracks.txt", new TrackImport());
		System.out.println(" Zaimportowano piosenek: " + Beans.getSongService().getSize());
		System.out.println("Import Logow");
		Importer.importFile("triplets_sample_20p.txt", new LogImport());
		System.out.println("Zakoñczono import. ");
		System.out.println(" Zaimportowano logow: "+Beans.getLogService().getSize());

	}
}
