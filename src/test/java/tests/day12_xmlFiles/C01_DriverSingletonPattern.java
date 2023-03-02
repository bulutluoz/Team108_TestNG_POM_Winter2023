package tests.day12_xmlFiles;

import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverSingletonPattern {

    @Test
    public void test01(){

        /*
            POM webDriver olarak Driver class'indaki
            getDriver() method'unun kullanilmasi uzerine kurgulanmistir.

            Driver.getDriver();

            Driver class'inin obje olusturularak kullanilmasini engellemek icin
            POM tasarlayanlar bir onlem koymak istemisler

            Java'da bir class'dan obje olusturulmasini engellemek isterseniz
            SINGLETON PATTERN kullanabilirsiniz

            Singleton Pattern : Bir class'dan obje olusturulmasini engellemek / sinirlamak icin
                                kullanilan bir yontemdir.
                                Temal fikir obje olusturmak icin kullanilan default constructor
                                yerine gorunur parametresiz bir constructor olusturup
                                Bu constructor'in access modifier'ini private yapip, kullanilmasini
                                ENGELLEMEKTIR


         */

        // Driver objeDriver= new Driver();


    }
}
