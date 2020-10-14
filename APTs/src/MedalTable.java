import java.util.*;

public class MedalTable{
    public String[] generate(String[] results) {
        HashMap<String, Country> table = new HashMap<String, Country>();
        for(String result : results){
            String[] countries = result.split(" ");
            for(String cname : countries){
                if(table.containsKey(cname)){;}
                else{
                    Country c = new Country(cname, 0,0,0);
                    table.put(cname, c);
                }
            }

            (table.get(countries[0])).myGold += 1;
            (table.get(countries[1])).mySilver += 1;
            (table.get(countries[2])).myBronze += 1;
        }

        List<Country> countryList = new ArrayList<Country>(table.values());
        Collections.sort(countryList);

        String[] output = new String[countryList.size()];

        for(int i=0; i<countryList.size(); i++){
            output[i] = (countryList.get(i)).toString();
        }
        return output;
    }

    public class Country implements Comparable<Country>{
        String myName;
        int myGold;
        int mySilver;
        int myBronze;

        public Country(String n, int g, int s, int b){
            myName = n;
            myGold = g;
            mySilver = s;
            myBronze = b;
        }

        public String toString()
        {
            return myName + " " + myGold + " " + mySilver + " " + myBronze;
        }

        public int compareTo(Country arg0) {
            int gold = this.myGold - arg0.myGold;
            if (gold==0){
                int silver = this.mySilver - arg0.mySilver;
                if(silver==0){
                    int bronze = this.myBronze - arg0.myBronze;
                    if(bronze==0){
                        return (this.myName).compareTo(arg0.myName);
                    }
                    else{return -bronze;}
                }
                else{
                    return -silver;
                }
            }
            else{
                return -gold;
            }
        }
    }

}