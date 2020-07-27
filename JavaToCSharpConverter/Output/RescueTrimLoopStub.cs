using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueTrimLoopStub : RescueWireframeStub
{


  protected RescueTrimLoopStub(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueTrimLoopStub(nativeNdx);
  }

  public bool Equals(RescueTrimLoopStub other)
  {
    bool myReturn = Equals1(nativeNdx
                                 ,(other == null) ? 0 : other.nativeNdx);
    return myReturn;
  }

  public bool Equals(RescueTrimLoop other)
  {
    bool myReturn = Equals2(nativeNdx
                                 ,(other == null) ? 0 : other.nativeNdx);
    return myReturn;
  }

  public RescueTrimLoop TrimLoop(RescueModel model,
                                   bool loadIfNeeded)
  {
    long returnNdx = TrimLoop3(nativeNdx
                               ,(model == null) ? 0 : model.nativeNdx
                               ,loadIfNeeded);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTrimLoop myReturn = new RescueTrimLoop(returnNdx);
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