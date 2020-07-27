using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueUnstructuredGrid : RjniBaseClass
{


  protected RescueUnstructuredGrid(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueUnstructuredGrid(nativeNdx);
  }

  public void AddVertices(long count,
                          float[] vertexXIn,
                          float[] vertexYIn,
                          float[] vertexZin)
  {
    AddVertices1(nativeNdx
                ,count
                ,vertexXIn
                ,vertexYIn
                ,vertexZin);
  }

  public void AddFace(int count,
                      int[] vertexIndices)
  {
    AddFace2i(nativeNdx
            ,count
            ,vertexIndices);
  }

  public void AddFace(long count,
                      long[] vertexIndices)
  {
    AddFace2(nativeNdx
            ,count
            ,vertexIndices);
  }

  public void AddCell(int cellCenterNdxIn,
                      int kLayerIn,
                      int count,
                      int[] faceIndices)
  {
    AddCell3i(nativeNdx
            ,cellCenterNdxIn
            ,kLayerIn
            ,count
            ,faceIndices);
  }

  public void AddCell(long cellCenterNdxIn,
                      long kLayerIn,
                      long count,
                      long[] faceIndices)
  {
    AddCell3(nativeNdx
            ,cellCenterNdxIn
            ,kLayerIn
            ,count
            ,faceIndices);
  }

  public long VertexCount64()
  {
    long myReturn = VertexCount4(nativeNdx);
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

  public float NthVertexX(long zeroBasedOrdinal)
  {
    float myReturn = NthVertexX5(nativeNdx
                                ,zeroBasedOrdinal);
    return myReturn;
  }

  public float NthVertexY(long zeroBasedOrdinal)
  {
    float myReturn = NthVertexY6(nativeNdx
                                ,zeroBasedOrdinal);
    return myReturn;
  }

  public float NthVertexZ(long zeroBasedOrdinal)
  {
    float myReturn = NthVertexZ7(nativeNdx
                                ,zeroBasedOrdinal);
    return myReturn;
  }

  public float[] VerticesX()
  {
    float[] myReturn = VerticesX8(nativeNdx);
    return myReturn;
  }

  public float[] VerticesY()
  {
    float[] myReturn = VerticesY9(nativeNdx);
    return myReturn;
  }

  public float[] VerticesZ()
  {
    float[] myReturn = VerticesZ10(nativeNdx);
    return myReturn;
  }

  public long VerticesXLength64()
  {
    long myReturn = VerticesXLength11(nativeNdx);
    return myReturn;
  }

  public int VerticesXLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(VerticesXLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int VerticesXLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(VerticesXLength64(), throwIfTooBig);
  }

  public long VerticesYLength64()
  {
    long myReturn = VerticesYLength12(nativeNdx);
    return myReturn;
  }

  public int VerticesYLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(VerticesYLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int VerticesYLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(VerticesYLength64(), throwIfTooBig);
  }

  public long VerticesZLength64()
  {
    long myReturn = VerticesZLength13(nativeNdx);
    return myReturn;
  }

  public int VerticesZLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(VerticesZLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int VerticesZLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(VerticesZLength64(), throwIfTooBig);
  }

  public void CopyVertices(long lowNdx,
                           long count,
                           float[] preAllocatedX,
                           float[] preAllocatedY,
                           float[] preAllocatedZ,
                           long offset)
  {
    CopyVertices14(nativeNdx
                 ,lowNdx
                 ,count
                 ,preAllocatedX
                 ,preAllocatedY
                 ,preAllocatedZ
                 ,offset);
  }

  public void SetVertices(long count,
                          float[] xs,
                          float[] ys,
                          float[] zs)
  {
    SetVertices16(nativeNdx
                ,count
                ,xs
                ,ys
                ,zs);
  }

  public long FaceCount64()
  {
    long myReturn = FaceCount17(nativeNdx);
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

  public long NthFace(long zeroBasedOrdinal,
                     long count,
                     long[] preAllocated)
  {
    long myReturn = NthFace18(nativeNdx
                           ,zeroBasedOrdinal
                           ,count
                           ,preAllocated);
    return myReturn;
  }

  public int NthFace(int zeroBasedOrdinal,
                     int count,
                     int[] preAllocated)
  {
    int myReturn = NthFace18i(nativeNdx
                           ,zeroBasedOrdinal
                           ,count
                           ,preAllocated);
    return myReturn;
  }

  public long[] FaceVertexNdx()
  {
    long[] myReturn = FaceVertexNdx19(nativeNdx);
    return myReturn;
  }

  public int[] FaceVertexNdx(bool throwIfTooBig)
  {
    int[] myReturn = FaceVertexNdx19i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] FaceVertexCount()
  {
    long[] myReturn = FaceVertexCount20(nativeNdx);
    return myReturn;
  }

  public int[] FaceVertexCount(bool throwIfTooBig)
  {
    int[] myReturn = FaceVertexCount20i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long FaceVertexNdxLength64()
  {
    long myReturn = FaceVertexNdxLength21(nativeNdx);
    return myReturn;
  }

  public int FaceVertexNdxLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(FaceVertexNdxLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int FaceVertexNdxLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(FaceVertexNdxLength64(), throwIfTooBig);
  }

  public long FaceVertexCountLength64()
  {
    long myReturn = FaceVertexCountLength22(nativeNdx);
    return myReturn;
  }

  public int FaceVertexCountLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(FaceVertexCountLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int FaceVertexCountLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(FaceVertexCountLength64(), throwIfTooBig);
  }

  public void CopyFaces(long lowNdx,
                        long count,
                        long[] preAllocatedNdx,
                        long[] preAllocatedCount,
                        long offset)
  {
    CopyFaces23(nativeNdx
              ,lowNdx
              ,count
              ,preAllocatedNdx
              ,preAllocatedCount
              ,offset);
  }

  public void CopyFaces(int lowNdx,
                        int count,
                        int[] preAllocatedNdx,
                        int[] preAllocatedCount,
                        int offset)
  {
    CopyFaces23i(nativeNdx
              ,lowNdx
              ,count
              ,preAllocatedNdx
              ,preAllocatedCount
              ,offset);
  }

  public long FaceVertexTupleCount64()
  {
    long myReturn = FaceVertexTupleCount24(nativeNdx);
    return myReturn;
  }

  public int FaceVertexTupleCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(FaceVertexTupleCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int FaceVertexTupleCount(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(FaceVertexTupleCount64(), throwIfTooBig);
  }

  public long[] FaceArray()
  {
    long[] myReturn = FaceArray25(nativeNdx);
    return myReturn;
  }

  public int[] FaceArray(bool throwIfTooBig)
  {
    int[] myReturn = FaceArray25i(nativeNdx, throwIfTooBig);
	return myReturn;
  }

  public long FaceArrayLength64()
  {
    long myReturn = FaceArrayLength26(nativeNdx);
    return myReturn;
  }

  public int FaceArrayLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(FaceArrayLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int FaceArrayLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(FaceArrayLength64(), throwIfTooBig);
  }

  public void CopyFaceVertexTuples(long lowNdx,
                                   long count,
                                   long[] preAllocatedNdx,
                                   long offset)
  {
    CopyFaceVertexTuples27(nativeNdx
                         ,lowNdx
                         ,count
                         ,preAllocatedNdx
                         ,offset);
  }

  public void CopyFaceVertexTuples(int lowNdx,
                                   int count,
                                   int[] preAllocatedNdx,
                                   int offset)
  {
    CopyFaceVertexTuples27i(nativeNdx
                         ,lowNdx
                         ,count
                         ,preAllocatedNdx
                         ,offset);
  }

  public void SetFaces(long faceCountIn,
                       long[] faceVertexNdxIn,
                       long[] faceVertexCountIn,
                       long faceVertexTupleCountIn,
                       long[] faceArrayIn)
  {
    SetFaces29(nativeNdx
             ,faceCountIn
             ,faceVertexNdxIn
             ,faceVertexCountIn
             ,faceVertexTupleCountIn
             ,faceArrayIn);
  }

  public void SetFaces(int faceCountIn,
                       int[] faceVertexNdxIn,
                       int[] faceVertexCountIn,
                       int faceVertexTupleCountIn,
                       int[] faceArrayIn)
  {
    SetFaces29i(nativeNdx
             ,faceCountIn
             ,faceVertexNdxIn
             ,faceVertexCountIn
             ,faceVertexTupleCountIn
             ,faceArrayIn);
  }

  public long CellCount64()
  {
    long myReturn = CellCount30(nativeNdx);
    return myReturn;
  }

  public int CellCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(CellCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int CellCount(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(CellCount64(), throwIfTooBig);
  }

  public long[] FaceCellNdx()
  {
    long[] myReturn = FaceCellNdx32(nativeNdx);
    return myReturn;
  }

  public int[] FaceCellNdx(bool throwIfTooBig)
  {
    int[] myReturn = FaceCellNdx32i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] FaceCellCount()
  {
    long[] myReturn = FaceCellCount33(nativeNdx);
    return myReturn;
  }

  public int[] FaceCellCount(bool throwIfTooBig)
  {
    int[] myReturn = FaceCellCount33i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] CellCenterNdx()
  {
    long[] myReturn = CellCenterNdx34(nativeNdx);
    return myReturn;
  }

  public int[] CellCenterNdx(bool throwIfTooBig)
  {
    int[] myReturn = CellCenterNdx34i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] KLayer()
  {
    long[] myReturn = KLayer35(nativeNdx);
    return myReturn;
  }

  public int[] KLayer(bool throwIfTooBig)
  {
    int[] myReturn = KLayer35i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long FaceCellNdxLength64()
  {
    long myReturn = FaceCellNdxLength36(nativeNdx);
    return myReturn;
  }

  public int FaceCellNdxLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(FaceCellNdxLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int FaceCellNdxLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(FaceCellNdxLength64(), throwIfTooBig);
  }

  public long FaceCellCountLength64()
  {
    long myReturn = FaceCellCountLength37(nativeNdx);
    return myReturn;
  }

  public int FaceCellCountLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(FaceCellCountLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int FaceCellCountLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(FaceCellCountLength64(), throwIfTooBig);
  }

  public long CellCenterNdxLength64()
  {
    long myReturn = CellCenterNdxLength38(nativeNdx);
    return myReturn;
  }

  public int CellCenterNdxLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(CellCenterNdxLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int CellCenterNdxLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(CellCenterNdxLength64(), throwIfTooBig);
  }

  public long KLayerLength64()
  {
    long myReturn = KLayerLength39(nativeNdx);
    return myReturn;
  }

  public int KLayerLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(KLayerLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int KLayerLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(KLayerLength64(), throwIfTooBig);
  }

  public void CopyCells(long lowNdx,
                        long count,
                        long[] faceCellNdxArray,
                        long[] faceCellCountArray,
                        long[] cellCenterNdxArray,
                        long[] kLayerArray,
                        long offset)
  {
    CopyCells40(nativeNdx
              ,lowNdx
              ,count
              ,faceCellNdxArray
              ,faceCellCountArray
              ,cellCenterNdxArray
              ,kLayerArray
              ,offset);
  }

  public void CopyCells(int lowNdx,
                        int count,
                        int[] faceCellNdxArray,
                        int[] faceCellCountArray,
                        int[] cellCenterNdxArray,
                        int[] kLayerArray,
                        int offset)
  {
    CopyCells40i(nativeNdx
              ,lowNdx
              ,count
              ,faceCellNdxArray
              ,faceCellCountArray
              ,cellCenterNdxArray
              ,kLayerArray
              ,offset);
  }

  public long FaceListCount64()
  {
    long myReturn = FaceListCount41(nativeNdx);
    return myReturn;
  }

  public int FaceListCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(FaceListCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int FaceListCount(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(FaceListCount64(), throwIfTooBig);
  }

  public long[] FaceList()
  {
    long[] myReturn = FaceList42(nativeNdx);
    return myReturn;
  }

  public int[] FaceList(bool throwIfTooBig)
  {
    int[] myReturn = FaceList42i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long FaceListLength64()
  {
    long myReturn = FaceListLength43(nativeNdx);
    return myReturn;
  }

  public int FaceListLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(FaceListLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int FaceListLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(FaceListLength64(), throwIfTooBig);
  }

  public void CopyCellFaceTuples(long lowNdx,
                                 long count,
                                 long[] faceListArray,
                                 long offset)
  {
    CopyCellFaceTuples44(nativeNdx
                       ,lowNdx
                       ,count
                       ,faceListArray
                       ,offset);
  }

  public void CopyCellFaceTuples(int lowNdx,
                                 int count,
                                 int[] faceListArray,
                                 int offset)
  {
    CopyCellFaceTuples44i(nativeNdx
                       ,lowNdx
                       ,count
                       ,faceListArray
                       ,offset);
  }

  public void SetCells(long cellCountIn,
                       long[] faceCellNdxIn,
                       long[] faceCellCountIn,
                       long[] cellCenterNdxIn,
                       long[] kLayerIn,
                       long faceListCountIn,
                       long[] faceListIn)
  {
    SetCells46(nativeNdx
             ,cellCountIn
             ,faceCellNdxIn
             ,faceCellCountIn
             ,cellCenterNdxIn
             ,kLayerIn
             ,faceListCountIn
             ,faceListIn);
  }

  public void SetCells(int cellCountIn,
                       int[] faceCellNdxIn,
                       int[] faceCellCountIn,
                       int[] cellCenterNdxIn,
                       int[] kLayerIn,
                       int faceListCountIn,
                       int[] faceListIn)
  {
    SetCells46i(nativeNdx
             ,cellCountIn
             ,faceCellNdxIn
             ,faceCellCountIn
             ,cellCenterNdxIn
             ,kLayerIn
             ,faceListCountIn
             ,faceListIn);
  }

}

}