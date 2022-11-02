import java.util.ArrayList;
import java.util.Random;

public class Sessions {
    public String [] themes;
    public String weeklyTheme;
    public ArrayList<Cabin> cabins;
    public ArrayList<Sessions> sessions;
    Random ranNum = new Random();
    Cabin cabin = new Cabin();

    public Sessions(String weeklyTheme, ArrayList<Cabin> cabins){
        this.weeklyTheme = weeklyTheme;
        cabins = new ArrayList();
        weeklyTheme = new String();
    }

    public Sessions(){}
    
    public void addThemes() {
        themes[0] = "splash week";
        themes[1] = "lost in space";
        themes[2] = "under the sea";
        themes[3] = "enchanted forest";
        themes[4] = "pirates";
        themes[5] = "safari season";
        themes[6] = "superheros";
        themes[7] = "dinosaur week";
        themes[8] = "treasure hunt";
        themes[9] = "shark week";

    }

    public ArrayList<Sessions> createSessions(){
        for (int x = 0; x < 10; x++){
            Sessions session = new Sessions(themes[x], cabin.getCabins());
            sessions.add(session);
        }
        return sessions;
    }

}
