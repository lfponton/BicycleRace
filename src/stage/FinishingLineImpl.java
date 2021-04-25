package stage;

import riders.Rider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FinishingLineImpl implements FinishingLine
{
  private List<Rider> ranking = Collections.synchronizedList(new ArrayList<Rider>());
  @Override public void arrival(Rider rider)
  {
    // TODO auto-generated method stub
    ranking.add(rider);
  }

  @Override public String toString()
  {
    String str = "";
    for(Rider r : ranking)
    {
      int position = ranking.indexOf(r) + 1;
      str += r.getName() + " came in " + position + "\n";
    }
    return str;
  }
}
