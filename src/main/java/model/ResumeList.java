package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by juanwolf on 01/04/14.
 */
@XmlRootElement(name="resumeList")
public class ResumeList {
    private List<Resume> resumeList;

    public ResumeList(){}

    public ResumeList(List<Resume> resumeList) {
        this.resumeList = resumeList;
    }

    public List<Resume> getResumeList() {
        return resumeList;
    }
    @XmlElement
    public void setResumeList(List<Resume> resumeList) {
        this.resumeList = resumeList;
    }


}
