/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_7_online_amusement_park_reservation_system;

/**
 *
 * @author dell
 */
public class SwitchedState implements State {
    @Override
    public void handleRequest(ScheduleContext scheduleContext) {
        System.out.println("Schedule is currently switched. Transitioning to Available state.");
        scheduleContext.setState(new AvailableState());
    }
}
