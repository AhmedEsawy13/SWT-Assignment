
package APICOUNTRY;

import java.util.ArrayList;



public class APITESTING {
	public ArrayList<Country> countryList = new ArrayList<>();
        
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

