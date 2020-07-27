package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueTriangulatedSurface.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueTriangulatedSurface extends RescueObject
{


  protected RescueTriangulatedSurface(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public long VertexCount64()
  {
    long myReturn = VertexCount0(nativeNdx);
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
    long returnNdx = NthVertex1(nativeNdx
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

  public long FaceCount64()
  {
    long myReturn = FaceCount2(nativeNdx);
    return myReturn;
  }

  public int FaceCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(FaceCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int FaceCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(FaceCount64(), throwIfTooBig);
  }

  public RescueTriangleFace NthFace(long zeroBasedOrdinal)
  {
    long returnNdx = NthFace3(nativeNdx
                              ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTriangleFace myReturn = new RescueTriangleFace(returnNdx);
      return myReturn;
    }
  }

  public cSetRescueTriangleFace FaceList()
  {
    long returnNdx = FaceList6(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      cSetRescueTriangleFace myReturn = new cSetRescueTriangleFace(returnNdx);
      return myReturn;
    }
  }

  public cSetRescueTriangleVertex VertexList()
  {
    long returnNdx = VertexList7(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      cSetRescueTriangleVertex myReturn = new cSetRescueTriangleVertex(returnNdx);
      return myReturn;
    }
  }

  public void AddVertex(RescueTriangleVertex toAdd)
  {
    AddVertex8(nativeNdx
              ,(toAdd == null) ? 0 : toAdd.nativeNdx);
  }

  public void AddFace(RescueTriangleFace toAdd)
  {
    AddFace9(nativeNdx
            ,(toAdd == null) ? 0 : toAdd.nativeNdx);
  }

  public boolean DropVertex(RescueTriangleVertex toDrop)
  {
    boolean myReturn = DropVertex10(nativeNdx
                                     ,(toDrop == null) ? 0 : toDrop.nativeNdx);
    return myReturn;
  }

  public boolean DropFace(RescueTriangleFace toDrop)
  {
    boolean myReturn = DropFace11(nativeNdx
                                   ,(toDrop == null) ? 0 : toDrop.nativeNdx);
    return myReturn;
  }

  public RescueGrid Grid(int howAttached)
  {
    long returnNdx = Grid12(nativeNdx
                           ,howAttached);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGrid myReturn = new RescueGrid(returnNdx);
      return myReturn;
    }
  }

  public void dispose()
  {
    Delete_RescueTriangulatedSurface(nativeNdx);
  }

  public RescueSurface ParentSurface()
  {
    long returnNdx = ParentSurface14(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueSurface myReturn = new RescueSurface(returnNdx);
      int isA = myReturn.IsA();
      switch(isA)
      {
      case RescueObject.R_RescueReferenceSurface:
        myReturn = new RescueReferenceSurface(returnNdx);
        break;
      case RescueObject.R_RescueSection:
        myReturn = new RescueSection(returnNdx);
        break;
      }
      return myReturn;
    }
  }

  public boolean Contains(RescueTriangleVertex vertex)
  {
    boolean myReturn = Contains15(nativeNdx
                                   ,(vertex == null) ? 0 : vertex.nativeNdx);
    return myReturn;
  }

  public long OctTreeCount64()
  {
    long myReturn = OctTreeCount16(nativeNdx);
    return myReturn;
  }

  public int OctTreeCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(OctTreeCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int OctTreeCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(OctTreeCount64(), throwIfTooBig);
  }

  public RescueSOctTreeNode NthOctTree(long zeroBasedOrdinal)
  {
    long returnNdx = NthOctTree17(nativeNdx
                                 ,zeroBasedOrdinal);
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

  public boolean DropOctTree(RescueSOctTreeNode toDrop)
  {
    boolean myReturn = DropOctTree18(nativeNdx
                                      ,(toDrop == null) ? 0 : toDrop.nativeNdx);
    return myReturn;
  }

  public boolean IsLoaded()
  {
    boolean myReturn = IsLoaded19(nativeNdx);
    return myReturn;
  }

  public boolean Load()
  {
    boolean myReturn = Load20(nativeNdx);
    return myReturn;
  }

  public boolean FileTruncated()
  {
    boolean myReturn = FileTruncated21(nativeNdx);
    return myReturn;
  }

  public boolean Unload()
  {
    boolean myReturn = Unload22(nativeNdx);
    return myReturn;
  }

  public boolean HasChanged()
  {
    boolean myReturn = HasChanged23(nativeNdx);
    return myReturn;
  }

  public void MarkChanged()
  {
    MarkChanged24(nativeNdx);
  }

  public int Version(boolean reload)
  {
    int myReturn = Version25(nativeNdx
                           ,reload);
    return myReturn;
  }

  public void SetFaceStatus(long i,
                            long newStatus)
  {
    SetFaceStatus26(nativeNdx
                  ,i
                  ,newStatus);
  }

  public long FaceStatus(long i)
  {
    long myReturn = FaceStatus27(nativeNdx
                               ,i);
    return myReturn;
  }

  public int FaceStatus(long i, boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(FaceStatus(i), throwIfTooBig);
  }

  private native long VertexCount0(long refNdx);
  private native long NthVertex1(long refNdx
                                 ,long zeroBasedOrdinal);
  private native long FaceCount2(long refNdx);
  private native long NthFace3(long refNdx
                               ,long zeroBasedOrdinal);
  private native long FaceList6(long refNdx);
  private native long VertexList7(long refNdx);
  private native void AddVertex8(long refNdx
                                ,long toAdd);
  private native void AddFace9(long refNdx
                              ,long toAdd);
  private native boolean DropVertex10(long refNdx
                                     ,long toDrop);
  private native boolean DropFace11(long refNdx
                                   ,long toDrop);
  private native long Grid12(long refNdx
                             ,int howAttached);
  private native void Delete_RescueTriangulatedSurface(long ndx);
  private native long ParentSurface14(long refNdx);
  private native boolean Contains15(long refNdx
                                   ,long vertex);
  private native long OctTreeCount16(long refNdx);
  private native long NthOctTree17(long refNdx
                                   ,long zeroBasedOrdinal);
  private native boolean DropOctTree18(long refNdx
                                      ,long toDrop);
  private native boolean IsLoaded19(long refNdx);
  private native boolean Load20(long refNdx);
  private native boolean FileTruncated21(long refNdx);
  private native boolean Unload22(long refNdx);
  private native boolean HasChanged23(long refNdx);
  private native void MarkChanged24(long refNdx);
  private native int Version25(long refNdx
                              ,boolean reload);
  private native void SetFaceStatus26(long refNdx
                                     ,long i
                                     ,long newStatus);
  private native long FaceStatus27(long refNdx
                                 ,long i);
}
