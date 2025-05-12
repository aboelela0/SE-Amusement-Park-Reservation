package group_7_online_amusement_park_reservation_system;

public class MapController {
    private MapSystem mapSystem;

    public MapController(MapSystem mapSystem) {
        this.mapSystem = mapSystem;
    }

    public boolean verifyLogin(int customerID, String password) {
        return mapSystem.validateCredentials(customerID, password);
    }

}