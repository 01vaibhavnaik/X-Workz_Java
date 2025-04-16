package com.xworkz.isarelation.Casting;
import com.xworkz.isarelation.Internal.Port;
import com.xworkz.isarelation.Internal.USBCable;

public class Battery {
    public void percentage(Port port){
        port.connect();
        port.supplyPower();
        port.type();
        port.transferData();

        if (port instanceof USBCable){
           USBCable usbCable=(USBCable) port;
           usbCable.charge();
        }
    }
}
