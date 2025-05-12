/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_7_online_amusement_park_reservation_system;

/**
 *
 * @author dell
 */
public class FullState implements State {
    @Override
    public void handleRequest(ScheduleContext scheduleContext) {
        System.out.println("Schedule is full. Transitioning to Switched state.");
        scheduleContext.setState(new SwitchedState());
    }
}


