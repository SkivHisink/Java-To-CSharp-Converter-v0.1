package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueBlockUnitSide.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueBlockUnitSide extends RescueHistoryObject
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

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType5(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native long Create_RescueBlockUnitSide0(long existingSection);
  private native void Delete_RescueBlockUnitSide(long ndx);
  private native long Section2(long refNdx);
  private native long EdgesObj3(long refNdx);
  private native long Edges4(long refNdx);
  private native boolean IsOfType5(long refNdx
                                  ,int thisType);
}
