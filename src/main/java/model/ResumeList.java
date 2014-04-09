package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "resumeList")
public class ResumeList {

    private List<Resume> resumeList;

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

    public List<Resume> getResumeList() {
        return resumeList;
    }


    public void addResume(Resume resume) {
        resumeList.add(resume);
    }


    public void setResumeList(List<Resume> resumeList) {
        this.resumeList = resumeList;
    }


}
