package ntou.cs.java2021;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

public class DailyEnergyRecoder {
    private String date;
    private List<FoodData> list;
    private double calories;
    private double protein;
    private double carbohydrates;
    private double fat;
    private double saturatedFat;
    private double transFat;
    private double sugar;

    public String getDate() {
        return date;
    }

    public double getCalories() {
        return calories;
    }

    public double getProtein() {
        return protein;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getFat() {
        return fat;
    }

    public double getSaturatedFat() {
        return saturatedFat;
    }

    public double getTransFat() {
        return transFat;
    }

    public double getSugar() {
        return sugar;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public void setSaturatedFat(double saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    public void setTransFat(double transFat) {
        this.transFat = transFat;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }
    public DailyEnergyRecoder(String date){
        this.date = date;
        this.calories = 0;
        this.protein = 0;
        this.carbohydrates = 0;
        this.fat = 0;
        this.saturatedFat = 0;
        this.transFat = 0;
        this.sugar = 0;
        this.list = new ArrayList<>();
    }

    public void add(FoodData foodData){
        list.add(foodData);
    }
    public void delete(FoodData foodData){
        for(int i = 0; i < list.size(); i++){
            if(foodData.equals(list.get(i)))
                list.remove(i);
        }
    }
}