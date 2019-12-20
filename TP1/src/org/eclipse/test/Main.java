package org.eclipse.test;

import org.eclipse.model.Point;
import org.eclipse.model.TroisPoint;


public class Main {
	public static void main(String [] args) {
		Point p1 = new Point(0,0);
		Point p2 = new Point(0,0);
		Point p3 = new Point(0,0);
		TroisPoint triangle = new TroisPoint (p1,p2,p3);
		
		System.out.println(p1.calculerDistance(p2));
		System.out.println(p1.calculerMilieu(p2));
		System.out.println(triangle.testerAlignement());
		System.out.println(triangle.triangleEquilateral());
	}
}
