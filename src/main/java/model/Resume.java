package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by juanwolf on 01/04/14.
 * <em>Object representation of a resume</em>
 */
@XmlRootElement(name="resume")
public class Resume {

    private String name;
    private String surname;
    private String goal;
    private List<String> cursus;
    private List<String> languages;
    private List<String> skills;
    private List<String> itSkills;


    public Resume() {

    }

    public Resume(String goal, List<String> cursus, List<String> languages,
                  List<String> skills, List<String> itSkills) {
        this.goal = goal;
        this.cursus = cursus;
        this.languages = languages;
        this.skills = skills;
        this.itSkills = itSkills;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    @XmlElement
    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getGoal() {
        return goal;
    }
    @XmlElement
    public void setGoal(String goal) {
        this.goal = goal;
    }

    public List<String> getCursus() {
        return cursus;
    }
    @XmlElement
    public void setCursus(List<String> cursus) {
        this.cursus = cursus;
    }

    public List<String> getLanguages() {
        return languages;
    }

    @XmlElement
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<String> getSkills() {
        return skills;
    }

    @XmlElement
    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<String> getItSkills() {
        return itSkills;
    }

    @XmlElement
    public void setItSkills(List<String> itSkills) {
        this.itSkills = itSkills;
    }
}
