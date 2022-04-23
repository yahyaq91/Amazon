package Amazon;

import base.TestBasePage;
import org.bouncycastle.asn1.dvcs.DVCSObjectIdentifiers;
import org.testng.annotations.Test;

public class TestOptionsAutoPage extends TestBasePage {

    @Test
    public void testAddNewVehicleDropdownOption() {
        Homepage homepage = new Homepage();
        OptionsAutoPage automotivePage = homepage.navigateToOptionsAutoPage();
        automotivePage.automotiveListOption.click();
        automotivePage.searchSubmitButton.click();
        automotivePage.addNewVehicle.click();


    }

    @Test
    public void testExteriorCareCarWashEquipmentDropdownOption() {
        Homepage homepage = new Homepage();
        OptionsAutoPage automotivePage = homepage.navigateToOptionsAutoPage();
        automotivePage.automotiveListOption.click();
        automotivePage.searchSubmitButton.click();
        automotivePage.carCare.click();
        automotivePage.exteriorCareCarWashEquipment.click();

    }

    @Test
    public void testHyundaiVirtualShowroom() {
        Homepage homepage = new Homepage();
        OptionsAutoPage automotivePage = homepage.navigateToOptionsAutoPage();
        automotivePage.automotiveListOption.click();
        automotivePage.searchSubmitButton.click();
        automotivePage.hyundaiVirtualShowroom.click();
    }

    @Test
    public void testDealsAndRebates() {
        Homepage homepage = new Homepage();
        OptionsAutoPage automotivePage = homepage.navigateToOptionsAutoPage();
        automotivePage.automotiveListOption.click();
        automotivePage.searchSubmitButton.click();
        automotivePage.dealsAndRebates.click();

    }


    @Test
    public void testMotorcycleHelmets() {
    Homepage homepage = new Homepage();
    OptionsAutoPage automotivePage = homepage.navigateToOptionsAutoPage();
    automotivePage.automotiveListOption.click();
    automotivePage.searchSubmitButton.click();
    automotivePage.motorcycleAndPowersports.click();
    automotivePage.motorcycleHelmets.click();



    }
}

