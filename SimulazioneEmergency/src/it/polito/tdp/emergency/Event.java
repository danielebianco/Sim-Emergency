package it.polito.tdp.emergency;

import java.time.LocalTime;

public class Event  implements Comparable<Event> {
	private LocalTime ora;
	private EventType tipo;
	
	Paziente paziente;

	public Event(LocalTime ora, EventType tipo, Paziente paziente) {
		super();
		this.ora = ora;
		this.tipo = tipo;
		this.paziente = paziente;
	}

	public LocalTime getOra() {
		return ora;
	}

	public EventType getTipo() {
		return tipo;
	}

	public Paziente getPaziente() {
		return paziente;
	}

	@Override
	public int compareTo(Event arg0) {
		return this.ora.compareTo(arg0.getOra());
	}
	
	
}
