package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescuePolyLine.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescuePolyLine extends RescueObject
{


  protected RescuePolyLine(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescuePolyLine(nativeNdx);
  }

  public RescuePolyLine(RescueWireframeOwner ownerIn,
                        RescueTrimVertex leftVertexIn,
                        RescueTrimVertex rightVertexIn)
  {
    nativeNdx = Create_RescuePolyLine1((ownerIn == null) ? 0 : ownerIn.nativeNdx,
                                       (leftVertexIn == null) ? 0 : leftVertexIn.nativeNdx,
                                       (rightVertexIn == null) ? 0 : rightVertexIn.nativeNdx);
  }

  public boolean Equals(RescuePolyLineStub other)
  {
    boolean myReturn = Equals2(nativeNdx
                                 ,(other == null) ? 0 : other.nativeNdx);
    return myReturn;
  }

  public boolean Equals(RescuePolyLine other)
  {
    boolean myReturn = Equals3(nativeNdx
                                 ,(other == null) ? 0 : other.nativeNdx);
    return myReturn;
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

  public RescueModel ParentModel()
  {
    long returnNdx = ParentModel5(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueModel myReturn = new RescueModel(returnNdx);
      return myReturn;
    }
  }

  public cSetRescuePolyLineNode PolyLineNodes()
  {
    long returnNdx = PolyLineNodes6(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      cSetRescuePolyLineNode myReturn = new cSetRescuePolyLineNode(returnNdx);
      return myReturn;
    }
  }

  public RescueTrimVertexStub LeftVertexObj()
  {
    long returnNdx = LeftVertexObj7(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTrimVertexStub myReturn = new RescueTrimVertexStub(returnNdx);
      return myReturn;
    }
  }

  public RescueTrimVertexStub RightVertexObj()
  {
    long returnNdx = RightVertexObj8(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTrimVertexStub myReturn = new RescueTrimVertexStub(returnNdx);
      return myReturn;
    }
  }

  public RescueTrimVertex LeftVertex()
  {
    long returnNdx = LeftVertex9(nativeNdx);
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

  public RescueTrimVertex RightVertex()
  {
    long returnNdx = RightVertex10(nativeNdx);
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

  public RescuePolyLineNode Traverse(long zeroBasedOrdinal)
  {
    long returnNdx = Traverse11(nativeNdx
                               ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePolyLineNode myReturn = new RescuePolyLineNode(returnNdx);
      int isA = myReturn.IsA();
      switch(isA)
      {
      case RescueObject.R_RescueTrimVertex:
        myReturn = new RescueTrimVertex(returnNdx);
        break;
      }
      return myReturn;
    }
  }

  public long InnerNodeCount64()
  {
    long myReturn = InnerNodeCount12(nativeNdx);
    return myReturn;
  }

  public int InnerNodeCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(InnerNodeCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int InnerNodeCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(InnerNodeCount64(), throwIfTooBig);
  }

  public RescuePolyLineNode NthInnerNode(long zeroBasedNdx)
  {
    long returnNdx = NthInnerNode13(nativeNdx
                                   ,zeroBasedNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePolyLineNode myReturn = new RescuePolyLineNode(returnNdx);
      int isA = myReturn.IsA();
      switch(isA)
      {
      case RescueObject.R_RescueTrimVertex:
        myReturn = new RescueTrimVertex(returnNdx);
        break;
      }
      return myReturn;
    }
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType14(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native void Delete_RescuePolyLine(long ndx);
  private native long Create_RescuePolyLine1(long ownerIn,
                                            long leftVertexIn,
                                            long rightVertexIn);
  private native boolean Equals2(long refNdx
                                ,long other);
  private native boolean Equals3(long refNdx
                                ,long other);
  private native long Owner4(long refNdx);
  private native long ParentModel5(long refNdx);
  private native long PolyLineNodes6(long refNdx);
  private native long LeftVertexObj7(long refNdx);
  private native long RightVertexObj8(long refNdx);
  private native long LeftVertex9(long refNdx);
  private native long RightVertex10(long refNdx);
  private native long Traverse11(long refNdx
                                 ,long zeroBasedOrdinal);
  private native long InnerNodeCount12(long refNdx);
  private native long NthInnerNode13(long refNdx
                                     ,long zeroBasedNdx);
  private native boolean IsOfType14(long refNdx
                                   ,int thisType);
}
