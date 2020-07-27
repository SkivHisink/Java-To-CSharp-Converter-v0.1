using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueTrimVertexStub : RescueWireframeStub
{


  protected RescueTrimVertexStub(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueTrimVertexStub(nativeNdx);
  }

  public bool Equals(RescueTrimVertexStub other)
  {
    bool myReturn = Equals1(nativeNdx
                                 ,(other == null) ? 0 : other.nativeNdx);
    return myReturn;
  }

  public bool Equals(RescueTrimVertex other)
  {
    bool myReturn = Equals2(nativeNdx
                                 ,(other == null) ? 0 : other.nativeNdx);
    return myReturn;
  }

  public RescueTrimVertex TrimVertex(RescueModel model,
                                       bool loadIfNeeded)
  {
    long returnNdx = TrimVertex3(nativeNdx
                                 ,(model == null) ? 0 : model.nativeNdx
                                 ,loadIfNeeded);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTrimVertex myReturn = new RescueTrimVertex(returnNdx);
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