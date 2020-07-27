using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueTrimVertex : RescuePolyLineNode
{


  protected RescueTrimVertex(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueTrimVertex(RescueWireframeOwner ownerIn,
                          double x,
                          double y,
                          double z)
  {
    nativeNdx = Create_RescueTrimVertex0((ownerIn == null) ? 0 : ownerIn.nativeNdx,
                                         x,
                                         y,
                                         z);
  }

  public RescueTrimVertex(RescueWireframeOwner ownerIn,
                          float x,
                          float y,
                          float z)
  {
    nativeNdx = Create_RescueTrimVertex1((ownerIn == null) ? 0 : ownerIn.nativeNdx,
                                         x,
                                         y,
                                         z);
  }

  public void dispose()
  {
    Delete_RescueTrimVertex(nativeNdx);
  }

  public RescuePolyLineStub NthPolyLine(long zeroBasedOrdinal)
  {
    long returnNdx = NthPolyLine3(nativeNdx
                                  ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePolyLineStub myReturn = new RescuePolyLineStub(returnNdx);
      return myReturn;
    }
  }

  public RescueWireframe Owner()
  {
    long returnNdx = Owner4(nativeNdx);
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

  public bool Equals(RescueTrimVertexStub other)
  {
    bool myReturn = Equals5(nativeNdx
                                 ,(other == null) ? 0 : other.nativeNdx);
    return myReturn;
  }

  public bool Equals(RescueTrimVertex other)
  {
    bool myReturn = Equals6(nativeNdx
                                 ,(other == null) ? 0 : other.nativeNdx);
    return myReturn;
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType7(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}