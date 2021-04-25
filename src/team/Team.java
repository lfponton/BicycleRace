package team;

import riders.Rider;

import java.util.ArrayList;
import java.util.List;

public class Team
{
  private String name;
  private List<Rider> riders;

  public Team(String name)
  {
    this.name = name;
    this.riders = new ArrayList<>();
  }

  public String getName()
  {
    return name;
  }

  public List<Rider> getRiders()
  {
    return riders;
  }

  public void addRider(Rider rider)
  {
    riders.add(rider);
  }

  public void removeRider(Rider rider)
  {
    riders.remove(rider);
  }
}
