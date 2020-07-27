using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescuePolyLineStub : RescueWireframeStub
{


  protected RescuePolyLineStub(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescuePolyLineStub(nativeNdx);
  }

  public bool Equals(RescuePolyLineStub other)
  {
    bool myReturn = Equals1(nativeNdx
                                 ,(other == null) ? 0 : other.nativeNdx);
    return myReturn;
  }

  public bool Equals(RescuePolyLine other)
  {
    bool myReturn = Equals2(nativeNdx
                                 ,(other == null) ? 0 : other.nativeNdx);
    return myReturn;
  }

  public RescuePolyLine PolyLine(RescueModel model,
                                   bool loadIfNeeded)
  {
    long returnNdx = PolyLine3(nativeNdx
                               ,(model == null) ? 0 : model.nativeNdx
                               ,loadIfNeeded);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePolyLine myReturn = new RescuePolyLine(returnNdx);
      return myReturn;
    }
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType4(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}