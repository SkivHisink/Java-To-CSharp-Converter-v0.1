package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueVertex.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueVertex extends RescueObject
{


  protected RescueVertex(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueVertex(java.lang.String name,
                      RescueCoordinateSystem existingCoordinateSystem,
                      double xIn,
                      double yIn,
                      double zIn)
  {
    nativeNdx = Create_RescueVertex0(name,
                                     (existingCoordinateSystem == null) ? 0 : existingCoordinateSystem.nativeNdx,
                                     xIn,
                                     yIn,
                                     zIn);
  }

  public int Dimensions()
  {
    int myReturn = Dimensions1(nativeNdx);
    return myReturn;
  }

  public java.lang.String VertexName()
  {
    java.lang.String myReturn = VertexName2(nativeNdx);
    return myReturn;
  }

  public void SetVertexName(java.lang.String newName)
  {
    SetVertexName3(nativeNdx
                  ,newName);
  }

  public RescueCoordinateSystem CoordinateSystem()
  {
    long returnNdx = CoordinateSystem4(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueCoordinateSystem myReturn = new RescueCoordinateSystem(returnNdx);
      return myReturn;
    }
  }

  public void SetXYZ(float xIn,
                     float yIn,
                     float zIn)
  {
    SetXYZ5(nativeNdx
           ,xIn
           ,yIn
           ,zIn);
  }

  public double X()
  {
    double myReturn = X6(nativeNdx);
    return myReturn;
  }

  public double Y()
  {
    double myReturn = Y7(nativeNdx);
    return myReturn;
  }

  public double Z()
  {
    double myReturn = Z8(nativeNdx);
    return myReturn;
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType9(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public void dispose()
  {
    Delete_RescueVertex(nativeNdx);
  }

  private native long Create_RescueVertex0(java.lang.String name,
                                          long existingCoordinateSystem,
                                          double xIn,
                                          double yIn,
                                          double zIn);
  private native int Dimensions1(long refNdx);
  private native java.lang.String VertexName2(long refNdx);
  private native void SetVertexName3(long refNdx
                                    ,java.lang.String newName);
  private native long CoordinateSystem4(long refNdx);
  private native void SetXYZ5(long refNdx
                             ,float xIn
                             ,float yIn
                             ,float zIn);
  private native double X6(long refNdx);
  private native double Y7(long refNdx);
  private native double Z8(long refNdx);
  private native boolean IsOfType9(long refNdx
                                  ,int thisType);
  private native void Delete_RescueVertex(long ndx);
}
