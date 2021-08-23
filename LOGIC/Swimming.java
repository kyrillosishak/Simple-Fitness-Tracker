/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGIC;

/**
 *
 * @author kerog
 */
public class Swimming extends Activity{
    private final float heartBeatIncrese = (float) 0.002;
    private final float CaloriesBurnt = 4;
    
    public void  update(){
        super.update(heartBeatIncrese, CaloriesBurnt);
    }
    public float calculateHeartBeat() {
       return super.calculateHeartBeat(heartBeatIncrese);
    }

    public float calculateCalories() {
        return super.calculateCalories(CaloriesBurnt);
    }
}
