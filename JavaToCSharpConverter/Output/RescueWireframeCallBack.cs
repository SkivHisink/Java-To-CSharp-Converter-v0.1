using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueWireframeCallBack
{
  public static void LoadingWireframe(long modelIdentifier, long wireframeIdentifier)
  {
    System.out.println("Wireframe being loaded "+modelIdentifier+","+wireframeIdentifier);
  }

  public static void UnloadingWireframe(long modelIdentifier, long wireframeIdentifier)
  {
    System.out.println("Wireframe being unloaded "+modelIdentifier+","+wireframeIdentifier);
  }
}

}