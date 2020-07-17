package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public static String languages()
    {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>My favorites languages</h2>" +
                "<ol>" +
                "<li>VB.Net</li>" +
                "<li>Java</li>" +
                "<li>C#</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("form")
    @ResponseBody
    public static String myLanguages(@RequestParam String name,
                                     @RequestParam String first,
                                     @RequestParam String second,
                                     @RequestParam String third)
    {
        return "<html>" +
                "<body>" +
                "<h1>"+name+"</h1>" +
                "<br>" +
                "<ol>" +
                "<li>"+ first +"</li>" +
                "<li>"+second+"</li>" +
                "<li>"+third+"</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }


    @GetMapping("form")
    @ResponseBody
    public static String languagesForm()
    {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>My favorites languages</h2>" +
                "<br>"+
                "<form action='form' method='post'>" +
                "<label>Name: <input type='text' name='name' id='first'></label>" +
                "<br>"+
                "<br>"+
                "<label for='first'>My favorite language:</label> " +
                "<br>"+
                "<select name='first'>" +
                "<option value='VB.Net'>VB.Net</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='C#'>C#</option>" +
                "</select>" +

                "<br>"+
                "<label for='second'>My second favorite language:</label> " +
                "<br>"+
                "<select name='second' id='second'>" +
                "<option value='VB.Net'>VB.Net</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='C#'>C#</option>" +
                "</select>" +

                "<br>"+
                "<label for='third'>My third favorite language:</label> " +
                "<br>"+
                "<select name='third' id='third'>" +
                "<option value='VB.Net'>VB.Net</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='C#'>C#</option>" +
                "</select>" +

                "<br>"+
                "<br>"+

                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
