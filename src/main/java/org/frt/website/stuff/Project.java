package org.frt.website.stuff;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private String displayName;
    private String name;
    private String generalDesigner;
    private String office;
    private String[] colleagues;
    private int year;
    private int floorSpace;
    private int id;

    public Project(int id, String displayName, String generalDesigner, String office, String[] colleagues, int year, int floorSpace) {
        this.id = id;
        this.displayName = displayName;
        this.name = NameFormatter.format(displayName);
        this.generalDesigner = generalDesigner;
        this.office = office;
        this.colleagues = colleagues;
        this.year = year;
        this.floorSpace = floorSpace;
    }

    public int getId() {
        return id;
    }
    public String getDisplayName() {
        return displayName;
    }

    public String getName() {
        return name;
    }

    public String getGeneralDesigner() {
        return generalDesigner;
    }

    public String getOffice() {
        return office;
    }

    public String[] getColleagues() {
        return colleagues;
    }

    public int getYear() {
        return year;
    }

    public int getFloorSpace() {
        return floorSpace;
    }
}
