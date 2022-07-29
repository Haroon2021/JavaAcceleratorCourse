package mountatin;

import java.util.HashMap;

public class Tree {

    public int height;
    private int foodReserves;
    public int[] positionInForest;
    public String species;
    public HashMap<String, Integer> photosynthesisRate = new HashMap<String, Integer>();

    public Tree(String species, int posX, int posY) {
        this.species = species;
        this.positionInForest = new int[2];
        this.positionInForest[0] = posX;
        this.positionInForest[1] = posY;
        photosynthesisRate.put("pine",10);
        photosynthesisRate.put("oak",5);
        photosynthesisRate.put("birch",1);
        photosynthesisRate.put("Juniper",1);
        photosynthesisRate.put("fir",1);
        photosynthesisRate.put("redwood",1);
        photosynthesisRate.put("cypris",1);
        photosynthesisRate.put("yew",1);
        photosynthesisRate.put("hemolock",1);
        photosynthesisRate.put("sequoia",1);
    }
  
    public void grow() {
        if (this.foodReserves > 10) {
            this.foodReserves = 0; // After growing, the excess of nutrients is lost
            this.height++;
        }
    }

    public boolean isTreeMature() {
        if(this.height==20) {
            System.out.printf("I am a healthy " + this.species + " tree \n");
            System.out.printf("My height is %d \n", this.height);
            return true;
        } else {
            return false;
        }
    }

    public String speciesDeclaration() {
        return "I am a born " + this.species + " tree";
    }
  
    public void photosynthesise() {
        // this.foodReserves++;
        Integer phSpeed = photosynthesisRate.get(this.species);
        this.foodReserves += phSpeed;
    }
  
    // Getters and Setters ommited (explained in lesson 5 Encapsulation)
  }