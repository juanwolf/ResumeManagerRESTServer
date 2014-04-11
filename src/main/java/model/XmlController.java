package model;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.UnmarshallerHandler;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;


@Controller
@RequestMapping("/*")
public class XmlController {

    private static ResumeList resumeList;
    static {
        resumeList = new ResumeList();
        resumeList.setResumeList(new ArrayList<Resume>());
        Resume resumeTest = new Resume();
        resumeTest.setId(1);
        resumeTest.setName("Jeanne");
        resumeTest.setSurname("D arc");
        resumeTest.setSkills(new ArrayList<String>());
        resumeTest.setCursus(new ArrayList<String>());
        resumeTest.setItSkills(new ArrayList<String>());
        resumeTest.setLanguages(new ArrayList<String>());
        resumeTest.setGoal("Arriver jusqu'à Rouen");
        resumeList.addResume(resumeTest);
    }


    public XmlController() {

    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Resume getResumeInXML(@PathVariable int id) {
        return resumeList.getResumeById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    ResumeList getResumeInXML() {
        return resumeList;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody ResumeList
    putResume(@RequestBody Resume resume, HttpServletRequest request) {
        resumeList.addResume(resume);
        return resumeList;
    }

}
