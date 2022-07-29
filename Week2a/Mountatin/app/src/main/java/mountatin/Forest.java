package mountatin;

import java.util.ArrayList;
import java.util.Random;

public class Forest {
    private static String[] species = {"pine","oak","birch","Juniper","fir","redwood","cypris","yew","hemolock","sequoia"};
    private static ArrayList<Tree> forest = new ArrayList<Tree>();
    public int minTrees;
    private int gridMap;


    public Forest() {  
        this.minTrees = 5;
    }

    public static Integer randomnumberGenerator() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public void createForest() {
        for (int i = 0; i < 5; i++) {
            for (String specie: species ) {

                Integer xLocation = randomnumberGenerator();
                Integer yLocation = randomnumberGenerator();

                if (isGridOccupied(xLocation,yLocation) == true){
                    xLocation = randomnumberGenerator();
                    yLocation = randomnumberGenerator();
                }

                Tree tree = new Tree(specie,xLocation,yLocation);
                // System.out.printf(tree.positionInForest[0] + " , " + tree.positionInForest[1] + " ");
                forest.add(tree);
                System.out.printf(tree.speciesDeclaration());
                System.out.println(" ");

                growAllTrees();

            }
        }
    }

    public static Boolean isGridOccupied(Integer xLocation, Integer yLocation){
        for (Tree tree: forest){
            if (tree.positionInForest[0] == xLocation && tree.positionInForest[1] == yLocation){
                // System.out.println("There is a tree here, I have created a new location");
                return true;
            }
        }
        return false;
    }   

    private static void growAllTrees(){
        for (Tree treeInForest : forest){
            treeInForest.photosynthesise();
            treeInForest.grow();
        }
    }
    
}
