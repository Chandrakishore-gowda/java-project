package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Concrete Template class which implements the primitive operations.

public class TemplateResume implements Template {

    BufferedWriter bw;
    ResumeBuilder resumeBuilder;
    Resume resume;
    String finalResume;

    TemplateResume(ResumeBuilder resumeBuilder){ // Constructor initializes resume and resume-builder objects.
        try {
            bw = new BufferedWriter(new FileWriter("C:\\Users\\ADMIN\\Downloads\\Resume-Builder-Application-using-Design-Patterns-main\\Resume-Builder-Application-using-Design-Patterns-main\\src\\com\\company\\resume.txt"));
        }
        catch (IOException e){
            System.out.println(e);
        }
        this.resumeBuilder = resumeBuilder;
        resume = resumeBuilder.getResume();
    }

    @Override
    public void initialize() { // Adds the heading to the resume(Hook Operation).
        try {
            bw.write("========================================================================================================================\n");
            bw.write("\t\t\t\t\t\t                                 RESUME\n");
            bw.write("========================================================================================================================\n");
            bw.flush();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }

    @Override
    public void buildResume() { // Building resume by composing different attributes together.
        Component name = new Name(resume.name);
        Component age = new Age(resume.age);
        Component dob = new DateOfBirth(resume.dob);
        Component contactno = new ContactNo(resume.contactNo);
        Component email = new EmailId(resume.email);
        Component linkedIn = new LinkedInProfile(resume.linkedInprofile);
        Component hsc = new HSCResult(resume.hscResult);
        Component ssc = new SSCResult(resume.sscResult);
        Component degreeres = new DegreeResult(resume.degreeResult);
        Component hobbies= new Hobbies(resume.hobbies);
        Component about= new AboutMe(resume.about);
        Component interests= new Interests(resume.interests);
        Component skills= new Skills(resume.skills);
        Component langProf= new LanguageProficiency(resume.langProficiency);
        Component internship= new Internship(resume.internship);
        Component workExp= new Experience(resume.experience);

        Component aboutMe = new ResumeComponents("About-Me");
        aboutMe.addComponent(about);

        Component personalDetails = new ResumeComponents("Personal Details");
        personalDetails.addComponent(name);
        personalDetails.addComponent(age);
        personalDetails.addComponent(dob);

        Component qualifications = new ResumeComponents("Educational Qualification");
        qualifications.addComponent(ssc);
        qualifications.addComponent(hsc);
        qualifications.addComponent(degreeres);

        Component expertise = new ResumeComponents("Expertise");
        expertise.addComponent(skills);
        expertise.addComponent(langProf);

        Component work = new ResumeComponents("Professional Experience");
        work.addComponent(internship);
        work.addComponent(workExp);

        Component contact = new ResumeComponents("Contact Details");
        contact.addComponent(contactno);
        contact.addComponent(email);
        contact.addComponent(linkedIn);

        Component extraCurricular = new ResumeComponents("Extra Curricular");
        extraCurricular.addComponent(interests);
        extraCurricular.addComponent(hobbies);

        Component mainResume = new ResumeComponents("Resume");
        mainResume.addComponent(aboutMe);
        mainResume.addComponent(personalDetails);
        mainResume.addComponent(qualifications);
        mainResume.addComponent(expertise);
        mainResume.addComponent(work);
        mainResume.addComponent(contact);
        mainResume.addComponent(extraCurricular);

        finalResume = mainResume.displayComponent();
        System.out.println("Preparing your Resume....");
    }

    @Override
    public void writeResume() { // Writes the resume content into the text file.
        try {
            bw.write(finalResume);
            bw.flush();
        }
        catch (IOException e){
            System.out.println(e);
        }
        System.out.println("Generating file...");
    }

    @Override
    public void end() { // Adds final formatting to the resume file (Hooks Operation).
        try {
            bw.write("\n========================================================================================================================");
            bw.flush();
            bw.close();

            Path path = Paths.get("C:\\Users\\ADMIN\\Downloads\\Resume-Builder-Application-using-Design-Patterns-main\\Resume-Builder-Application-using-Design-Patterns-main\\src\\com\\company\\resume.txt");
            Charset charset = StandardCharsets.UTF_8;
            String content = new String(Files.readAllBytes(path), charset);
            content = content.replaceAll("ResumeComponents:", "");
            Files.write(path, content.getBytes(charset));

            System.out.println();
            System.out.println("Your Resume is ready...");
        }
        catch (IOException e){
            System.out.println(e);
        }
        System.out.println("Resume generated successfully...");
    }

    @Override
    public void work() { // Template Method that decides the flow of program.
        initialize();
        buildResume();
        writeResume();
        end();
    }
}
