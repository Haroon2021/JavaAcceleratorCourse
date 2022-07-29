package mountatin;

public class Tree {

    private int height;
    private int foodReserves;
    public int[] positionInForest;
    private String species;

    public Tree(String species, int posX, int posY) {
        this.species = species;
        this.positionInForest = new int[2];
        this.positionInForest[0] = posX;
        this.positionInForest[1] = posY;
    }
  
    public void grow() {
        if (this.foodReserves > 10) {
            this.foodReserves = 0; // After growing, the excess of nutrients is lost
            this.height++;
        }
    }

    public boolean isTreeMature() {
        if(this.height>=20) {
            System.out.printf("I am a healthy " + this.species + " tree");
            return true;
        } else {
            return false;
        }
    }

    public String speciesDeclaration() {
        return "I am a born " + this.species + " tree";
    }
  
    public void photosynthesise() {
        this.foodReserves++;
    }
  
    // Getters and Setters ommited (explained in lesson 5 Encapsulation)
  }