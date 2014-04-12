package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * <em>Object representation of a resume</em>
 */
@XmlRootElement(name = "resume")
public class Resume {
    public static int resumeIndexer;
    private int ownId;
    private String name;
    private String surname;
    private String goal;

    @XmlElementWrapper(name = "attended")
    @XmlElement(name = "institution")
    protected List<String> attended;

    @XmlElementWrapper(name = "languages")
    @XmlElement(name = "language")
    protected List<String> languages;

    @XmlElementWrapper(name = "skills")
    @XmlElement(name = "skill")
    protected List<String> skills;

    @XmlElementWrapper(name = "ITSkills")
    @XmlElement(name = "ITSkill")
    protected List<String> itSkills;


    public Resume() {
        this.ownId = resumeIndexer;
        resumeIndexer++;
    }

    public Resume(String name, String surname, String goal, List<String> attended,
                  List<String> languages, List<String> skills,
                  List<String> itSkills) {
        this.ownId = resumeIndexer;
        this.name = name;
        this.surname = surname;
        this.goal = goal;
        this.attended = attended;
        this.languages = languages;
        this.skills = skills;
        this.itSkills = itSkills;
        resumeIndexer++;
    }

    public int getId() {
        return ownId;
    }

    public void setId(int newId) {
        this.ownId = newId;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getGoal() {
        return goal;
    }


    public void setGoal(String goal) {
        this.goal = goal;
    }

}

