/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_7_online_amusement_park_reservation_system;

/**
 *
 * @author dell
 */
public class SearchByID implements SearchLocation {
    @Override
    public void search(int id) {
        System.out.println("Searching location using Child ID: " + id);
        // Simulated result
        System.out.println("Child is currently at 'Art Workshop'.");
    }
}
