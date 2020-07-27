package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueWireframeOwner.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueWireframeOwner extends RescueHistoryObject
{


  protected RescueWireframeOwner(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  protected RescueWireframeOwner()
  {
  }

  public RescueModel ParentModel()
  {
    long returnNdx = ParentModel0(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueModel myReturn = new RescueModel(returnNdx);
      return myReturn;
    }
  }

  public RescueWireframe Wireframe()
  {
    long returnNdx = Wireframe1(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWireframe myReturn = new RescueWireframe(returnNdx);
      return myReturn;
    }
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType2(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native long ParentModel0(long refNdx);
  private native long Wireframe1(long refNdx);
  private native boolean IsOfType2(long refNdx
                                  ,int thisType);
}
