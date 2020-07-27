using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueEdgeSetStub : RescueWireframeStub
{


  protected RescueEdgeSetStub(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueEdgeSetStub(nativeNdx);
  }

  public bool Equals(RescueEdgeSetStub other)
  {
    bool myReturn = Equals1(nativeNdx
                                 ,(other == null) ? 0 : other.nativeNdx);
    return myReturn;
  }

  public bool Equals(RescueEdgeSet other)
  {
    bool myReturn = Equals2(nativeNdx
                                 ,(other == null) ? 0 : other.nativeNdx);
    return myReturn;
  }

  public RescueEdgeSet EdgeSet(RescueModel model,
                                 bool loadIfNeeded)
  {
    long returnNdx = EdgeSet3(nativeNdx
                              ,(model == null) ? 0 : model.nativeNdx
                              ,loadIfNeeded);
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
    bool myReturn = IsOfType4(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}