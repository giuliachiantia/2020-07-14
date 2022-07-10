package it.polito.tdp.PremierLeague.model;

public class Adiacenza implements Comparable <Adiacenza> {
	private Team team;
	private int differenza;
	
	
	public Adiacenza(Team team, int differenza) {
		super();
		this.team = team;
		this.differenza = differenza;
	}
	
	
	public Team getTeam() {
		return team;
	}


	public void setTeam(Team team) {
		this.team = team;
	}


	public int getDifferenza() {
		return differenza;
	}
	public void setDifferenza(int differenza) {
		this.differenza = differenza;
	}


	@Override
	public int compareTo(Adiacenza o) {
		// TODO Auto-generated method stub
		return this.differenza - o.getDifferenza();
	}


	@Override
	public String toString() {
		return team.getName()+"("+differenza+")";
	}
}
