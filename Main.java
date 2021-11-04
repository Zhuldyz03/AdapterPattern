package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Let's Charge our mobiles one-by-one");
        HuaweiPSmart huaweiPSmart = new HuaweiPSmart();
        HuaweiP40 huaweiP40 = new HuaweiP40();
        SamsungSM samsungSM = new SamsungSM();

        SamsungAdapterPlug samsungAdapterPlug = new SamsungAdapterPlug(samsungSM);

        huaweiPSmart.charge();
        huaweiP40.charge();
        samsungAdapterPlug.charge();
    }
}
