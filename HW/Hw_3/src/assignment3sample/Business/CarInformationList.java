/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3sample.Business;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
public class CarInformationList {
//    private static CarInformationList carLists;
    public ArrayList<Car> carList;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public CarInformationList(){
        
        carList = new ArrayList<>();
        
        Car car1 = new Car(true, "Ferrari", 2019, 1, 2, 1,"Red One", "Boston", true);
        Car car2 = new Car(true, "BMW", 2019, 1, 4, 2, "X1", "New York", true);
        Car car3 = new Car(true, "Toyota", 2018, 1, 4, 3, "T1", "Boston", true);
        Car car4 = new Car(true, "GM", 2018, 1, 4, 4, "G1", "New York", true);
        Car car5 = new Car(true, "Toyota", 2017, 1, 4, 5, "T2", "Chicago", true);
        Car car6 = new Car(true, "GM", 2017, 1, 4, 6, "G2", "Chicago", true);
        Car car7 = new Car(true, "Ferrari", 2016, 1, 4, 7, "Red Two", "Seattle", true);
        Car car8 = new Car(true, "BMW", 2016, 1, 4, 8, "X2", "Seattle", true);
        Car car9 = new Car(true, "Toyota", 2019, 1, 4, 9, "T3", "Austin", true);
        Car car10 = new Car(true, "GM", 2019, 1, 4, 10, "G3", "Austin", true);
        
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
    
    }
    
    public ArrayList<Car> getCarList(){
        return carList;
    }

//    public static CarInformationList  getCarList() {
//        carLists = new CarInformationList();
//        return carLists;
//    }
    
    public Car addCar(){
        Car car=new Car();
        carList.add(car);
        return car;
    }
    public void deleteCar(Car car){
        carList.remove(car);
    }
    public ArrayList<Car> searchBrand(String brand){
        ArrayList<Car> arrayList=new ArrayList<Car>();
        for(Car car:carList){
            if(car.getBrand().equals(brand)){
            arrayList.add(car);
        }
    } 
    return arrayList;
    }
    public ArrayList<Car> searchCity(String availble_city){
         ArrayList<Car> arrayList=new ArrayList<Car>();
        for(Car car:carList){
            if(car.getAvailble_city().equals(availble_city)){
             arrayList.add(car);
            }
        } 
    return arrayList;
    }
    
    public ArrayList<Car> searchModel(String model_num){
        ArrayList<Car> arrayList=new ArrayList<Car>();
        for(Car car:carList){
            if(car.getModel_num().equals(model_num)){
            arrayList.add(car);
            }
        } 
        return arrayList;
        }
    
    public ArrayList<Car> searchSerial(int serial_num){
        ArrayList<Car> arrayList=new ArrayList<Car>();
        for(Car car:carList){
            if(car.getSerial_num()==(serial_num)){
           arrayList.add(car);
        }
        } 
    return arrayList;
    }
    public ArrayList<Car> searchYears(int manufactured_year){
        ArrayList<Car> arrayList=new ArrayList<Car>();
        for(Car car:carList){
            if(car.getManufactured_year()==(manufactured_year)){
             arrayList.add(car);
            }
        } 
    return arrayList;
    }    
    
    public ArrayList<Car> searchSeats(int min_seats,int max_seats){
        ArrayList<Car> seatList=new ArrayList<Car>();
        for(Car car:carList){
            if(car.getMin_seats()==min_seats && car.getMax_seats()==max_seats){
             seatList.add(car);
            }
        } 
    return seatList;
    } 
    
    
     public Car FirstCar(){
        
        for(Car car:this.carList){
            if(car.isAvailable()){
              return car;  
            }
        }
        return null;
     } 
     
      public ArrayList<Car> searchMainAvail(){
        ArrayList<Car> arrayList=new ArrayList<Car>();
        for(Car car:carList){
            if(!car.isMaintenance_certificate()){
              arrayList.add(car);  
            }
        }
        return arrayList;
     } 
    
    public int AvailableNum(){
        int num=0;
        for(Car car:this.carList){
            if(car.isAvailable()){
                num++;
            }
        }
        return num;
     }    
   
   public int UnAvailableNum(){
        int num=0;
        for(Car car:this.carList){
            if(!car.isAvailable()){
                num++;
            }
        }
         return num;
   } 
   
  
    
public String searchByBrand(){
String n="";
Set<String> s =new HashSet<>();
for(Car car:this.carList){
s.add(car.getBrand());
}
for(String s1:s){
n+=s1+"";
}
return n;
}

    
      
}