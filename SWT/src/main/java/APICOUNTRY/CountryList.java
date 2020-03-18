package APICOUNTRY;

import java.util.ArrayList;

public class CountryList
{
    public ArrayList<Country> countryList = new ArrayList<>();

    public CountryList()
    {
        countryList.add(new Country("India",1368737513,30));
        countryList.add(new Country("DR Congo",86727573,27));
        countryList.add(new Country("Turkey",82961805,32));
        countryList.add(new Country("Iran",82820766,32));
        countryList.add(new Country("Germany",82438639,17));
        countryList.add(new Country("Thailand",69306160,30));
        countryList.add(new Country("U.K.",66959016,21));
        countryList.add(new Country("France",65480710,22));
        countryList.add(new Country("U.S.",329093110,28));
        countryList.add(new Country("Indonesia",269536482,31));
        countryList.add(new Country("Brazil",212392717,33));
        countryList.add(new Country("Pakistan",204596442,33));
        countryList.add(new Country("Nigeria",200962417,38));
        countryList.add(new Country("China",1420062022,25));
        countryList.add(new Country("Tanzania",60913557,38));
        countryList.add(new Country("Italy",59216525,18));
        countryList.add(new Country("South Africa",58065097,27));
        countryList.add(new Country("Myanmar",54336138,29));
        countryList.add(new Country("Kenya",52214791,30));
        countryList.add(new Country("South Korea",51339238,23));
        countryList.add(new Country("Colombia",49849818,32));
        countryList.add(new Country("Spain",46441049,26));
        countryList.add(new Country("Uganda",45711874,26));
        countryList.add(new Country("Argentina",45101781,32));
        countryList.add(new Country("Bangladesh",168065920,27));
        countryList.add(new Country("Russia",143895551,10));
        countryList.add(new Country("Mexico",132328035,29));
        countryList.add(new Country("Japan",126854745,28));
        countryList.add(new Country("Ethiopia",110135635,30));
        countryList.add(new Country("Philippines",108106310,25));
        countryList.add(new Country("Egypt",101168745,35));
        countryList.add(new Country("Viet Nam",97429061,33));
    }

   public Country findCountry(CheckCountry tester)
    {
        for (Country e : countryList)
        {
            if (tester.test(e))
            {
                return e;
            }
        }
        return null;
    }

    public ArrayList<Country> findCountries(CheckCountry tester)
    {
        ArrayList<Country> tempEmpList = new ArrayList<>();

        for (Country e: countryList)
        {
            if (tester.test(e))
            {
                tempEmpList.add(e);
            }
        }

        return tempEmpList;
    }
}
