public class celebrity_user extends USER{

    boolean do_we_actually_care;
    String appeals_to;

    celebrity_user(int age, String name, boolean popular, String audience){
        super(age, name);
        if(popular){
            this.ad_frequency = 0.3;
            this.appeals_to = audience;
        }else{
            this.ad_frequency = 0.7;
            this.appeals_to = null;
        }
    }



}
