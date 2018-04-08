import Entity.PM;
import Strategies.Manager;

/**
 * created by xdCao on 2018/4/8
 */

public class EnergyEstimator {

    public static double calTotalPower(){
        double power=0;
        for (PM pm: Manager.getPms()){
            power+=pm.getPower();
        }
        return power;
    }

}
