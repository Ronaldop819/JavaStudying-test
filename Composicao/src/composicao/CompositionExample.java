package composicao;

import java.util.ArrayList;
import java.util.List;

public class CompositionExample {

	public static void main(String[] args) {
		
//		Creating the objects of college class.
		College c1 = new College("ABES Enginnering College", "Guaziabad");
		College c2 = new College("AKG Enginnering College", "Guaziabad");
		College c3 = new College("ACN College of Engineering & Management Sudies", "Aligarh");
		
//		Creating list which contains the no. of colleges.
		List<College> college = new ArrayList<College>();
		college.add(c1);
		college.add(c2);
		college.add(c3);
		
		University university = new University(college);
		List<College> colleges = university.getTotalCollegesInUniversity();
		for (College cg : colleges) {
			System.out.println("Name: " + cg.name + " and " + "Address: " + cg.address);
		}

	}

}
