

package com.programacion2.cinejdk15;

import com.programacion2.cine.igu.MenuInicial;

/**
 *
 * @author DavidRoco
 */
public class CineJDK15 {

    public static void main(String[] args) {
        MenuInicial pantallaInicial = MenuInicial.getInstance();
        pantallaInicial.setVisible(true);
        pantallaInicial.setLocationRelativeTo(null);
    }
}
