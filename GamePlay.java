package GameGui;

public class GamePlay {
    static String[] pilKom = {"g","b","k"};
    private String you, com, hasil;
    private int skorYou, skorCom;

    public GamePlay(int skoryou, int skorcom) {
        this.skorCom = skorcom;
        this.skorYou = skoryou;
    }
    public String getHasil() {
        return hasil;
    }

    public int getSkorYou() {
        return skorYou;
    }

    public int getSkorCom() {
        return skorCom;
    }

    public void setYou(String you) {
        this.you = you;
    }
    
    void seleksiHasil(){
        //jika memilih gunting
        if ((this.you.equals("g")) && (this.com.equals("g"))) {
            this.hasil = "ITS DRAW";          
        }else if ((this.you.equals("g")) && (this.com.equals("b"))) {
            this.hasil = "YOU LOSE";
            skorCom++;
        }else if ((this.you.equals("g")) && (this.com.equals("k"))) {
            this.hasil = "YOU WIN";  
            skorYou++;
        }
        
        //jika kamu memilih batu
         if ((this.you.equals("b")) && (this.com.equals("b"))) {
            this.hasil = "ITS DRAW";          
        }else if ((this.you.equals("b")) && (this.com.equals("k"))) {
            this.hasil = "YOU LOSE";
            skorCom++;
        }else if ((this.you.equals("b")) && (this.com.equals("g"))) {
            this.hasil = "YOU WIN";  
            skorYou++;
        }
         
        //Jika kamu memilih kertas
         if ((this.you.equals("k")) && (this.com.equals("k"))) {
            this.hasil = "ITS DRAW";          
        }else if ((this.you.equals("k")) && (this.com.equals("g"))) {
            this.hasil = "YOU LOSE";
            skorCom++;
        }else if ((this.you.equals("k")) && (this.com.equals("b"))) {
            this.hasil = "YOU WIN";  
            skorYou++;
        }
    }
    
    public String getCom() {
        return com = pilKom[0];
    }
    void pindahPos(){
        pilKom[0] = pilKom[1];
        pilKom[1] = pilKom[2];
        pilKom[2] = this.you;
    }
    void totHasil(){
        if (this.skorYou > this.skorCom) {
            this.hasil = "YOU WINNER!";
        }else if (this.skorYou < this.skorCom) {
            this.hasil = "YOU LOSER!";
        }else {
            this.hasil = "IT'S DRAW";
        }
    }
    
        
}
