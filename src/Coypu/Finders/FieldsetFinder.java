package Coypu.Finders;
import Coypu.*;

public class FieldsetFinder extends ElementFinder
{
    public FieldsetFinder(Driver driver, String locator, DriverScope scope)
    {
        super(driver, locator, scope);
    }

    public ElementFound Find()  {
        return Driver.FindFieldset(Locator(), Scope);
    }
}
