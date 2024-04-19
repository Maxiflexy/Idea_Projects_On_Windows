package AwaitingJAVA.Day3.HospitalSystem;
public class Main {
    public static void main(String[] args) {


        Doctor doctorA = new Doctor();
        doctorA.setName("James Milner");
        doctorA.setGender("Male");
        doctorA.setAge(35);
        doctorA.setStateOfOrigin("Anambra");
        doctorA.setQualification("Master Degree");
        doctorA.setYearOfExperience(15);
        doctorA.setSpecialty("Optometrist");
        doctorA.setCurrentlyAvailable(true);
        doctorA.setNationality("Nigeria");
        doctorA.setBloodGroup('O');

        Doctor doctorB = new Doctor();
        doctorB.setName("Onyekachi Maximillian");
        doctorB.setGender("Male");
        doctorB.setAge(45);
        doctorB.setStateOfOrigin("Imo");
        doctorB.setQualification("Professor");
        doctorB.setYearOfExperience(25);
        doctorB.setSpecialty("Dentist");
        doctorB.setCurrentlyAvailable(true);
        doctorB.setNationality("Nigeria");
        doctorB.setBloodGroup('A');



        Doctor doctorC = new Doctor();
        doctorC.setName("Emmanuel Johanna");
        doctorC.setGender("Female");
        doctorC.setAge(30);
        doctorC.setStateOfOrigin("Lagos");
        doctorC.setQualification("Master Degree");
        doctorC.setYearOfExperience(8);
        doctorC.setSpecialty("Orthopedic Surgeon");
        doctorC.setCurrentlyAvailable(true);
        doctorC.setNationality("Ghanaian");
        doctorC.setBloodGroup('O');


        Patient patientA = new Patient();
        patientA.setName("Ifeoma Poker");
        patientA.setGender("Female");
        patientA.setAge(28);
        patientA.setStateOfOrigin("Imo");
        patientA.setHasAppointment(true);
        patientA.setCardNumber(24567);
        patientA.setBill(45000);
        patientA.setNationality("Nigerian");
        patientA.setBloodGroup('O');


        Patient patientB = new Patient();
        patientB.setName("Kiki Declan");
        patientB.setGender("Female");
        patientB.setAge(18);
        patientB.setStateOfOrigin("Lagos");
        patientB.setHasAppointment(true);
        patientB.setCardNumber(267);
        patientB.setBill(6000);
        patientB.setNationality("Nigerian");
        patientB.setBloodGroup('A');


        Patient patientC = new Patient();
        patientC.setName("Lionel Messi");
        patientC.setGender("Male");
        patientC.setAge(38);
        patientC.setStateOfOrigin("Nazario");
        patientC.setHasAppointment(true);
        patientC.setCardNumber(26744);
        patientC.setBill(88000);
        patientC.setNationality("Argentina");
        patientC.setBloodGroup('A');


        Nurse nurseA = new Nurse();
        nurseA.setName("Abigail Banks");
        nurseA.setGender("Female");
        nurseA.setAge(22);
        nurseA.setStateOfOrigin("Ogun");
        nurseA.setQualification("Master of Nursing");
        nurseA.setCurrentPosition("Junior");
        nurseA.setYearsOfExperience(3);
        nurseA.setNationality("Nigeria");
        nurseA.setBloodGroup('O');


        Nurse nurseB = new Nurse();
        nurseB.setName("Vivian Mary");
        nurseB.setGender("Female");
        nurseB.setAge(25);
        nurseB.setStateOfOrigin("Imo");
        nurseB.setQualification("Master of Nursing");
        nurseB.setCurrentPosition("Intermediate");
        nurseB.setYearsOfExperience(5);
        nurseB.setNationality("Nigeria");
        nurseB.setBloodGroup('B');


        Nurse nurseC = new Nurse();
        nurseC.setName("Johny Evans");
        nurseC.setGender("Male");
        nurseC.setAge(28);
        nurseC.setStateOfOrigin("Imo");
        nurseC.setQualification("Master of Nursing");
        nurseC.setCurrentPosition("Junior");
        nurseC.setYearsOfExperience(2);
        nurseC.setNationality("Nigeria");
        nurseC.setBloodGroup('A');



        MedicalEquipment medicalEquipmentA = new MedicalEquipment();
        medicalEquipmentA.setName("Retinoscope");
        medicalEquipmentA.setTypeOfUsage("Eye Test");
        medicalEquipmentA.setSize("Medium");

        MedicalEquipment medicalEquipmentB = new MedicalEquipment();
        medicalEquipmentB.setName("Dental Drill");
        medicalEquipmentB.setTypeOfUsage("Tooth removal");
        medicalEquipmentB.setSize("Small");

        MedicalEquipment medicalEquipmentC = new MedicalEquipment();
        medicalEquipmentC.setName("Braces");
        medicalEquipmentC.setTypeOfUsage("Ligament Holder");
        medicalEquipmentC.setSize("Medium");


        Optometry optometry = new Optometry();
        optometry.setDoctor(doctorA);
        optometry.setNurse(nurseA);
        optometry.setPatient(patientA);
        optometry.setMedicalEquipment(medicalEquipmentA);

        Dentistry dentistry = new Dentistry();
        dentistry.setDoctor(doctorB);
        dentistry.setNurse(nurseB);
        dentistry.setPatient(patientB);
        dentistry.setMedicalEquipment(medicalEquipmentB);

        Orthopedics orthopedics = new Orthopedics();
        orthopedics.setDoctor(doctorC);
        orthopedics.setNurse(nurseC);
        orthopedics.setPatient(patientC);
        orthopedics.setMedicalEquipment(medicalEquipmentC);

        Department department = new Department();
        department.setOptometry(optometry);
        department.setDentistry(dentistry);
        department.setOrthopedics(orthopedics);

        Hospital hospital = new Hospital();
        hospital.setDepartment(department);
        System.out.println();
        System.out.println(hospital);



    }

}
