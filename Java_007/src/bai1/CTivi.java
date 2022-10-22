package bai1;

public class CTivi {
    private String[] chanelList;
    private boolean isOn;
    private String currentChanel;


    public CTivi(){
        isOn = false;
        chanelList = new String[3];
        chanelList[0] = "VTV1";
        chanelList[1] = "VTV2";
        chanelList[2] = "VTV3";
        currentChanel = "VTV1";

    }
    public CTivi(String[] chanelList) {
        this.chanelList = chanelList;
        this.isOn = false;
        this.currentChanel = chanelList[0];
    }

    private String searchNextChanel(boolean isForward){
        int currentIndex = -1;
        for (int i = 0; i < chanelList.length; i++) {
            if(chanelList[i].equalsIgnoreCase(currentChanel)){
                currentIndex = i;
                break;
            }
        }
        if(isForward){
            currentIndex++;
            if(currentIndex >= chanelList.length){
                currentIndex = 0;
            }
        }else{
            currentIndex--;
            if(currentIndex <0 ){
                currentIndex = chanelList.length-1;
            }
        }
        currentChanel = chanelList[currentIndex];
        return currentChanel;
    }

    public void On(){
        isOn = true;
        System.out.println("---Tivi ON ---");
    }
    public void Off(){
        isOn = false;
        System.out.println("---TIvi OFF---");
    }
    public void Switch(){
        if(isOn){
            Off();
        }else{
            On();
        }
    }
    public void Switch(String chanel){
        Switch();
        if(isOn){
            boolean isFind = false;
            for (int i = 0; i <chanelList.length ; i++) {
                if(chanelList[i].equalsIgnoreCase(chanel)){
                    isFind = true;
                    break;
                }
            }
            if(isFind){
                currentChanel = chanel;
                System.out.println("Kenh hien tai da tim thay : "+chanel);
            }else{
                System.out.println("Khong tim thay kenh");
            }
        }
    }
    public void nextChanel(){
        if(isOn){
            searchNextChanel(true);
            System.out.println("Current Chanel: "+currentChanel);
        }
    }
    public void previous(){
        if(isOn){
            searchNextChanel(false);
            System.out.println("Current Chanel: "+currentChanel);        }
    }
    public void show(){
        if(isOn){
            System.out.println("---Tivi is On at chanel : %s ----"+currentChanel);
        }else{
            System.out.println("--Tivi now OFF----");
        }
    }
}
