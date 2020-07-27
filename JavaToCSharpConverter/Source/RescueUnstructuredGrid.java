package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueUnstructuredGrid.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueUnstructuredGrid extends RjniBaseClass
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

  public int VertexCount(boolean throwIfTooBig) throws RuntimeException
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

  public int VerticesXLength(boolean throwIfTooBig) throws RuntimeException
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

  public int VerticesYLength(boolean throwIfTooBig) throws RuntimeException
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

  public int VerticesZLength(boolean throwIfTooBig) throws RuntimeException
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

  public int FaceCount(boolean throwIfTooBig) throws RuntimeException
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

  public int[] FaceVertexNdx(boolean throwIfTooBig)
  {
    int[] myReturn = FaceVertexNdx19i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] FaceVertexCount()
  {
    long[] myReturn = FaceVertexCount20(nativeNdx);
    return myReturn;
  }

  public int[] FaceVertexCount(boolean throwIfTooBig)
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

  public int FaceVertexNdxLength(boolean throwIfTooBig) throws RuntimeException
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

  public int FaceVertexCountLength(boolean throwIfTooBig) throws RuntimeException
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

  public int FaceVertexTupleCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(FaceVertexTupleCount64(), throwIfTooBig);
  }

  public long[] FaceArray()
  {
    long[] myReturn = FaceArray25(nativeNdx);
    return myReturn;
  }

  public int[] FaceArray(boolean throwIfTooBig)
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

  public int FaceArrayLength(boolean throwIfTooBig) throws RuntimeException
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

  public int CellCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(CellCount64(), throwIfTooBig);
  }

  public long[] FaceCellNdx()
  {
    long[] myReturn = FaceCellNdx32(nativeNdx);
    return myReturn;
  }

  public int[] FaceCellNdx(boolean throwIfTooBig)
  {
    int[] myReturn = FaceCellNdx32i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] FaceCellCount()
  {
    long[] myReturn = FaceCellCount33(nativeNdx);
    return myReturn;
  }

  public int[] FaceCellCount(boolean throwIfTooBig)
  {
    int[] myReturn = FaceCellCount33i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] CellCenterNdx()
  {
    long[] myReturn = CellCenterNdx34(nativeNdx);
    return myReturn;
  }

  public int[] CellCenterNdx(boolean throwIfTooBig)
  {
    int[] myReturn = CellCenterNdx34i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] KLayer()
  {
    long[] myReturn = KLayer35(nativeNdx);
    return myReturn;
  }

  public int[] KLayer(boolean throwIfTooBig)
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

  public int FaceCellNdxLength(boolean throwIfTooBig) throws RuntimeException
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

  public int FaceCellCountLength(boolean throwIfTooBig) throws RuntimeException
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

  public int CellCenterNdxLength(boolean throwIfTooBig) throws RuntimeException
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

  public int KLayerLength(boolean throwIfTooBig) throws RuntimeException
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

  public int FaceListCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(FaceListCount64(), throwIfTooBig);
  }

  public long[] FaceList()
  {
    long[] myReturn = FaceList42(nativeNdx);
    return myReturn;
  }

  public int[] FaceList(boolean throwIfTooBig)
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

  public int FaceListLength(boolean throwIfTooBig) throws RuntimeException
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

  private native void Delete_RescueUnstructuredGrid(long ndx);
  private native void AddVertices1(long refNdx
                                  ,long count
                                  ,float[] vertexXIn
                                  ,float[] vertexYIn
                                  ,float[] vertexZin);
  private native void AddFace2(long refNdx
                              ,long count
                              ,long[] vertexIndices);
  private native void AddFace2i(long refNdx
                              ,int count
                              ,int[] vertexIndices);
  private native void AddCell3(long refNdx
                              ,long cellCenterNdxIn
                              ,long kLayerIn
                              ,long count
                              ,long[] faceIndices);
  private native void AddCell3i(long refNdx
                              ,int cellCenterNdxIn
                              ,int kLayerIn
                              ,int count
                              ,int[] faceIndices);
  private native long VertexCount4(long refNdx);
  private native float NthVertexX5(long refNdx
                                  ,long zeroBasedOrdinal);
  private native float NthVertexY6(long refNdx
                                  ,long zeroBasedOrdinal);
  private native float NthVertexZ7(long refNdx
                                  ,long zeroBasedOrdinal);
  private native float[] VerticesX8(long refNdx);
  private native float[] VerticesY9(long refNdx);
  private native float[] VerticesZ10(long refNdx);
  private native long VerticesXLength11(long refNdx);
  private native long VerticesYLength12(long refNdx);
  private native long VerticesZLength13(long refNdx);
  private native void CopyVertices14(long refNdx
                                    ,long lowNdx
                                    ,long count
                                    ,float[] preAllocatedX
                                    ,float[] preAllocatedY
                                    ,float[] preAllocatedZ
                                    ,long offset);
  private native void SetVertices16(long refNdx
                                   ,long count
                                   ,float[] xs
                                   ,float[] ys
                                   ,float[] zs);
  private native long FaceCount17(long refNdx);
  private native long NthFace18(long refNdx
                              ,long zeroBasedOrdinal
                              ,long count
                              ,long[] preAllocated);
  private native int NthFace18i(long refNdx
                              ,int zeroBasedOrdinal
                              ,int count
                              ,int[] preAllocated);
  private native long[] FaceVertexNdx19(long refNdx);
  private native int[] FaceVertexNdx19i(long refNdx, boolean throwIfTooBig);
  private native long[] FaceVertexCount20(long refNdx);
  private native int[] FaceVertexCount20i(long refNdx, boolean throwIfTooBig);
  private native long FaceVertexNdxLength21(long refNdx);
  private native long FaceVertexCountLength22(long refNdx);
  private native void CopyFaces23(long refNdx
                                 ,long lowNdx
                                 ,long count
                                 ,long[] preAllocatedNdx
                                 ,long[] preAllocatedCount
                                 ,long offset);
  private native void CopyFaces23i(long refNdx
                                 ,int lowNdx
                                 ,int count
                                 ,int[] preAllocatedNdx
                                 ,int[] preAllocatedCount
                                 ,int offset);
  private native long FaceVertexTupleCount24(long refNdx);
  private native long[] FaceArray25(long refNdx);
  private native int[] FaceArray25i(long refNdx, boolean throwIfTooBig);
  private native long FaceArrayLength26(long refNdx);
  private native void CopyFaceVertexTuples27(long refNdx
                                            ,long lowNdx
                                            ,long count
                                            ,long[] preAllocatedNdx
                                            ,long offset);
  private native void CopyFaceVertexTuples27i(long refNdx
                                            ,int lowNdx
                                            ,int count
                                            ,int[] preAllocatedNdx
                                            ,int offset);
  private native void SetFaces29(long refNdx
                                ,long faceCountIn
                                ,long[] faceVertexNdxIn
                                ,long[] faceVertexCountIn
                                ,long faceVertexTupleCountIn
                                ,long[] faceArrayIn);
  private native void SetFaces29i(long refNdx
                                ,int faceCountIn
                                ,int[] faceVertexNdxIn
                                ,int[] faceVertexCountIn
                                ,int faceVertexTupleCountIn
                                ,int[] faceArrayIn);
  private native long CellCount30(long refNdx);
  private native long[] FaceCellNdx32(long refNdx);
  private native int[] FaceCellNdx32i(long refNdx, boolean throwIfTooBig);
  private native long[] FaceCellCount33(long refNdx);
  private native int[] FaceCellCount33i(long refNdx, boolean throwIfTooBig);
  private native long[] CellCenterNdx34(long refNdx);
  private native int[] CellCenterNdx34i(long refNdx, boolean throwIfTooBig);
  private native long[] KLayer35(long refNdx);
  private native int[] KLayer35i(long refNdx, boolean throwIfTooBig);
  private native long FaceCellNdxLength36(long refNdx);
  private native long FaceCellCountLength37(long refNdx);
  private native long CellCenterNdxLength38(long refNdx);
  private native long KLayerLength39(long refNdx);
  private native void CopyCells40(long refNdx
                                 ,long lowNdx
                                 ,long count
                                 ,long[] faceCellNdxArray
                                 ,long[] faceCellCountArray
                                 ,long[] cellCenterNdxArray
                                 ,long[] kLayerArray
                                 ,long offset);
  private native void CopyCells40i(long refNdx
                                 ,int lowNdx
                                 ,int count
                                 ,int[] faceCellNdxArray
                                 ,int[] faceCellCountArray
                                 ,int[] cellCenterNdxArray
                                 ,int[] kLayerArray
                                 ,int offset);
  private native long FaceListCount41(long refNdx);
  private native long[] FaceList42(long refNdx);
  private native int[] FaceList42i(long refNdx, boolean throwIfTooBig);
  private native long FaceListLength43(long refNdx);
  private native void CopyCellFaceTuples44(long refNdx
                                          ,long lowNdx
                                          ,long count
                                          ,long[] faceListArray
                                          ,long offset);
  private native void CopyCellFaceTuples44i(long refNdx
                                          ,int lowNdx
                                          ,int count
                                          ,int[] faceListArray
                                          ,int offset);
  private native void SetCells46(long refNdx
                                ,long cellCountIn
                                ,long[] faceCellNdxIn
                                ,long[] faceCellCountIn
                                ,long[] cellCenterNdxIn
                                ,long[] kLayerIn
                                ,long faceListCountIn
                                ,long[] faceListIn);
  private native void SetCells46i(long refNdx
                                ,int cellCountIn
                                ,int[] faceCellNdxIn
                                ,int[] faceCellCountIn
                                ,int[] cellCenterNdxIn
                                ,int[] kLayerIn
                                ,int faceListCountIn
                                ,int[] faceListIn);
}
