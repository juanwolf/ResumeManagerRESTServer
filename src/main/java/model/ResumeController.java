package model;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;


@Controller
@RequestMapping("/*")
public class ResumeController {

    private static ResumeList resumeList;
    static {
        resumeList = new ResumeList();
        resumeList.setResumeList(new ArrayList<Resume>());
        Resume resumeTest = new Resume();
        resumeTest.setId(1);
        resumeTest.setName("Jeanne");
        resumeTest.setSurname("D arc");
        resumeTest.setSkills(new ArrayList<String>());
        resumeTest.setAttended(new ArrayList<String>());
        resumeTest.setItSkills(new ArrayList<String>());
        resumeTest.setLanguages(new ArrayList<String>());
        resumeTest.setGoal("Arriver jusqu'à Rouen");
        resumeList.addResume(resumeTest);
    }

    /**
     * Tools for build header.
     */
    private HttpHeaders addAccessControllAllowOrigin() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "*");
        return headers;
    }

    public ResumeController() {

    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<Resume> getResume(@PathVariable int id) {
        ResponseEntity<Resume> responseEntity =
                new ResponseEntity<Resume>(resumeList.getResumeById(id),
                        addAccessControllAllowOrigin(),
                        HttpStatus.OK);
        return responseEntity;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<ResumeList> getResumes() {
        ResponseEntity<ResumeList> responseEntity =
                new ResponseEntity<ResumeList>(resumeList, addAccessControllAllowOrigin(),
                        HttpStatus.OK);
        return responseEntity;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<ResumeList>
    putResume(@RequestBody Resume resume, HttpServletRequest request) {
        resumeList.addResume(resume);
        ResponseEntity<ResumeList> responseEntity =
                new ResponseEntity<ResumeList>(addAccessControllAllowOrigin(),
                                                HttpStatus.OK);
        return responseEntity;
    }

}
