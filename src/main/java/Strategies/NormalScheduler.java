package Strategies;
import Entity.PM;
import Entity.VM;
import Entity.VNRequest;


import java.util.Random;

/**
 * created by xdCao on 2018/4/8
 */

public class NormalScheduler implements Scheduler{


    public void schedule(VNRequest request){
        VM vm=new VM(request);
        if (Manager.pmSize()==0){
            throw new RuntimeException("底层网络未正确初始化");
        }else {
            for (PM pm: Manager.getPms()){
                if (pm.addVM(vm)){
                    Manager.addVM(vm);
                    System.out.println("成功添加：VM#"+vm.getVmId());
                    break;
                }
            }
        }
    }







}
