package it.polito.tdp.emergency;

import java.time.LocalTime;

public class Paziente {

	private int id;
	private StatoPaziente stato;
	private LocalTime oraArrivo;
	
	public Paziente(int id, StatoPaziente stato, LocalTime oraArrivo) {
		this.id = id;
		this.stato = stato;
		this.oraArrivo = oraArrivo;
	}

	public int getId() {
		return id;
	}

	public StatoPaziente getStato() {
		return stato;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setStato(StatoPaziente stato) {
		this.stato = stato;
	}

	public LocalTime getOraArrivo() {
		return oraArrivo;
	}

	public void setOraArrivo(LocalTime oraArrivo) {
		this.oraArrivo = oraArrivo;
	}
	
}
