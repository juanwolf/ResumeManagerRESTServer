package model;


import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ResumeTest {

    @Test
    public void EmptyConstructorCreateAResumeWithoutName() {
        // Given
        // When
        Resume resume = new Resume();
        // Then
        Assertions.assertThat(resume.getName()).isNull();
    }

    @Test
    public void EmptyConstructorCreateAResumeWithoutSurname() {
        // Given
        // When
        Resume resume = new Resume();
        // Then
        Assertions.assertThat(resume.getSurname()).isNull();
    }

    @Test
    public void EmptyConstructorCreateAResumeWithoutGoal() {
        // Given
        // When
        Resume resume = new Resume();
        // Then
        Assertions.assertThat(resume.getGoal()).isNull();
    }

    @Test
    public void EmptyConstructorCreateAResumeWithoutCursus() {
        // Given
        // When
        Resume resume = new Resume();
        // Then
        Assertions.assertThat(resume.getCursus()).isNull();
    }

    @Test
    public void EmptyConstructorCreateAResumeWithoutLanguages() {
        // Given
        // When
        Resume resume = new Resume();
        // Then
        Assertions.assertThat(resume.getLanguages()).isNull();
    }

    @Test
    public void EmptyConstructorCreateAResumeWithoutSkill() {
        // Given
        // When
        Resume resume = new Resume();
        // Then
        Assertions.assertThat(resume.getSkills()).isNull();
    }

    @Test
    public void EmptyConstructorCreateAResumeWithoutITSkill() {
        // Given
        // When
        Resume resume = new Resume();
        // Then
        Assertions.assertThat(resume.getItSkills()).isNull();
    }

    @Test
    public void EmptyConstructorCreateAResumeWithAnPositiveId() {
        // Given
        // When
        Resume resume = new Resume();
        // Then
        Assertions.assertThat(resume.getId()).isNotNull();
        Assertions.assertThat(resume.getId()).isGreaterThan(0);
    }

    @Test
    public void TwoEmptiesResumesHaveADifferentID() {
        // Given
        // When
        Resume resume = new Resume();
        Resume secondResume = new Resume();
        // Then
        Assertions.assertThat(resume.getId()).isNotEqualTo(secondResume.getId());
    }

    @Test
    public void SecondConstructorCreateAResumeWithName() {
        // Given
        String name = "Name";
        // When
        Resume resume = new Resume("Name", null, null,
                null, null, null, null);
        // Then
        Assertions.assertThat(resume.getName()).isNotNull();
        Assertions.assertThat(resume.getName()).isEqualTo(name);
    }

    @Test
    public void SecondConstructorCreateAResumeWithSurname() {
        // Given
        String surname = "Surname";
        // When
        Resume resume = new Resume(null, surname, null,
                null, null, null, null);
        // Then
        Assertions.assertThat(resume.getSurname()).isNotNull();
        Assertions.assertThat(resume.getSurname()).isEqualTo(surname);
    }

    @Test
    public void SecondConstructorCreateAResumeWithGoal() {
        // Given
        String goal = "Go To Work";
        // When
        Resume resume = new Resume(null, null, goal, null, null,
                null, null);
        // Then
        Assertions.assertThat(resume.getGoal()).isNotNull();
        Assertions.assertThat(resume.getGoal()).isEqualTo(goal);
    }

    @Test
    public void SecondConstructorCreateAResumeWithCursus() {
        // Given
        List<String> cursus = new ArrayList<String>();
        cursus.add("University of Rouen");
        // When
        Resume resume = new Resume(null, null, null, cursus, null,
                null, null);
        // Then
        Assertions.assertThat(resume.getCursus()).isNotNull();
        Assertions.assertThat(resume.getCursus().isEmpty()).isFalse();
        Assertions.assertThat(resume.getCursus().get(0)).isEqualTo(cursus.get(0));
    }

    @Test
    public void SecondConstructorCreateAResumeWithLanguages() {
        // Given
        List<String> languages = new ArrayList<String>();
        languages.add("Languages");
        // When
        Resume resume = new Resume(null, null, null, null, languages,
                null, null);
        // Then
        Assertions.assertThat(resume.getLanguages()).isNotNull();
        Assertions.assertThat(resume.getLanguages().isEmpty())
                .isFalse();
        Assertions.assertThat(resume.getLanguages().get(0))
                .isEqualTo(languages.get(0));
    }

    @Test
    public void SecondConstructorEmptyCreateAResumeWithSkill() {
        // Given
        List<String> skills = new ArrayList<String>();
        skills.add("ultraskills");
        // When
        Resume resume = new Resume(null, null, null, null, null,
                skills, null);
        // Then
        Assertions.assertThat(resume.getSkills()).isNotNull();
        Assertions.assertThat(resume.getSkills().isEmpty()).isFalse();
        Assertions.assertThat(resume.getSkills().get(0)).isEqualTo(skills.get(0));
    }

    @Test
    public void SecondConstructorCreateAResumeWithITSkill() {
        // Given
        List<String> itSkills = new ArrayList<String>();
        itSkills.add("ultraITskills");
        // When
        Resume resume = new Resume(null, null, null, null, null,
                null, itSkills);
        // Then
        Assertions.assertThat(resume.getItSkills()).isNotNull();
        Assertions.assertThat(resume.getItSkills().isEmpty()).isFalse();
        Assertions.assertThat(resume.getItSkills().get(0))
                .isEqualTo(itSkills.get(0));
    }

    @Test
    public void SecondConstructorCreateAResumeWithAPositiveId() {
        // Given
        // When
        Resume resume = new Resume(null, null, null, null, null,
                null, null);
        // Then
        Assertions.assertThat(resume.getId()).isNotNull();
        Assertions.assertThat(resume.getId()).isGreaterThan(0);
    }

    @Test
    public void TwoResumesBuildedBySecondConstructorHaveDifferentId() {
        // Given
        // When
        Resume resume = new Resume(null, null, null, null, null,
                null, null);
        Resume secondResume  = new Resume(null, null, null, null, null,
                null, null);
        // Then
        Assertions.assertThat(resume.getId())
                .isNotEqualTo(secondResume.getId());
    }



}
