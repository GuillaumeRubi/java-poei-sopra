package org.eclipse.model;

public class TroisPoint {
	private Point premier;
	private Point deuxieme;
	private Point troisieme;

	public TroisPoint(Point premier, Point deuxieme, Point troisieme) {
		super();
		this.premier = premier;
		this.deuxieme = deuxieme;
		this.troisieme = troisieme;
	}

	public Point getPremier() {
		return premier;
	}

	public void setPremier(Point premier) {
		this.premier = premier;
	}

	public Point getDeuxieme() {
		return deuxieme;
	}

	public void setDeuxieme(Point deuxieme) {
		this.deuxieme = deuxieme;
	}

	public Point getTroisieme() {
		return troisieme;
	}

	public void setTroisieme(Point troisieme) {
		this.troisieme = troisieme;
	}

	public boolean testerAlignement() {
		var AB = this.premier.calculerDistance(this.deuxieme);
		var BC = this.deuxieme.calculerDistance(this.troisieme);
		var AC = this.premier.calculerDistance(this.troisieme);
		return (AB == BC + AC) || (AC == AB + BC) || (BC == AC + AB);
	}
	  public boolean triangleEquilateral() {
	        var AB = this.premier.calculerDistance(this.deuxieme);
	        var BC = this.deuxieme.calculerDistance(this.troisieme);
	        var AC = this.premier.calculerDistance(this.troisieme);
	        return AB == AC  && AC == BC ;
	    }

	@Override
	public String toString() {
		return "TroisPoint [premier=" + premier + ", deuxieme=" + deuxieme + ", troisieme=" + troisieme + "]";
	}

}
