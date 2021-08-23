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
public abstract class Activity {
    public static float heartBeat = 80;
    public static float calories = 0;
    protected float time;
    
    public void setTime (float time){
         this.time = time;
    }
    public void update(float heartBeatIncrese,float CaloriesBurnt){
        
        calories = calories+CaloriesBurnt*(time);
        heartBeat = heartBeat+(heartBeat*time*heartBeatIncrese);
    }
    public float calculateHeartBeat(float heartBeatIncrese) {
        float rere =  (heartBeat*time*heartBeatIncrese);
        return rere;
    }

    public float calculateCalories(float CaloriesBurnt) {
        float rere = CaloriesBurnt*(time);
        return rere;
    }
}
