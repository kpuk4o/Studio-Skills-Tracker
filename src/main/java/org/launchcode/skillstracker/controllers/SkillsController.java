package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    // You need to have an h1 with the title “Skills Tracker”, an h2, and an ol
    // containing three programming languages of your choosing.

    @GetMapping
    @ResponseBody
    public String createHomepage() {
        return "<html><body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Languages & skills that we'd like to learn:</h2>" +
                "<ol>" +
                "<li><h3>Java</h3></li>" +
                "<li><h3>JavaScript</h3></li>" +
                "<li><h3>Golang</h3></li>" +
                "</ol>" +
                "</body></html>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String createForm() {
        return "<html><body>" +
                "<form action = 'results' method = 'post'>" +
                "<label>Name<br /><input type:'text' name='name' </label><br />" +
                "<label>My first favorite language<br />" +
                "               <select name=\"firstlanguage\" id=\"firstlanguage\">" +
                "               <option value = 'empty'></option>" +
                "               <option value =\"Java\">Java</option>" +
                "               <option value =\"JavaScript\">JavaScript</option>" +
                "               <option value =\"Golang\">Golang</option>" +
                "               </select></label><br />" +

                "<label>My second favorite language<br />" +
                "                <select name=\"secondlanguage\" id=\"secondlanguage\">" +
                "                <option value = 'empty'></option>" +
                "                <option value =\"Java\">Java</option>" +
                "                <option value =\"JavaScript\">JavaScript</option>" +
                "                <option value =\"Golang\">Golang</option>" +
                "                </select></label><br />" +

                "<label>My third favorite language<br />" +
                "                <select name=\"thirdlanguage\" id=\"thirdlanguage\">" +
                "                <option value = 'empty'></option>" +
                "                <option value =\"Java\">Java</option>" +
                "                <option value =\"JavaScript\">JavaScript</option>" +
                "                <option value =\"Golang\">Golang</option>" +
                "                </select></label><br />" +
                "<input type = 'submit' value = 'Submit' />" +
                "</body></html>";

    }

    @PostMapping("/results")
    @ResponseBody
    public String formSubmission(@RequestParam String name, @RequestParam String firstlanguage, @RequestParam String secondlanguage, @RequestParam String thirdlanguage) {
        return "<html><body>" +
                "<h1>" + name + "</h1>" +
                "<table>" +
                "<tr><th>First Language</th><th>Second Language</th><th>Third Language</th></tr>" +
                "<tr><td>" +firstlanguage+ "</td><td>" + secondlanguage + "</td><td>" + thirdlanguage + "</td></tr>" +
                "<th" +
                "</table>" +
                "</body></html>";

    }


}
