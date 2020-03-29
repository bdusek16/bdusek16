/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrailstoryboard;

/**
 * Things that can happen on the Oregon Trail Lite
 * @author class50040
 * @since 3/28/2020
 * @version 1.0
 */

public class OregonTrailStoryBoard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int chance = (int)(Math.random() * 10);
        final int DIFFERENT = 5;
        boolean[] happened = new boolean[DIFFERENT];
        for(int i = 0; i < DIFFERENT; i++){
            happened[i] = false;
        }
        switch(chance){
            case 0:
                //The player encounters a river
                if(!happened[chance]){
                    happened[chance] = true;
                    //prompt user to ford river, go to a different part, or pay for transport
                    //if fording, set weight for safety increment
                    //if paying check money, if not enough money then reshow options
                    //if moving, reset safe weight increment
                }
                break;
            case 1:
                //a robber steals X amount of food
                if(!happened[chance]){
                    happened[chance] = true;
                    //tell user X amount of food has been lost
                    int lost = (int)(Math.random() * 100);
                }
                break;
            case 2:
                //The player has a chance to become sick
                if(!happened[chance]){
                    happened[chance] = true;
                    //check if user has medicine
                    //if they do, use it
                    //if they don't some kind of debuff
                }
                break;
            case 3:
                //The player has a successful hunt
                if(!happened[chance]){
                    happened[chance] = true;
                    //increase the player's amount of food
                    int gained = (int)(Math.random() * 100);
                    //make sure player's weight is not over wieght limit, if it is, add less food
                }
                break;
            case 4:
                //The player encounters a trader
                if(!happened[chance]){
                    happened[chance] = true;
                    //generate random item for trader to have and want, then prompt player
                    final int DIFITEMS = 8;
                    int have = (int)(Math.random() * DIFITEMS) + 1;
                    int want = (int)(Math.random() * DIFITEMS) + 1;
                    //ask player if they would like to trade
                    //if yes then check inventory to make sure they have correct amount
                        //appropiate amounts of each item will be decided per item
                        //add and subtract appropriate items
                }
                break;
            default:
                //Nothing happens, but for posterity or whatever
                break;
        }
    }
    
}
