package Strategies;

import Entity.PM;
import Entity.VM;

import java.util.ArrayList;

/**
 * created by xdCao on 2018/4/8
 */

public class Manager {

    private static Manager manager=new Manager();

    private static ArrayList<PM> pms=new ArrayList<PM>();

    private static ArrayList<VM> vms=new ArrayList<VM>();

    private Manager() {
    }

    public static Manager getInstance(){
        return manager;
    }

    public static int pmSize(){
        return pms.size();
    }

    public static int vmSize(){
        return vms.size();
    }

    public static void addPM(PM pm){
        pms.add(pm);
    }

    public static void addVM(VM vm){
        vms.add(vm);
    }

    public static ArrayList<PM> getPms() {
        return pms;
    }

    public static ArrayList<VM> getVms() {
        return vms;
    }

    public static void initPMS(int pmSize){
        for (int i = 1; i <= pmSize ; i++) {
            PM pm=new PM(i,100,100);
            pms.add(pm);
        }
    }

}
