package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueTrimEdge.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueTrimEdge extends RescueObject
{

  public static final int R_RIGHT_TO_LEFT = 0;
  public static final int R_LEFT_TO_RIGHT = 1;

  protected RescueTrimEdge(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueTrimEdge(nativeNdx);
  }

  public RescueTrimEdge(RescuePolyLine polyLineIn,
                        int directionIn)
  {
    nativeNdx = Create_RescueTrimEdge1((polyLineIn == null) ? 0 : polyLineIn.nativeNdx,
                                       directionIn);
  }

  public int Direction()
  {
    int myReturn = Direction2(nativeNdx);
    return myReturn;
  }

  public RescueTrimVertex StartingPoint(RescueModel model)
  {
    long returnNdx = StartingPoint3(nativeNdx
                                    ,(model == null) ? 0 : model.nativeNdx);
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

  public RescueTrimVertex EndingPoint(RescueModel model)
  {
    long returnNdx = EndingPoint4(nativeNdx
                                  ,(model == null) ? 0 : model.nativeNdx);
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

  public long NodeCount64()
  {
    long myReturn = NodeCount5(nativeNdx);
    return myReturn;
  }

  public int NodeCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(NodeCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int NodeCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(NodeCount64(), throwIfTooBig);
  }

  public RescuePolyLineNode NthNode(long zeroBasedOrdinal)
  {
    long returnNdx = NthNode6(nativeNdx
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

  public RescuePolyLine PolyLine(RescueModel model)
  {
    long returnNdx = PolyLine7(nativeNdx
                               ,(model == null) ? 0 : model.nativeNdx);
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

  public RescueTrimLoop ParentLoop()
  {
    long returnNdx = ParentLoop8(nativeNdx);
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

  public RescueTrimVertexStub StartingPointObj()
  {
    long returnNdx = StartingPointObj9(nativeNdx);
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

  public RescueTrimVertexStub EndingPointObj()
  {
    long returnNdx = EndingPointObj10(nativeNdx);
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

  public RescuePolyLineStub PolyLineObj()
  {
    long returnNdx = PolyLineObj11(nativeNdx);
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

  public boolean SurfaceOnEdge(RescueIJSurface surf)
  {
    boolean myReturn = SurfaceOnEdge12(nativeNdx
                                        ,(surf == null) ? 0 : surf.nativeNdx);
    return myReturn;
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType13(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native void Delete_RescueTrimEdge(long ndx);
  private native long Create_RescueTrimEdge1(long polyLineIn,
                                            int directionIn);
  private native int Direction2(long refNdx);
  private native long StartingPoint3(long refNdx
                                     ,long model);
  private native long EndingPoint4(long refNdx
                                   ,long model);
  private native long NodeCount5(long refNdx);
  private native long NthNode6(long refNdx
                               ,long zeroBasedOrdinal);
  private native long PolyLine7(long refNdx
                                ,long model);
  private native long ParentLoop8(long refNdx);
  private native long StartingPointObj9(long refNdx);
  private native long EndingPointObj10(long refNdx);
  private native long PolyLineObj11(long refNdx);
  private native boolean SurfaceOnEdge12(long refNdx
                                        ,long surf);
  private native boolean IsOfType13(long refNdx
                                   ,int thisType);
}
