package ru.job4j.Inheritance;

import java.util.Date;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private Date birthday;

    public Profession (String name, String surname, String education, Date birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }


    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEducation(){
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Date getBirthday(){
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}

