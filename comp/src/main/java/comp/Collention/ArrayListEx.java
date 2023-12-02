package comp.Collention;

import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) {
		// Java code to illustrate initialization
		// of ArrayList using add() method


			// create a ArrayList String type
				ArrayList<String> prs = new ArrayList<String>();

				// Initialize an ArrayList with add() fun
				prs.add("hema");
				prs.add("Ravi");
				prs.add("Sai");
				System.out.println(prs.get(2));
				prs.add(1,"nemo");
				prs.remove(2);
				prs.set(2, "goat");
				// print ArrayList
				System.out.println("ArrayList : " + prs);
				int i;
				for(i=0;i<prs.size();i++) {
					System.out.println(prs.get(i));
				}
			}
		}
