package com.diego.agecon.util;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;


public class FormPosition {
    public void openForm(JInternalFrame window, JDesktopPane desktop) {
        int widthDesk = desktop.getWidth();
        int heightDesktop = desktop.getHeight();
        int widthFrame = window.getWidth();
        int heightFrame = window.getHeight();
        window.setLocation(widthDesk / 2 - widthFrame / 2, heightDesktop / 2 - heightFrame / 2);
        desktop.add(window);
        window.setVisible(true);
    }
}
