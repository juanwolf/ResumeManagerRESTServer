package model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by juanwolf on 01/04/14.
 */
@Controller
@RequestMapping("/resume")
public class XmlController {

    @RequestMapping(value="get/{name}", method = RequestMethod.GET)
    public @ResponseBody
    Resume getResumeInXML(@PathVariable String name) {
        Resume resume = new Resume();
        resume.setName(name);
        resume.setCursus(new ArrayList<String>());
        resume.setGoal("Apprendre à manger avec des baguettes chinoises.");
        resume.setItSkills(new ArrayList<String>());
        resume.setLanguages(new ArrayList<String>());
        resume.setSkills(new ArrayList<String>());
        resume.setSurname("Resume Surname Default");

        return resume;
    }

    @RequestMapping(value="all", method = RequestMethod.GET)
    public @ResponseBody
    ResumeList getResumeInXML() {
        List<Resume> result = new ArrayList<Resume>();
        Resume resume = new Resume();
        resume.setName("Jeanne");
        resume.setCursus(new ArrayList<String>());
        resume.setGoal("Apprendre à manger avec des baguettes chinoises.");
        resume.setItSkills(new ArrayList<String>());
        resume.setLanguages(new ArrayList<String>());
        resume.setSkills(new ArrayList<String>());
        resume.setSurname("Resume Surname Default");

        result.add(resume);
        result.add(resume);

        return new ResumeList(result);
    }
}
