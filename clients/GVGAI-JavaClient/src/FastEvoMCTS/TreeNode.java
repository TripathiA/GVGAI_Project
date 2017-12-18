package tracks.singlePlayer.advanced.FastEvoMCTS;

import server-out.core.game.StateObservation;
import server-out.tools.ElapsedCpuTimer;

/**
 * Created by diego on 23/09/14.
 */
public abstract class TreeNode {

    public StateObservation state;
    public int childIdx;


    abstract void mctsSearch(ElapsedCpuTimer elapsedTimer, TunableRoller roller, FitVectorSource source);

    abstract int bestBiasedAction();

    abstract int biasedRootAction(StateObservation state, VariableFeatureWeightedRoller roller);

    abstract int mostVisitedAction();

    abstract int bestAction();
}
