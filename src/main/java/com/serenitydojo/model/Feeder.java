package com.serenitydojo.model;



public class Feeder {


    public String feeds(String animal, boolean isPremium) {
        if (animal.equals("Cat")) {

          /* if(isPremium){
     return "Salmon";
     } else
     return "Tuna";*/
            return (isPremium == true) ? "Salmon" : "Tuna";
        } else if(animal.equals("Dog")){
            /*if(isPremium) {
                return "DeluxeDogFood";
            } else
                return "Dog Food";*/
              return(isPremium == true) ? "DeluxeDogFood" : "Dog Food";
        }
       /* else if(isPremium){
            return "Lettuce";
        }
        else {
            return "Cabbage";*/
        else {
            return (isPremium == true) ? "Lettuce" : "Cabbage";
        }

    }



    }




