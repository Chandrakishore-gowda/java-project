package com.company;

import java.util.Scanner;

// Main class

public class Main {

    public static void main(String[] args) {
	    ResumeBuilder resumeBuilder = new ResumeBuilder();
        getDetails(resumeBuilder);
        Template myResume = new TemplateResume(resumeBuilder);
        myResume.work();
    }

    public static void getDetails(ResumeBuilder resume){ // Takes input from user into the resume builder object.

        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        resume.setName(sc.nextLine());
        System.out.print("Age: ");
        resume.setAge(sc.nextLine());
        System.out.print("Date of Birth[DD/MM/YYYY]: ");
        resume.setDOB(sc.nextLine());
        System.out.print("Email-id: ");
        resume.setEmail(sc.nextLine());
        System.out.print("Contact No: ");
        resume.setContactNo(sc.nextLine());
        System.out.print("LinkedIn Profile: ");
        resume.setLinkedInProfile(sc.nextLine());
        System.out.print("About: ");
        resume.setAbout(sc.nextLine());
        System.out.print("Interests: ");
        resume.setInterests(sc.nextLine());
        System.out.print("Hobbies: ");
        resume.setHobbies(sc.nextLine());
        System.out.print("Skills: ");
        resume.setSkills(sc.nextLine());
        System.out.print("Language Proficiency: ");
        resume.setLangProficiency(sc.nextLine());
        System.out.print("SSC Percentage: ");
        resume.setSSCResult(sc.nextLine());
        System.out.print("HSC Percentage: ");
        resume.setHSCResult(sc.nextLine());
        System.out.print("Degree Percentage: ");
        resume.setDegreeResult(sc.nextLine());
        System.out.print("Internships(If any): ");
        resume.setInternship(sc.nextLine());
        System.out.print("Experience(If any): ");
        resume.setExperience(sc.nextLine());

    }

}
