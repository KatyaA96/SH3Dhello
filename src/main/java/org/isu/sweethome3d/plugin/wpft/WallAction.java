package org.isu.sweethome3d.plugin.wpft;

import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.model.Selectable;
import com.eteks.sweethome3d.model.Wall;
import com.eteks.sweethome3d.plugin.PluginAction;

import javax.swing.*;

/* Внутренний класс WallPaperPlugin*/
/* Внутренний класс WallPaperPlugin*/
public class WallAction extends PluginAction {
    private Home home;
    public WallAction(Home home) {
        putPropertyValue(Property.NAME, "Set params of walls");
        putPropertyValue(Property.MENU, "Tools");
        // Enables the action by default
        setEnabled(true);
        this.home = home;
    }
/*
    public WallParamsDialog []{
            return textHeight
    }*/

    public WallParamsDialog dialog;
    public Float height;
    public Float thickness;
    public Float width;


    @Override
    public void execute() {
        dialog = WallParamsDialog.execute(this);
        java.util.Collection<Wall> walls = home.getWalls();
        java.util.List<Selectable> items = home.getSelectedItems();
        //java.util.List<Wall> w = null;
        //java.util.List<Wall> wS = home.getWallsSubList(java.util.List<items extends Selectable> wS);


        Wall wXS = null;

        If (){
            wXS.getXStart();
        }// Из-за этого не работает. Исправляй.

        //Wall wYS = null;
        //wYS.getYStart();

        Wall wXE = null;
        wXE.getXEnd();
        //Wall wYE = null;
        //wYE.getYEnd();

       /* Wall wAS = null;
        wAS.getWallAtStart();
        Wall wAE = null;
        wAE.getWallAtEnd();*/

        Float atEnd = null;
        if (width!=null) atEnd = new Float(Float.parseFloat(String.valueOf(wXS))) + width;

        for (Wall w : walls) {
            if (height != null) w.setHeight(height);
            if (thickness != null) w.setThickness(thickness);
            if (atEnd != null) ;
        }
    }
}