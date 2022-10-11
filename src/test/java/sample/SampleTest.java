package sample;

import com.intuit.karate.junit5.Karate;

public class SampleTest {

    @Karate.Test
    Karate sampleTest(){
        return Karate.run("classpath:sample/sample.feature");
    }
}
