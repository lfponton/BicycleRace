import bicycles.Bicycle;
import riders.Rider;
import stage.FinishingLine;
import stage.FinishingLineImpl;
import stage.Stage;
import team.Team;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Race
{
  public static void main(String[] args) throws InterruptedException
  {
    ExecutorService executorService = Executors.newFixedThreadPool(2);
    FinishingLine finishingLine = new FinishingLineImpl();
    Bicycle bicycle1 = new Bicycle("Trek");
    Bicycle bicycle2 = new Bicycle("Peugeot");

    Team team1 = new Team("Astana");
    Team team2 = new Team("QuickStep");
    Rider rider1 = new Rider("Luis", null, "Fernandez", bicycle1, finishingLine);
    Rider rider2 = new Rider("Alberto", null, "Contador", bicycle2,finishingLine);
/*
    team1.addRider(rider1);
    team2.addRider(rider2);

    Stage stage = new Stage("Tourmalet", 1, 200, "Mountain");
    stage.addTeam(team2);
    stage.addTeam(team1);
    Thread t = new Thread(stage);
    Thread t1 = new Thread(rider1);
    Thread t2 = new Thread(rider2);
    t2.start();
    t1.start();


     */

    executorService.execute(rider1);
    executorService.execute(rider2);

    executorService.shutdown();
    executorService.awaitTermination(1000, TimeUnit.MILLISECONDS);

    System.out.println(finishingLine);
  }
}
