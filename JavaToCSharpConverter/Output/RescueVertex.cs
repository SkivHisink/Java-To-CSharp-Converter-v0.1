using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueVertex : RescueObject
{


  protected RescueVertex(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueVertex(string name,
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

  public string VertexName()
  {
    string myReturn = VertexName2(nativeNdx);
    return myReturn;
  }

  public void SetVertexName(string newName)
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

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType9(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public void dispose()
  {
    Delete_RescueVertex(nativeNdx);
  }

}

}