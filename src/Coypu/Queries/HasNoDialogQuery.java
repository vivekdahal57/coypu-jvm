package Coypu.Queries;

import Coypu.Driver;
import Coypu.DriverScope;
import Coypu.Options;

public class HasNoDialogQuery extends DriverScopeQuery<Boolean>
{
    private final Driver driver;
    private final String text;
    public Object ExpectedResult()
    {
        return true;
    }

    public HasNoDialogQuery(Driver driver, String text, DriverScope driverScope, Options options)
    {
        super(driverScope,options);

        this.driver = driver;
        this.text = text;
    }

    public void Run()
    {
        SetResult(!driver.HasDialog(text, DriverScope()));
    }
}