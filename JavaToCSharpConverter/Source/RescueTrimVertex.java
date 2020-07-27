package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueTrimVertex.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueTrimVertex extends RescuePolyLineNode
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

  public boolean Equals(RescueTrimVertexStub other)
  {
    boolean myReturn = Equals5(nativeNdx
                                 ,(other == null) ? 0 : other.nativeNdx);
    return myReturn;
  }

  public boolean Equals(RescueTrimVertex other)
  {
    boolean myReturn = Equals6(nativeNdx
                                 ,(other == null) ? 0 : other.nativeNdx);
    return myReturn;
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType7(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native long Create_RescueTrimVertex0(long ownerIn,
                                              double x,
                                              double y,
                                              double z);
  private native long Create_RescueTrimVertex1(long ownerIn,
                                              float x,
                                              float y,
                                              float z);
  private native void Delete_RescueTrimVertex(long ndx);
  private native long NthPolyLine3(long refNdx
                                   ,long zeroBasedOrdinal);
  private native long Owner4(long refNdx);
  private native boolean Equals5(long refNdx
                                ,long other);
  private native boolean Equals6(long refNdx
                                ,long other);
  private native boolean IsOfType7(long refNdx
                                  ,int thisType);
}
