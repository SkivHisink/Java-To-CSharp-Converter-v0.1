using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueWireframeOwner : RescueHistoryObject
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

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType2(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}