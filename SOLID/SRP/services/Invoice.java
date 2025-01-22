package SOLID.SRP.services;

import java.util.List;

import SOLID.SRP.models.Marker;

public class Invoice {
    private List<Marker> markers;

    public Invoice(List<Marker> markers) {
        this.markers = markers;
    }

    public int calculateTotal() {
        return markers.stream().mapToInt(Marker::getPrice).sum();
    }
}
