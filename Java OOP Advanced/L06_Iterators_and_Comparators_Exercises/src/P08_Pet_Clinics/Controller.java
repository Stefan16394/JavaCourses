package P08_Pet_Clinics;

import java.util.LinkedHashMap;
import java.util.Map;

public class Controller {
    Map<String, Clinic> clinics = new LinkedHashMap<>();
    Map<String, Pet> pets = new LinkedHashMap<>();

    public void createPet(String name, int age, String kind) {
        Pet pet = new Pet(name, age, kind);
        pets.put(name, pet);
    }

    public void createClinic(String name, int rooms) {
        Clinic clinic=new Clinic(name,rooms);
        clinics.put(name,clinic);
    }

    public boolean add(String petName, String clinicName) {
        Clinic clinic=clinics.get(clinicName);
        Pet pet=pets.get(petName);

            return clinic.addPet(pets.get(petName));

    }

    public boolean release(String clinicName) {
        Clinic clinic=clinics.get(clinicName);
        return clinic.release();
    }

    public boolean hasEmptyRooms(String clinicName)
    {
        Clinic clinic=clinics.get(clinicName);
        return clinic.hasEmptyRooms();
    }

    public void print(String clinicName)
    {
        Clinic clinic=clinics.get(clinicName);
        clinic.printRooms();
    }

    public void printRoom(String clinicName,int room)
    {
        Clinic clinic=clinics.get(clinicName);
        clinic.printRoom(room);
    }

    public Map<String, Clinic> getClinics() {
        return clinics;
    }

    public Map<String, Pet> getPets() {
        return pets;
    }
}
