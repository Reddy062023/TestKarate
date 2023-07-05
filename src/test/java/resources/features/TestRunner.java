package resources.features;
import com.intuit.karate.junit5.Karate;
public class TestRunner {
    //@Karate.Test
    //Karate testUsers(){
    //    return Karate.run("src/test/java/APTCalls.feature").relativeTo(getClass());
    // }
    @Karate.Test
    Karate testSample() {
        return Karate.run("APTCalls").relativeTo(getClass());
    }
}