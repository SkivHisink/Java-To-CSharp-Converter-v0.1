using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueSOctTreeNode : RjniBaseClass
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

  public int VertexCount(bool throwIfTooBig) //thro RuntimeException
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

  public bool TerminalNode()
  {
    bool myReturn = TerminalNode5(nativeNdx);
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

}

}