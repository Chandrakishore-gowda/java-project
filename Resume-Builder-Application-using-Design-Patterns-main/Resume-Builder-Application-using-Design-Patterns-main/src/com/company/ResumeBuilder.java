package com.company;

//Resume Builder Class: Sets the values of attributes by initializing the instance of resume class.

public class ResumeBuilder {

    private Resume resume;


    ResumeBuilder(){
        resume = new Resume();
    }


    public ResumeBuilder setName(String name) { // sets name
        resume.name = name;
        return this;
    }


    public ResumeBuilder setAge(String age) { //sets age
        resume.age = age;
        return this;
    }


    public ResumeBuilder setAbout(String about) { // sets about-me
        resume.about = about;
        return this;
    }


    public ResumeBuilder setDOB(String dob) { // sets Date of Birth
        resume.dob = dob;
        return this;

    }


    public ResumeBuilder setContactNo(String contactNo) { // sets contact number
        resume.contactNo = contactNo;
        return this;

    }


    public ResumeBuilder setLinkedInProfile(String linkedInProfile) { // sets LinkedInProfile
        resume.linkedInprofile = linkedInProfile;
        return this;

    }


    public ResumeBuilder setHSCResult(String hscResult) { // sets HSC result
        resume.hscResult = hscResult;
        return this;

    }


    public ResumeBuilder setSSCResult(String sscResult) { // sets SSC Result
        resume.sscResult = sscResult;
        return this;

    }


    public ResumeBuilder setDegreeResult(String degreeResult) { // sets Degree Result
        resume.degreeResult = degreeResult;
        return this;

    }


    public ResumeBuilder setHobbies(String hobbies) { // sets Hobbies
        resume.hobbies = hobbies;
        return this;

    }


    public ResumeBuilder setInterests(String interests) { // sets Interests
        resume.interests = interests;
        return this;

    }


    public ResumeBuilder setSkills(String skills) { // sets skills
        resume.skills = skills;
        return this;

    }


    public ResumeBuilder setEmail(String email) { // sets email
        resume.email = email;
        return this;

    }


    public ResumeBuilder setExperience(String experience) { // sets Experiencce
        resume.experience = experience;
        return this;

    }


    public ResumeBuilder setInternship(String internship) { // sets Internship details
        resume.internship = internship;
        return this;

    }

    public ResumeBuilder setLangProficiency(String langProficiency) { // sets Language proficiency
        resume.langProficiency = langProficiency;
        return this;
    }

    public Resume getResume(){
        return resume;
    } // Returns the resume object

}
