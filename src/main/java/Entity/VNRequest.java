package Entity;

/**
 * created by xdCao on 2018/4/8
 */

public class VNRequest {

    private int reqId;
    private int cpu;
    private int bw;

    public VNRequest(int reqId,int cpu, int bw) {
        this.reqId=reqId;
        this.cpu = cpu;
        this.bw = bw;
    }

    public int getReqId() {
        return reqId;
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

    public void setBw(int bw) {
        this.bw = bw;
    }
}
