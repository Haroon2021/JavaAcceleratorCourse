package tree;

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

    public static void main(String[] args) {
        Tree a = new Tree("Pine", 12, 15);
        System.out.println(a.species);
        for (int position : a.positionInForest) {
            System.out.println(position);
        }
        System.out.println(a.foodReserves);
        System.out.println(a.height);
        
    }
    // Getters and Setters ommited (explained in lesson 5 Encapsulation)
  }
