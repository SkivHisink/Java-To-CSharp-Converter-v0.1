using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescuePolyLine : RescueObject
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

  public bool Equals(RescuePolyLineStub other)
  {
    bool myReturn = Equals2(nativeNdx
                                 ,(other == null) ? 0 : other.nativeNdx);
    return myReturn;
  }

  public bool Equals(RescuePolyLine other)
  {
    bool myReturn = Equals3(nativeNdx
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

  public int InnerNodeCount(bool throwIfTooBig) //thro RuntimeException
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

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType14(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}