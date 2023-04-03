public class USER {

    int age;
    String user_name;
    int message_count;

    double ad_frequency;


    USER( int age, String name ){

        if(age < 13){
            System.out.println("Invalid age. You cannot join the platform");
            return;
        }

        this.user_name = name;
        this.message_count = 0;

    }


}
