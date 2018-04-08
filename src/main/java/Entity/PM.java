package Entity;

import Helper.PowerHelper;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.ArrayList;

/**
 * created by xdCao on 2018/4/8
 */

public class PM {

    private int pmId;
    private double cpu;
    private double cpuPercent;
    private double bw=0;
    private double bwPercent;
    private double cpuRemain;
    private double bwRemain;
    private double power=0.0;
    private ArrayList<VM> vmList=new ArrayList<VM>();

    public PM(int pmId, double cpu, double bw) {
        this.pmId = pmId;
        this.cpu = cpu;
        this.bw = bw;
        cpuRemain=cpu;
        bwRemain=bw;
        cpuPercent=(cpu-cpuRemain)/cpu;
        bwPercent=(bw-bwRemain)/bw;
    }

    public boolean addVM(VM vm){

        if (this.bwRemain>=vm.getBw()&&this.cpuRemain>=vm.getCpu()){
            this.bwRemain-=vm.getBw();
            this.cpuRemain-=vm.getCpu();
            this.cpuPercent=(cpu-cpuRemain)/cpu;
            this.bwPercent=(bw-bwRemain)/bw;
            this.vmList.add(vm);
            vm.setPm(this);
            /*计算power,暂时先只计算CPU的*/
            this.power= PowerHelper.IntelCpuPower(cpuPercent);
            return true;
        }else {
            return false;
        }

    }


    public int getPmId() {
        return pmId;
    }

    public void setPmId(int pmId) {
        this.pmId = pmId;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getCpuPercent() {
        return cpuPercent;
    }

    public void setCpuPercent(double cpuPercent) {
        this.cpuPercent = cpuPercent;
    }

    public double getBw() {
        return bw;
    }

    public void setBw(double bw) {
        this.bw = bw;
    }

    public double getBwPercent() {
        return bwPercent;
    }

    public void setBwPercent(double bwPercent) {
        this.bwPercent = bwPercent;
    }

    public double getCpuRemain() {
        return cpuRemain;
    }

    public void setCpuRemain(double cpuRemain) {
        this.cpuRemain = cpuRemain;
    }

    public double getBwRemain() {
        return bwRemain;
    }

    public void setBwRemain(double bwRemain) {
        this.bwRemain = bwRemain;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public ArrayList<VM> getVmList() {
        return vmList;
    }

    public void setVmList(ArrayList<VM> vmList) {
        this.vmList = vmList;
    }
}
