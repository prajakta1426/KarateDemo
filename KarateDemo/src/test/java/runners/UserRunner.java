package runners;
import com.intuit.karate.junit5.Karate;

class UserRunner {

//    @Karate.Test
//    Karate runUsers(){
//        return Karate.run("classpath:features/users.feature");
//    }

//    @Karate.Test
//    Karate runCSVUsers(){
//        return Karate.run("classpath:features/userCSVData.feature");
//    }
//
//    @Karate.Test
//    Karate runJsonUsers(){
//        return Karate.run("classpath:features/userJsonData.feature");
//    }

    @Karate.Test
    Karate runAllWithFolderName(){
       return Karate.run("classpath:features");
   }
    @Karate.Test
    Karate runWithTags(){
        return Karate.run("classpath:features").tags("@smoke");
    }
    @Karate.Test
    Karate runAllWithClassName(){
        return Karate.run("classpath:features/users.feature",
                "classpath:features/userCSVData.feature",
                "classpath:features/userJsonData.feature"
                );
    }

}
