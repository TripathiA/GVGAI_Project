package tracks.singlePlayer.advanced.FastEvoMCTS;

import core.game.StateObservation;
import tools.ElapsedCpuTimer;

/**
 *This code is taken from https://github.com/diegopliebana/EvoMCTS/tree/master/src/FastEvoMCTS and modified. 
 */
public abstract class TreeNode {

    public StateObservation state;
    public int childIdx;

    ////// addition   ////
    abstract void setfavourable_acts(int[] fav_acts);
    //////////////////////

    abstract void mctsSearch(ElapsedCpuTimer elapsedTimer, TunableRoller roller, FitVectorSource source);

    abstract int bestBiasedAction();

    abstract int biasedRootAction(StateObservation state, VariableFeatureWeightedRoller roller);

    abstract int mostVisitedAction();

    abstract int bestAction();
}
