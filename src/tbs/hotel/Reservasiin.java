/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbs.hotel;

import java.sql.SQLException;

public interface Reservasiin {
    String getReservationType();
    double calculatePrice(int duration);
}
