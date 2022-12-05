public class Automobile {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Automobile(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null && !model.isEmpty()) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (country != null && !country.isEmpty()) {
            this.country = country;
        } else {
            this.country = "default";
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color != null && !color.isEmpty()) {
            this.color = color;
        } else {
            this.color = "Белый";
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }

    @Override
    public String toString() {
        String separator = " ";
        return "Бренд и модель: " + brand + separator + model +
                ", Объем двигателя: " + engineVolume +
                ", Цвет кузова: " + color +
                ", Год выпуска: " + year +
                ", Страна сборки: " + country;
    }
}
