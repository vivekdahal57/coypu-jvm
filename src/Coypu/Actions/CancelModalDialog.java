package Coypu.Actions;

import Coypu.DriverScope;
import Coypu.Options;
import Coypu.Driver;

public class CancelModalDialog extends DriverAction
{
    private DriverScope driverScope;

    public CancelModalDialog(DriverScope driverScope, Driver driver, Options options)
    {
        super(driver, options);
        this.driverScope = driverScope;
    }

    public void Act()
    {
        Driver.CancelModalDialog(driverScope);
    }
}