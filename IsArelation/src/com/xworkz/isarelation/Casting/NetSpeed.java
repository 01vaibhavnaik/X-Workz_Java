package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Browser;
import com.xworkz.isarelation.Internal.Chrome;

public class NetSpeed {
    public void frequency(Browser browser){
        browser.open();
        browser.extensions();
        browser.incognitoMode();
        browser.close();

        if(browser instanceof Chrome){
            Chrome chrome=(Chrome) browser;
            chrome.netSpeed();
        }
    }
}
