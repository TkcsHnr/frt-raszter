package org.frt.website.controller;

import org.frt.website.stuff.Project;
import org.frt.website.stuff.ProjectRegister;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        return "index.html";
    }

    @GetMapping("/szolgaltatasok")
    public String services(Model model) {

        return "szolgaltatasok.html";
    }

    @GetMapping("/referenciak")
    public String portfolio(Model model) {
        for (int i = 0; i < 60; i++) {
            Project project = new Project(i, "Demo Épület az oldalra " + (i+1),"Horváth Mihály","HM Architect", new String[]{"Takács Balázs","Reisch Richárd"},2006,4000);
            ProjectRegister.register(project);
        }

        model.addAttribute("projects", ProjectRegister.getProjects());
        return "referenciak.html";
    }

    @GetMapping("/referencia/{name}")
    public String project(@PathVariable String name, Model model) {

        model.addAttribute("project", ProjectRegister.getProjectByName(name));
        return "referencia.html";
    }

    @GetMapping("/rolunk")
    public String aboutUs(Model model) {

        return "rolunk.html";
    }

    @GetMapping("/kapcsolat")
    public String contact(Model model) {

        return "kapcsolat.html";
    }

    @GetMapping("/footer")
    public String demo() {
        return "footer.html";
    }
}
