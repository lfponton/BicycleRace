package riders;

import bicycles.Bicycle;
import stage.FinishingLine;

import java.util.Random;

public class Rider implements Runnable
{
  private String firstName;
  private String middleName;
  private String lastName;
  private Bicycle bicycle;
  private int distance;
  private FinishingLine finishingLine;

  public Rider(String firstName, String middleName, String lastName,
      Bicycle bicycle, FinishingLine finishingLine)
  {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.bicycle = bicycle;
    this.finishingLine = finishingLine;
  }

  public String getName()
  {
    return firstName + " " + lastName;
  }
  @Override public void run()
  {
    Random rand = new Random();

    int n = rand.nextInt(10);

    /*
     create and increment a timeElapsed instance variable?
     preferably an AtomicInteger
     then calculate ranking after the race, e.g. sort by elapsed time
     */

    while(distance < 100)
    {
      try {
        Thread.sleep(n);
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
        break;
      }
      distance += 1;
    }
    finishingLine.arrival(this);
  }
}
