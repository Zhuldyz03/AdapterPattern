package com.company;

public class SamsungAdapterPlug implements Chargeable {
    SamsungSM samsungSM;

    public SamsungAdapterPlug(SamsungSM samsungS3) {
        this.samsungSM = samsungS3;
    }
    @Override
    public void charge() {

        samsungSM.samsungCharge();

    }

    public String toString() {
        return "Samsung Mobile pretending to be Huawei Mobile";
    }
}
