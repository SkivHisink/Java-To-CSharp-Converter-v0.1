package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueSOctTreeNode.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueSOctTreeNode extends RjniBaseClass
{

  public static final int BOTTOM_LEFT_FRONT = 0;
  public static final int BOTTOM_RIGHT_FRONT = 1;
  public static final int BOTTOM_RIGHT_REAR = 2;
  public static final int BOTTOM_LEFT_REAR = 3;
  public static final int TOP_LEFT_FRONT = 4;
  public static final int TOP_RIGHT_FRONT = 5;
  public static final int TOP_RIGHT_REAR = 6;
  public static final int TOP_LEFT_REAR = 7;

  protected RescueSOctTreeNode(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueSOctTreeNode(RescueTriangulatedSurface parent,
                            float minX,
                            float maxX,
                            float minY,
                            float maxY,
                            float minZ,
                            float maxZ,
                            long xDivisions,
                            long yDivisions,
                            long zDivisions)
  {
    nativeNdx = Create_RescueSOctTreeNode0((parent == null) ? 0 : parent.nativeNdx,
                                           minX,
                                           maxX,
                                           minY,
                                           maxY,
                                           minZ,
                                           maxZ,
                                           xDivisions,
                                           yDivisions,
                                           zDivisions);
  }

  public void dispose()
  {
    Delete_RescueSOctTreeNode(nativeNdx);
  }

  public long VertexCount64()
  {
    long myReturn = VertexCount2(nativeNdx);
    return myReturn;
  }

  public int VertexCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(VertexCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int VertexCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(VertexCount64(), throwIfTooBig);
  }

  public RescueTriangleVertex NthVertex(long zeroBasedOrdinal)
  {
    long returnNdx = NthVertex3(nativeNdx
                                ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTriangleVertex myReturn = new RescueTriangleVertex(returnNdx);
      return myReturn;
    }
  }

  public RescueSOctTreeNode Leaf(int which)
  {
    long returnNdx = Leaf4(nativeNdx
                           ,which);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueSOctTreeNode myReturn = new RescueSOctTreeNode(returnNdx);
      return myReturn;
    }
  }

  public boolean TerminalNode()
  {
    boolean myReturn = TerminalNode5(nativeNdx);
    return myReturn;
  }

  public float MinX()
  {
    float myReturn = MinX6(nativeNdx);
    return myReturn;
  }

  public float MaxX()
  {
    float myReturn = MaxX7(nativeNdx);
    return myReturn;
  }

  public float MinY()
  {
    float myReturn = MinY8(nativeNdx);
    return myReturn;
  }

  public float MaxY()
  {
    float myReturn = MaxY9(nativeNdx);
    return myReturn;
  }

  public float MinZ()
  {
    float myReturn = MinZ10(nativeNdx);
    return myReturn;
  }

  public float MaxZ()
  {
    float myReturn = MaxZ11(nativeNdx);
    return myReturn;
  }

  private native long Create_RescueSOctTreeNode0(long parent,
                                                float minX,
                                                float maxX,
                                                float minY,
                                                float maxY,
                                                float minZ,
                                                float maxZ,
                                                long xDivisions,
                                                long yDivisions,
                                                long zDivisions);
  private native void Delete_RescueSOctTreeNode(long ndx);
  private native long VertexCount2(long refNdx);
  private native long NthVertex3(long refNdx
                                 ,long zeroBasedOrdinal);
  private native long Leaf4(long refNdx
                            ,int which);
  private native boolean TerminalNode5(long refNdx);
  private native float MinX6(long refNdx);
  private native float MaxX7(long refNdx);
  private native float MinY8(long refNdx);
  private native float MaxY9(long refNdx);
  private native float MinZ10(long refNdx);
  private native float MaxZ11(long refNdx);
}
