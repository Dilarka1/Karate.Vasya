import com.intuit.karate.junit5.Karate;

class BatchRunnerTest {
    
    // this will run all *.feature files that exist in sub-directories
    // see https://github.com/intuit/karate#naming-conventions   
    @Karate.Test
    Karate testUsers(){
    //Karate testAll() {
        return new Karate().tags("bookit").relativeTo(getClass());
        //return new Karate().relativeTo(getClass());
    }

}
