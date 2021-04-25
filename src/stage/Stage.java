package stage;

import riders.Rider;
import team.Team;

import java.util.ArrayList;
import java.util.List;

public class Stage implements Runnable
{
  private String name;
  private int number;
  private int length;
  private String type;
  private List<Team> teams;

  public Stage(String name, int number, int length, String type)
  {
    this.name = name;
    this.number = number;
    this.length = length;
    this.type = type;
    teams = new ArrayList<>();
  }

  public void addTeam(Team team)
  {
    teams.add(team);
  }

  @Override public void run()
  {
    int position = 0;
    for(Team tm : teams) {
      for(Rider r : tm.getRiders())
      {
        position++;
        Thread t = new Thread(r);
        t.start();
        System.out.println(r.getName() + " from team " + tm.getName() + " came in " + position);
      }
    }
  }
}
