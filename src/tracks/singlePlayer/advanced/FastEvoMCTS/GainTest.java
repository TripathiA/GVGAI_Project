package tracks.singlePlayer.advanced.FastEvoMCTS;

/**
 * This code is taken from https://github.com/diegopliebana/EvoMCTS/tree/master/src/FastEvoMCTS and modified. 
 */
public class GainTest
{
    public static double testGain(double pre, double post)
    {
        return (post / pre) - 1;
    }

    public static void main(String args[])
    {
        for(int i = 0; i < 10; ++i)
        {
            double pre = i;
            double post = i+1;
            double gain = testGain(pre, post);

            //System.out.println(pre + " => " + post + " : " + gain);
        }
        //System.out.println();

        for(int i = 0; i < 10; ++i)
        {
            double pre = i;
            double post = i+2;
            double gain = testGain(pre, post);

            //System.out.println(pre + " => " + post + " : " + gain);
        }


    }
}
