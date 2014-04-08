package model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/resume")
public class XmlController {

    public static ResumeList resumeList; {
        resumeList = new ResumeList();
        Resume resumeTest = new Resume();
        resumeTest.setName("Jeanne");
        resumeTest.setSurname("D arc");
        resumeTest.setCursus(new ArrayList<String>());
        resumeTest.setItSkills(new ArrayList<String>());
        resumeTest.setLanguages(new ArrayList<String>());
        resumeTest.setGoal("Arriver jusqu'à Rouen");
        resumeList.addResume(resumeTest);
    }


    public XmlController() {

    }
    /*@RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody Resume addResumeInXML(Resume resume) {
        resumeList.addResume(resume);
        return resume;
    }*/

    @RequestMapping(value="get/{name}", method = RequestMethod.GET)
    public @ResponseBody
    Resume getResumeInXML(@PathVariable String name) {
        return resumeList.getResumeByName(name);
    }

    @RequestMapping(value="all", method = RequestMethod.GET)
    public @ResponseBody
    ResumeList getResumeInXML() {
        return resumeList;
    }
}
