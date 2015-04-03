package nyc.c4q.m47bell;
import java.util.HashSet;

/**
 * Created by c4q-marbella on 4/2/15.
 * Access Code 2-1
 * Marbella Vidals
 */

//create a new set before returning
public class SocialNetwork
{

    public static void main(String[] args)
    {
        HashSet<String> yours = new HashSet();
        yours.add("Yelena");
        yours.add("Jamal");
        yours.add("Eve");
        HashSet<String> mine = new HashSet();
        mine.add("Sebastian");
        mine.add("Mala");
        mine.add("Eve");

        // You should be able to run all of these in a row:
        System.out.println(allFriends(yours, mine));
        System.out.println(mutualFriends(yours, mine));
        System.out.println(justYourFriends(yours, mine));
        System.out.println(justMyFriends(yours, mine));
        System.out.println(exclusiveFriends(yours, mine));
        System.out.println(yourFriendsAreMine(yours, mine));
        //System.out.println( youHaveFriends(yours, mine) );
        //System.out.println( matchmaker(yours, mine) );
    }

    public static HashSet<String> allFriends(HashSet<String> yours, HashSet<String> mine)
    {
        // Yelena, Jamal, Eve, Sebastian, Mala

        //initalizing allFriends
        HashSet<String> allFriends = new HashSet<String>();

        //add yours and mine to allFriends
        allFriends.addAll(yours);
        allFriends.addAll(mine);
        //remove duplicates {don't need to worry about, sets take care of this}

        //add the new set to allFriends { dont need to worry, bc allFriends is already added


        //return allFriends
        return allFriends;

    }

    public static HashSet<String> mutualFriends(HashSet<String> yours, HashSet<String> mine)
    {
        // Eve

        //Initialize mutual friends set
        HashSet<String> mutualFriends = new HashSet<String>();

        //Iterate through set yours
        for(String mutual : yours)
        {
            //find mutual name in mine
            if(mine.contains(mutual))
            {
                // add mutual name to mutualFriends set
                mutualFriends.add(mutual);
            }
        }

        return mutualFriends;

    }

    public static HashSet<String> justYourFriends(HashSet<String> yours, HashSet<String> mine)
    {
        // Yelena, Jamal

        HashSet<String> justYourFriends = new HashSet<String>();

        for(String notMutual : yours)
        {

            if(! mine.contains(notMutual))
            {
                justYourFriends.add(notMutual);
            }
        }

        return justYourFriends;

    }

    public static HashSet<String> justMyFriends(HashSet<String> yours, HashSet<String> mine)
    {
        // Sebastian, Mala

        HashSet<String> justMyFriends = new HashSet<String>();

        for(String notMutual : mine)
        {

            if(! yours.contains(notMutual))
            {
                justMyFriends.add(notMutual);
            }
        }

        return justMyFriends;

    }

    public static HashSet<String> exclusiveFriends(HashSet<String> yours, HashSet<String> mine)
    {
        // Yelena, Jamal, Sebastian, Mala

        HashSet<String> exclusiveFriends = new HashSet<String>();

        for(String notMutual : mine)
        {

            if(! yours.contains(notMutual))
            {
                exclusiveFriends.add(notMutual);
            }
        }

        for(String notMutual : yours)
        {

            if(! mine.contains(notMutual))
            {
                exclusiveFriends.add(notMutual);
            }
        }

        return exclusiveFriends;


    }

    public static boolean yourFriendsAreMine(HashSet<String> yours, HashSet<String> mine)
    {
        // true if all your friends are also my friends

        //Initialize boolean yourFriendsAreMine
        boolean yourFriendsAreMine = true;

        //clone yours set
        HashSet<String> yourAmigosMyAmigos = new HashSet<String>(yours);

        yourAmigosMyAmigos.addAll(mine);

        //if your friends are mine..its true
        if(yourAmigosMyAmigos.contains(mine))
        {

            return yourFriendsAreMine;

        }
        else
        {
            return yourFriendsAreMine;
        }


    }

//    public static boolean youHaveFriends(HashSet<String> yours) {
//        // true if you have any friends
//
//
//
//    }

    /*public static HashSet<HashSet<String>> matchmaker(HashSet<String> yours, HashSet<String> mine) {
        // should return these sets:

        // Sebastian, Jamal
        // Jamal, Mala
        // Jamal, Eve

        // Sebastian, Yelena
        // Yelena, Mala
        // Yelena, Eve

        // Sebastian, Eve
        // Mala, Eve
    }*/
}


