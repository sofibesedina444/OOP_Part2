public class Main {
    public static void main(String[] args) {

        //Задание №3
        Automobile automobile1 = new Automobile("Lada", "Granta", 1.7,
                "Желтый", 2015, "Россия");
        Automobile automobile2 = new Automobile("Audi", "A8 50 L TDI quattro", 3.0,
                "Черный", 2020, "Германия");
        Automobile automobile3 = new Automobile("BMW", "Z8", 3.0,
                "Черный", 2021, "Германия");
        Automobile automobile4 = new Automobile("Kia", "Sportage 4-го поколения", 2.4,
                "Красный", 2018, "Южная Корея");
        Automobile automobile5 = new Automobile("Hyundai", "Avante", 1.6,
                "Оранжевый", 2016, "Южная Корея");
        System.out.println(automobile1);
        System.out.println(automobile2);
        System.out.println(automobile3);
        System.out.println(automobile4);
        System.out.println(automobile5);

    }
}
