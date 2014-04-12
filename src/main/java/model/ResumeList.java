package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class ResumeList {

    @XmlElement(name = "resume")
    protected List<Resume> resumeList;

    public ResumeList(){
        Resume.resumeIndexer = 0;
    }

    public ResumeList(List<Resume> resumeList) {
        this.resumeList = resumeList;
        Resume.resumeIndexer = resumeList.size();
    }

    public Resume getResumeById(int id) {
        for(Resume r : resumeList) {
            if (r.getId() == id) {
                return r;
            }
        }
        return null;
    }

    public void addResume(Resume resume) {
        if (resume.getId() < Resume.resumeIndexer) {
            resume.setId(Resume.resumeIndexer);
        }
        resumeList.add(resume);
        Resume.resumeIndexer++;
    }

}
