package model;

import javax.xml.bind.annotation.XmlElement;
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
    private List<String> cursus;
    private List<String> languages;
    private List<String> skills;
    private List<String> itSkills;


    public Resume() {
        this.ownId = resumeIndexer;
        resumeIndexer++;
    }

    public Resume(String name, String surname, String goal, List<String> cursus,
                  List<String> languages, List<String> skills,
                  List<String> itSkills) {
        this.ownId = resumeIndexer;
        this.name = name;
        this.surname = surname;
        this.goal = goal;
        this.cursus = cursus;
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

    public List<String> getCursus() {
        return cursus;
    }


    public void setCursus(List<String> cursus) {
        this.cursus = cursus;
    }

    public List<String> getLanguages() {
        return languages;
    }


    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<String> getSkills() {
        return skills;
    }


    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<String> getItSkills() {
        return itSkills;
    }


    public void setItSkills(List<String> itSkills) {
        this.itSkills = itSkills;
    }
}

