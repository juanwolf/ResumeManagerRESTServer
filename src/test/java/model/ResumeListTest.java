package model;


import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ResumeListTest {

    @Test
    public void EmptyConstructorCreateAResumeListWithNoList() {
        // Given
        // When
        ResumeList resumeList = new ResumeList();
        // Then
        Assertions.assertThat(resumeList.resumeList)
                .isNull();

    }

    @Test
    public void SecondConstructorCreateAResumeListWithAnResumeListInitialized() {
        // Given
        List<Resume> resumes = new ArrayList<Resume>();
        resumes.add(new Resume());
        // When
        ResumeList resumeList = new ResumeList(resumes);
        // Then
        Assertions.assertThat(resumeList.resumeList).isEqualTo(resumes);
    }

    @Test
    public void getResumeByIdMustReturnTheCorrectResume() {
        // Given
        String resumeName = "Test";
        List<Resume> resumes = new ArrayList<Resume>();
        Resume resume = new Resume(resumeName, null, null, null, null, null, null);
        int id = resume.getId();
        resumes.add(resume);
        resumes.add(new Resume());
        ResumeList resumeList = new ResumeList(resumes);
        // When
        Resume testResume = resumeList.getResumeById(id);
        // Then
        Assertions.assertThat(testResume).isEqualTo(resume);
    }
}
