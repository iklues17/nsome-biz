package com.hohans.nsome.domain.trip;

import com.hohans.nsome.domain.crew.id.CrewId;
import com.hohans.nsome.domain.trip.id.TripId;

public class TirpCreated {

	private TripId tripId;
	
	private CrewId crewId;

	public TirpCreated() {
	}

	public TirpCreated(TripId tripId, CrewId crewId) {
		super();
		this.tripId = tripId;
		this.crewId = crewId;
	}

	public TripId getTripId() {
		return tripId;
	}

	public void setTripId(TripId tripId) {
		this.tripId = tripId;
	}

	public CrewId getCrewId() {
		return crewId;
	}

	public void setCrewId(CrewId crewId) {
		this.crewId = crewId;
	}
	
}
