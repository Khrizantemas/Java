public class Wether {
    private String city;
    private float   windspeed;
    private  float willrain;
    private boolean israin;
    private boolean iscloudy;
    private boolean issuny;

    public Wether(String city,float windspeed,float willrain,boolean israin,boolean iscloudy,boolean issuny){
        this.city = city;
        this.windspeed = windspeed;
        this.willrain= willrain;
        this.israin = israin;
        this.iscloudy = iscloudy;
        this.issuny = issuny;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
            this.city = city;
    }

    public float getWindspeed(){
        return windspeed;
    }

    public void setWindspeed(float windspeed){
        this.windspeed = windspeed;
    }

    public float getWillrain(){
        return willrain;
    }

    public void setWillrain(float willrain){
        this.willrain = willrain;
    }

    public boolean getisrain(){
        return israin;
    }

    public void setIsrain(boolean israin){
        this.israin = israin;
    }

    public boolean getiscloudy(){
        return iscloudy;
    }

    public void setIscloudy(boolean iscloudy){
        this.iscloudy=iscloudy;
    }

    public boolean getissuny(){
        return issuny;
    }

    public void setIssuny(boolean issuny){
        this.issuny = issuny;
    }

    public void wetherinfo(){
        System.out.println("city : " + city);
        System.out.println("wind speed: " + windspeed + " m/s");
        System.out.println("will rain? : " + willrain + " %");
        System.out.println("is raining : " + israin);
        System.out.println("is cloudy : " + iscloudy);
        System.out.println("is sunny : " + issuny);
    }

    public void shouldGo() {
        if (willrain < 30 && !israin && issuny && windspeed < 15) {
            System.out.println("Enjoy walking ;)");
        } else {
            System.out.println("You're done, lil bro :p");
        }
    }


}
