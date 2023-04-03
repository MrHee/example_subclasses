public class free_user extends USER{

    int messages_per_day_limit;
    double nag_to_upgrade_frequency;

    free_user(int age, String name){
        super(age, name);
        messages_per_day_limit = 4;
        ad_frequency = 0.6;
        nag_to_upgrade_frequency = 0.4;

    }



}
