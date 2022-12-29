package com.text_msg_registration_form.dev;

import java.util.Date;

public class patient_info {


    String patient_firstName;
    String patient_lastName;
    String patient_middleName;
    String maritalStatus;
    boolean legalName;
    String patient_legalName;
    String formerName;
    Date birthDay;
    int age;
    String sex;
    String patient_address;
    int ss_num;
    int home_phoneNumber;
    int cell_phoneNumber;
    String patient_email;
    String occupation;
    String employerName;
    int employer_PhoneNumber;
    String referredBy_clinic_or_doctor;
    String familyMembers_seen_here;
    //constructor to receive patient info
    public patient_info(String patient_firstName, String patient_lastName, String patient_middleName, Date birthDay,
                        int age, String sex, String patient_address, int ss_num, int cell_phoneNumber){
        this.patient_firstName = patient_firstName;
        this.patient_lastName = patient_lastName;
        this.birthDay = birthDay;
        this.age = age;
        this.sex = sex;
        this.patient_address = patient_address;
        this.ss_num = ss_num;
        this.cell_phoneNumber = cell_phoneNumber;
    }

    // ask for insurance
    // ask for emergency info
    //generate random password
    //set mailbox capacity
    //set alternate email
    //change password

}
