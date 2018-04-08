package Helper;

/**
 * created by xdCao on 2018/4/8
 */

public class PowerHelper {

    public static double IntelCpuPower(double cpuPercent){
        if (cpuPercent<0)
            throw new RuntimeException("CPU百分比不能小于0！");
        if (cpuPercent>1)
            throw new RuntimeException("CPU百分比不能大于1！");
        if (cpuPercent<=0.17){
            return 160+7.06*cpuPercent*100;
        }else {
            return 280.02+1.2*(cpuPercent-0.17)*100;
        }
    }

}
