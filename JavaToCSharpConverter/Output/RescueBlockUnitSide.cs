using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueBlockUnitSide : RescueHistoryObject
{


  protected RescueBlockUnitSide(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueBlockUnitSide(RescueSection existingSection)
  {
    nativeNdx = Create_RescueBlockUnitSide0((existingSection == null) ? 0 : existingSection.nativeNdx);
  }

  public void dispose()
  {
    Delete_RescueBlockUnitSide(nativeNdx);
  }

  public RescueSection Section()
  {
    long returnNdx = Section2(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueSection myReturn = new RescueSection(returnNdx);
      return myReturn;
    }
  }

  public RescueEdgeSetStub EdgesObj()
  {
    long returnNdx = EdgesObj3(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueEdgeSetStub myReturn = new RescueEdgeSetStub(returnNdx);
      return myReturn;
    }
  }

  public RescueEdgeSet Edges()
  {
    long returnNdx = Edges4(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueEdgeSet myReturn = new RescueEdgeSet(returnNdx);
      return myReturn;
    }
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType5(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}