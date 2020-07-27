using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueTriangulatedSurface : RescueObject
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

  public int VertexCount(bool throwIfTooBig) //thro RuntimeException
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

  public int FaceCount(bool throwIfTooBig) //thro RuntimeException
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

  public bool DropVertex(RescueTriangleVertex toDrop)
  {
    bool myReturn = DropVertex10(nativeNdx
                                     ,(toDrop == null) ? 0 : toDrop.nativeNdx);
    return myReturn;
  }

  public bool DropFace(RescueTriangleFace toDrop)
  {
    bool myReturn = DropFace11(nativeNdx
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

  public bool Contains(RescueTriangleVertex vertex)
  {
    bool myReturn = Contains15(nativeNdx
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

  public int OctTreeCount(bool throwIfTooBig) //thro RuntimeException
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

  public bool DropOctTree(RescueSOctTreeNode toDrop)
  {
    bool myReturn = DropOctTree18(nativeNdx
                                      ,(toDrop == null) ? 0 : toDrop.nativeNdx);
    return myReturn;
  }

  public bool IsLoaded()
  {
    bool myReturn = IsLoaded19(nativeNdx);
    return myReturn;
  }

  public bool Load()
  {
    bool myReturn = Load20(nativeNdx);
    return myReturn;
  }

  public bool FileTruncated()
  {
    bool myReturn = FileTruncated21(nativeNdx);
    return myReturn;
  }

  public bool Unload()
  {
    bool myReturn = Unload22(nativeNdx);
    return myReturn;
  }

  public bool HasChanged()
  {
    bool myReturn = HasChanged23(nativeNdx);
    return myReturn;
  }

  public void MarkChanged()
  {
    MarkChanged24(nativeNdx);
  }

  public int Version(bool reload)
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

  public int FaceStatus(long i, bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(FaceStatus(i), throwIfTooBig);
  }

}

}