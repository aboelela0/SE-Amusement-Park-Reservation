/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_7_online_amusement_park_reservation_system;

/**
 *
 * @author dell
 */
public class ScheduleContext {
    private State currentState;

    public void setState(State state) {
        this.currentState = state;
    }

    public void request() {
        if (currentState != null) {
            currentState.handleRequest(this);
        } else {
            System.out.println("No state has been set.");
        }
    }
}

