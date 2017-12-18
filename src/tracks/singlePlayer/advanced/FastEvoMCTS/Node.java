package tracks.singlePlayer.advanced.FastEvoMCTS;

import ontology.Types;
import tools.Vector2d;

/**
 * This code is taken from https://github.com/diegopliebana/EvoMCTS/tree/master/src/FastEvoMCTS and modified. 
 */
public class Node implements Comparable<Node> {

    public double totalCost;
    public double estimatedCost;
    public Node parent;
    public Vector2d position;
    public Types.ACTIONS comingFrom;
    public int id;

    public Node(Vector2d pos)
    {
        estimatedCost = 0.0f;
        totalCost = 1.0f;
        parent = null;
        position = pos;
        id = (int) (position.x * 100 + position.y);
    }

    @Override
    public int compareTo(Node n) {
        if(this.estimatedCost + this.totalCost < n.estimatedCost + n.totalCost)
            return -1;
        if(this.estimatedCost + this.totalCost > n.estimatedCost + n.totalCost)
            return 1;
        return 0;
    }

    @Override
    public boolean equals(Object o)
    {
        return this.position.equals(((Node)o).position);
    }

}
