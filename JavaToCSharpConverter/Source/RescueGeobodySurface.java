package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueGeobodySurface.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueGeobodySurface extends RescueObject
{

  public static final int TOP = 0;
  public static final int BOTTOM = 1;
  public static final int SIDE = 2;
  public static final int INTERIOR = 3;
  public static final int UNKNOWN = 4;

  protected RescueGeobodySurface(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueGeobodySurface(nativeNdx);
  }

  public RescueEdgeSetStub EdgesObj()
  {
    long returnNdx = EdgesObj1(nativeNdx);
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
    long returnNdx = Edges2(nativeNdx);
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

  public RescueSurface Surface()
  {
    long returnNdx = Surface3(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueSurface myReturn = new RescueSurface(returnNdx);
      int isA = myReturn.IsA();
      switch(isA)
      {
      case RescueObject.R_RescueReferenceSurface:
        myReturn = new RescueReferenceSurface(returnNdx);
        break;
      case RescueObject.R_RescueSection:
        myReturn = new RescueSection(returnNdx);
        break;
      }
      return myReturn;
    }
  }

  public int SurfaceRole()
  {
    int myReturn = SurfaceRole4(nativeNdx);
    return myReturn;
  }

  private native void Delete_RescueGeobodySurface(long ndx);
  private native long EdgesObj1(long refNdx);
  private native long Edges2(long refNdx);
  private native long Surface3(long refNdx);
  private native int SurfaceRole4(long refNdx);
}
