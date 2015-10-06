package com.hohans.nsome.domain.trip.id;

import java.io.Serializable;

public class TripId implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;

    public TripId() {
    }

    public TripId(String id) {
        this.id = id;
    }

    public String getIdString() {
        return id;
    }

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TripId other = (TripId) o;

        return sameValueAs(other);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    boolean sameValueAs(TripId other) {
        return other != null && this.id.equals(other.id);
    }

    @Override
    public String toString() {
        return id;
    }
}
