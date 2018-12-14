package Question1;

public class Time {
    private int second = 0;
    private int minute =0;
    private int hour = 0;
    

    public Time()
    {

    }
    public Time(int second, int minute, int hour){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(){
        return hour;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public int getMinute(){
        return minute;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public int getSecond(){
        return second;
    }

    public void setSecond(int second){
        this.second = second;
    }

    public void setTime(int second, int minute, int hour){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Time{" +
                "second=" + second +
                ", minute=" + minute +
                ", hour=" + hour +
                '}';
    }

    public Time nextSecond ()
    {
    	Time t = new Time();
    	int sec = getSecond() + 1;
    	
        return t;
    }
}

