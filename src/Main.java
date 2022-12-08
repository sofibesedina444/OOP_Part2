import transport.Automobile;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Задание №3
        Automobile automobile1 = new Automobile("Lada", "Granta", 1.7,
                "Желтый", 2015, "Россия");
        Automobile automobile2 = new Automobile("Audi", "A8 50 L TDI quattro", 3.0,
                "Черный", 2020, "Германия");
        automobile2.setTransmission("Автоматический");
        Automobile automobile3 = new Automobile("BMW", "Z8", 3.0,
                "Черный", 2021, "Германия");
        automobile3.setSummerTireType(false);
        Automobile automobile4 = new Automobile("Kia", "Sportage 4-го поколения", 2.4,
                "Красный", 2018, "Южная Корея");
        automobile4.setRegistrationNumber("К222ОТ783");
        Automobile automobile5 = new Automobile("Hyundai", "Avante", 1.6,
                "Оранжевый", 2016, "Южная Корея");
        automobile5.setKey(new Automobile.Key(true, true));
        automobile5.setInsurance(new Automobile.Insurance(LocalDate.now(), 15000D, "98765432"));

        System.out.println(automobile1);
        System.out.println(automobile2);
        System.out.println(automobile3);
        System.out.println(automobile4);
        System.out.println(automobile5);
        System.out.println("\n");
        System.out.println(automobile4.isCorrectRegistrationNumber());
        automobile5.getInsurance().checkNumberInsurance();
        automobile5.getInsurance().checkValidityInsurance();
    }
}
