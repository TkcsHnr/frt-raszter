package org.frt.website.stuff;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class ProjectRegister {

    private static Map<String, Project> projectMap = new LinkedHashMap<>();

    public static void register(Project project) {
        projectMap.put(project.getName(), project);
    }

    public static Project getProjectByName(String name) {
        return projectMap.get(name);
    }

    public static ArrayList<Project> getProjects() {
        return new ArrayList<>(projectMap.values());
    }

}
