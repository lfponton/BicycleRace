package competition;

import stage.Stage;

import java.util.List;

public class Competition
{
  private String name;
  private List<Stage> stages;

  public Competition(String name, List<Stage> stages)
  {
    this.name = name;
    this.stages = stages;
  }
}
