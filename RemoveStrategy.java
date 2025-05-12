/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_7_online_amusement_park_reservation_system;

/**
 *
 * @author dell
 */
public class RemoveStrategy implements ManageActivityStrategy {
    private ActivityController controller;

    public RemoveStrategy(ActivityController controller) {
        this.controller = controller;
    }

    @Override
    public void execute(int activityID) {
        controller.removeActivity(activityID);
    }
}
