import Entity.VNRequest;
import Strategies.Manager;
import Strategies.NormalScheduler;

import java.util.Random;

/**
 * created by xdCao on 2018/4/8
 */

public class Main {

    public static void main(String[] args) {
        Manager.initPMS(100);
        for (int i = 1; i <= 100; i++) {
            Random random=new Random();
            int nextInt = random.nextInt(100);
            VNRequest request=new VNRequest(i, nextInt,0);
            NormalScheduler normalScheduler =new NormalScheduler();
            normalScheduler.schedule(request);
        }
        System.out.println(EnergyEstimator.calTotalPower());

    }

}
