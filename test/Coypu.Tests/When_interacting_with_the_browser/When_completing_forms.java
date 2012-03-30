//package Coypu.Tests.When_interacting_with_the_browser;
//
//import Coypu.ElementFound;
//import Coypu.Tests.TestDoubles.StubElement;
//import org.hamcrest.BaseMatcher;
//import org.hamcrest.Description;
//import org.hamcrest.core.Is;
//import org.junit.Test;
//
//import java.util.Arrays;
//import java.util.Enumeration;
//
//import static org.hamcrest.core.Is.is;
//import static org.junit.Assert.assertThat;
//
//public class When_completing_forms extends BrowserInteractionTests
//{
//
//
//    @Test
//    public void When_filling_in_a_text_field_It_finds_field_and_sets_value_robustly()
//    {
//        ElementFound element = new StubElement();
//        driver.StubField("Some field locator", element, browserSession);
//
//        browserSession.FillIn("Some field locator").With("some value for the field");
//
//        assertThat(Arrays.asList(driver.SetFields.elements()).contains(element), is(true));
//
//        RunQueryAndCheckTiming();
//
//        assertThat(driver.SetFields.Keys(), Has.Member(element));
//        assertThat(driver.SetFields[element], Is.EqualTo("some value for the field"));
//    }
//
//    @Test
//    public void When_filling_in_a_field_It_clicks_to_ensure_focus()
//    {
//        var element = new StubElement();
//        driver.StubField("Some field locator", element, browserSession);
//
//        browserSession.FillIn("Some field locator").With("some value for the field");
//
//        assertThat(driver.ClickedElements,Is.Empty);
//
//        RunQueryAndCheckTiming();
//
//        assertThat(driver.ClickedElements, Has.Member(element));
//    }
//
//    @Test
//    public void When_filling_in_file_field_It_doesnt_click() {
//        var element = new StubElement();
//        element.StubAttribute("type", "file");
//        driver.StubField("Some field locator", element, browserSession);
//
//        browserSession.FillIn("Some field locator").With("some value for the field");
//
//        RunQueryAndCheckTiming();
//
//        assertThat(driver.ClickedElements, Has.No.Member(element));
//    }
//
//    @Test
//    public void When_filling_in_an_field_already_found_It_sets_value_robustly()
//    {
//        var element = new StubElement();
//
//        browserSession.FillIn(element).With("some value for the field");
//
//        assertThat(driver.SetFields, Has.No.Member(element));
//
//        RunQueryAndCheckTiming();
//
//        assertThat(driver.SetFields.Keys, Has.Member(element));
//        assertThat(driver.SetFields[element], Is.EqualTo("some value for the field"));
//    }
//
//    @Test
//    public void When_selecting_an_option_It_finds_field_and_selects_option_robustly()
//    {
//        var element = new StubElement();
//        driver.StubField("Some select field locator", element, browserSession);
//
//        browserSession.Select("some option to select").From("Some select field locator");
//
//        assertThat(driver.SelectedOptions, Has.No.Member(element));
//
//        RunQueryAndCheckTiming();
//
//        assertThat(driver.SelectedOptions.Keys, Has.Member(element));
//        assertThat(driver.SelectedOptions[element], Is.EqualTo("some option to select"));
//    }
//
//    @Test
//    public void When_checking_a_checkbox_It_find_fields_and_checks_robustly()
//    {
//        var element = new StubElement();
//        driver.StubField("Some checkbox locator", element, browserSession);
//
//        browserSession.Check("Some checkbox locator");
//
//        assertThat(driver.CheckedElements, Has.No.Member(element));
//
//        RunQueryAndCheckTiming();
//
//        assertThat(driver.CheckedElements, Has.Member(element));
//    }
//
//    @Test
//    public void When_unchecking_a_checkbox_It_finds_field_and_unchecks_robustly()
//    {
//        var element = new StubElement();
//        driver.StubField("Some checkbox locator", element, browserSession);
//
//        browserSession.Uncheck("Some checkbox locator");
//
//        assertThat(driver.UncheckedElements, Has.No.Member(element));
//
//        RunQueryAndCheckTiming();
//
//        assertThat(driver.UncheckedElements, Has.Member(element));
//    }
//
//    @Test
//    public void When_choosing_a_radio_button_It_finds_field_and_chooses_robustly()
//    {
//        var element = new StubElement();
//        driver.StubField("Some radio locator", element, browserSession);
//
//        browserSession.Choose("Some radio locator");
//
//        assertThat(driver.ChosenElements, Has.No.Member(element));
//
//        RunQueryAndCheckTiming();
//
//        assertThat(driver.ChosenElements, Has.Member(element));
//    }
//
//}