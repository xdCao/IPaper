package Entity;

/**
 * created by xdCao on 2018/4/8
 */

public class VM {

    private int vmId;
    private int cpu;
    private int bw;
    private PM pm;

    public VM(VNRequest request) {
        this.vmId=request.getReqId();
        this.cpu=request.getCpu();
        this.bw=request.getBw();
    }

    public VM(int vmId, int cpu, int bw) {
        this.vmId = vmId;
        this.cpu = cpu;
        this.bw = bw;
    }

    public int getVmId() {
        return vmId;
    }

    public void setVmId(int vmId) {
        this.vmId = vmId;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getBw() {
        return bw;
    }

    public PM getPm() {
        return pm;
    }

    public void setPm(PM pm) {
        this.pm = pm;
    }

    public void setBw(int bw) {
        this.bw = bw;
    }
}
