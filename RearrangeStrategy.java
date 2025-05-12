package group_7_online_amusement_park_reservation_system;

public class RearrangeStrategy implements ManageActivityStrategy {
    private ActivityController controller;
    private Schedule newSchedule;

    public RearrangeStrategy(ActivityController controller, Schedule newSchedule) {
        this.controller = controller;
        this.newSchedule = newSchedule;
    }

    @Override
    public void execute(int activityID) {
        controller.updateSchedule(activityID, newSchedule);
    }
}
