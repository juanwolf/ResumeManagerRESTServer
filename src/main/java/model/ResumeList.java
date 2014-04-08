package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class ResumeList {
    private List<Resume> resumeList;

    public ResumeList(){
        resumeList = new ArrayList<Resume>();
    }

    public ResumeList(List<Resume> resumeList) {
        this.resumeList = resumeList;
    }

    public Resume getResumeByName(String Name) {
        for(Resume r : resumeList) {
            if (r.getName().equals(Name)) {
                return r;
            }
        }
        return null;
    }

    public List<Resume> getResumeList() {
        return resumeList;
    }

    @XmlElement
    public void addResume(Resume resume) {
        resumeList.add(resume);
    }

    @XmlElement
    public void setResumeList(List<Resume> resumeList) {
        this.resumeList = resumeList;
    }


}
