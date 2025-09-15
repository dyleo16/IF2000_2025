package logic;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author dylan
 */

public class Binnacle {
    private static int idCounter = 1;
    private final ArrayList<Event> events;
    
    public Binnacle(){
           events = new ArrayList<>();
}

public class Event{
   private final int idEvent;
   private final String tipeEvent;
   private final LocalDate date;
   private final String infoAccount;
   
public Event(String tipeEvent, String infoAccount){
   this.idEvent = idCounter++;
   this.tipeEvent = tipeEvent;
   this.date = LocalDate.now();
   this.infoAccount = infoAccount;
}

@Override
public String toString(){
   return "ID: " + idEvent +
          ", Event: " + tipeEvent +
          ", Date: " + date + 
          ", Account: " + infoAccount;
}
}

public void registerEvent(String tipeEvent, Account account){
   events.add(new Event(tipeEvent, account.toString()));
}

public void showEvents(){
   for(Event e : events){
     System.out.println(e);
   }
}
}
