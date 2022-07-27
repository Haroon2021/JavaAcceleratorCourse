package Tree;
public class Tree {

    private int height;
    private int foodReserves;
    private int[] positionInForest;
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
  
    public void photosynthesise() {
        this.foodReserves++;
    }
  
    // Getters and Setters ommited (explained in lesson 5 Encapsulation)
  }