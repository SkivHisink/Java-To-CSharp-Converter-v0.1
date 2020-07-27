package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueInterfaceSurfaceDesc.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueInterfaceSurfaceDesc extends RjniBaseClass
{

  public static final int FACE_I_NDX = 0;
  public static final int FACE_J_NDX = 1;
  public static final int FACE_K_NDX = 2;
  public static final int FACE_NDX = 3;
  public static final int CELL_NDX = 4;
  public static final int CELL_COUNT = 5;
  public static final int CELL_REF = 6;
  public static final int CELL_I_NDX = 7;
  public static final int CELL_J_NDX = 8;
  public static final int CELL_K_NDX = 9;
  public static final int FACE_ROW_NDX = 10;

  protected RescueInterfaceSurfaceDesc(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueInterfaceSurfaceDesc(RescueGeometry lgrGeometry,
                                    boolean isExteriorIn,
                                    long expectedFaces,
                                    long expectedCells,
                                    long facesRealloc,
                                    long cellsRealloc)
  {
    nativeNdx = Create_RescueInterfaceSurfaceDesc0((lgrGeometry == null) ? 0 : lgrGeometry.nativeNdx,
                                                   isExteriorIn,
                                                   expectedFaces,
                                                   expectedCells,
                                                   facesRealloc,
                                                   cellsRealloc);
  }

  public void dispose()
  {
    Delete_RescueInterfaceSurfaceDesc(nativeNdx);
  }

  public void SetIsExterior(boolean newState)
  {
    SetIsExterior2(nativeNdx
                  ,newState);
  }

  public void SetFaceToCell(long iNdx,
                            long jNdx,
                            long kNdx,
                            long faceNdx,
                            long cellCount,
                            long[] cellRef,
                            long[] cIndx,
                            long[] cJndx,
                            long[] cKndx)
  {
    SetFaceToCell3(nativeNdx
                  ,iNdx
                  ,jNdx
                  ,kNdx
                  ,faceNdx
                  ,cellCount
                  ,cellRef
                  ,cIndx
                  ,cJndx
                  ,cKndx);
  }

  public void SetFaceToCell(int iNdx,
                            int jNdx,
                            int kNdx,
                            int faceNdx,
                            int cellCount,
                            int[] cellRef,
                            int[] cIndx,
                            int[] cJndx,
                            int[] cKndx)
  {
    SetFaceToCell3i(nativeNdx
                  ,iNdx
                  ,jNdx
                  ,kNdx
                  ,faceNdx
                  ,cellCount
                  ,cellRef
                  ,cIndx
                  ,cJndx
                  ,cKndx);
  }

  public long ReadFaceToCell(long iNdx,
                            long jNdx,
                            long kNdx,
                            long faceNdx,
                            long allocated,
                            long[] cellRef,
                            long[] cIndx,
                            long[] cJndx,
                            long[] cKndx)
  {
    long myReturn = ReadFaceToCell4(nativeNdx
                                  ,iNdx
                                  ,jNdx
                                  ,kNdx
                                  ,faceNdx
                                  ,allocated
                                  ,cellRef
                                  ,cIndx
                                  ,cJndx
                                  ,cKndx);
    return myReturn;
  }

  public int ReadFaceToCell(int iNdx,
                            int jNdx,
                            int kNdx,
                            int faceNdx,
                            int allocated,
                            int[] cellRef,
                            int[] cIndx,
                            int[] cJndx,
                            int[] cKndx)
  {
    int myReturn = ReadFaceToCell4i(nativeNdx
                                  ,iNdx
                                  ,jNdx
                                  ,kNdx
                                  ,faceNdx
                                  ,allocated
                                  ,cellRef
                                  ,cIndx
                                  ,cJndx
                                  ,cKndx);
    return myReturn;
  }

  public long ReadCellToFace(long cRef,
                            long cIndx,
                            long cJndx,
                            long cKndx,
                            long allocated,
                            long[] iNdx,
                            long[] jNdx,
                            long[] kNdx,
                            long[] faceNdx)
  {
    long myReturn = ReadCellToFace5(nativeNdx
                                  ,cRef
                                  ,cIndx
                                  ,cJndx
                                  ,cKndx
                                  ,allocated
                                  ,iNdx
                                  ,jNdx
                                  ,kNdx
                                  ,faceNdx);
    return myReturn;
  }

  public int ReadCellToFace(int cRef,
                            int cIndx,
                            int cJndx,
                            int cKndx,
                            int allocated,
                            int[] iNdx,
                            int[] jNdx,
                            int[] kNdx,
                            int[] faceNdx)
  {
    int myReturn = ReadCellToFace5i(nativeNdx
                                  ,cRef
                                  ,cIndx
                                  ,cJndx
                                  ,cKndx
                                  ,allocated
                                  ,iNdx
                                  ,jNdx
                                  ,kNdx
                                  ,faceNdx);
    return myReturn;
  }

  public boolean IsExterior()
  {
    boolean myReturn = IsExterior6(nativeNdx);
    return myReturn;
  }

  public long FaceCount64()
  {
    long myReturn = FaceCount7(nativeNdx);
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

  public long[] FaceIndx()
  {
    long[] myReturn = FaceIndx8(nativeNdx);
    return myReturn;
  }

  public int[] FaceIndx(boolean throwIfTooBig)
  {
    int[] myReturn = FaceIndx8i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] FaceJndx()
  {
    long[] myReturn = FaceJndx9(nativeNdx);
    return myReturn;
  }

  public int[] FaceJndx(boolean throwIfTooBig)
  {
    int[] myReturn = FaceJndx9i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] FaceKndx()
  {
    long[] myReturn = FaceKndx10(nativeNdx);
    return myReturn;
  }

  public int[] FaceKndx(boolean throwIfTooBig)
  {
    int[] myReturn = FaceKndx10i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] FaceNdx()
  {
    long[] myReturn = FaceNdx11(nativeNdx);
    return myReturn;
  }

  public int[] FaceNdx(boolean throwIfTooBig)
  {
    int[] myReturn = FaceNdx11i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] CellNdx()
  {
    long[] myReturn = CellNdx12(nativeNdx);
    return myReturn;
  }

  public int[] CellNdx(boolean throwIfTooBig)
  {
    int[] myReturn = CellNdx12i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] CellCount()
  {
    long[] myReturn = CellCount13(nativeNdx);
    return myReturn;
  }

  public int[] CellCount(boolean throwIfTooBig)
  {
    int[] myReturn = CellCount13i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long CellMapCount64()
  {
    long myReturn = CellMapCount14(nativeNdx);
    return myReturn;
  }

  public int CellMapCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(CellMapCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int CellMapCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(CellMapCount64(), throwIfTooBig);
  }

  public long[] CellRef()
  {
    long[] myReturn = CellRef15(nativeNdx);
    return myReturn;
  }

  public int[] CellRef(boolean throwIfTooBig)
  {
    int[] myReturn = CellRef15i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] CellIndx()
  {
    long[] myReturn = CellIndx16(nativeNdx);
    return myReturn;
  }

  public int[] CellIndx(boolean throwIfTooBig)
  {
    int[] myReturn = CellIndx16i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] CellJndx()
  {
    long[] myReturn = CellJndx17(nativeNdx);
    return myReturn;
  }

  public int[] CellJndx(boolean throwIfTooBig)
  {
    int[] myReturn = CellJndx17i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] CellKndx()
  {
    long[] myReturn = CellKndx18(nativeNdx);
    return myReturn;
  }

  public int[] CellKndx(boolean throwIfTooBig)
  {
    int[] myReturn = CellKndx18i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] FaceRowNdx()
  {
    long[] myReturn = FaceRowNdx19(nativeNdx);
    return myReturn;
  }

  public int[] FaceRowNdx(boolean throwIfTooBig)
  {
    int[] myReturn = FaceRowNdx19i(nativeNdx, throwIfTooBig);
    return myReturn;
  }


  public void CopyArray(int whichArray,
                        long srcLowBound,
                        long srcCount,
                        long[] preAllocated,
                        long destOffset)
  {
    CopyArray20(nativeNdx
              ,whichArray
              ,srcLowBound
              ,srcCount
              ,preAllocated
              ,destOffset);
  }

  public void CopyArray(int whichArray,
                        int srcLowBound,
                        int srcCount,
                        int[] preAllocated,
                        int destOffset)
  {
    CopyArray20i(nativeNdx
              ,whichArray
              ,srcLowBound
              ,srcCount
              ,preAllocated
              ,destOffset);
  }

  public void Set(long faceCountIn,
                  long[] faceIndxIn,
                  long[] faceJndxIn,
                  long[] faceKndxIn,
                  long[] faceNdxIn,
                  long[] cellNdxIn,
                  long[] cellCountIn,
                  long cellMapCountIn,
                  long[] cellRefIn,
                  long[] cellINdxIn,
                  long[] cellJNdxIn,
                  long[] cellKNdxIn,
                  long[] faceRowNdxIn)
  {
    Set22(nativeNdx
        ,faceCountIn
        ,faceIndxIn
        ,faceJndxIn
        ,faceKndxIn
        ,faceNdxIn
        ,cellNdxIn
        ,cellCountIn
        ,cellMapCountIn
        ,cellRefIn
        ,cellINdxIn
        ,cellJNdxIn
        ,cellKNdxIn
        ,faceRowNdxIn);
  }

  public void Set(int faceCountIn,
                  int[] faceIndxIn,
                  int[] faceJndxIn,
                  int[] faceKndxIn,
                  int[] faceNdxIn,
                  int[] cellNdxIn,
                  int[] cellCountIn,
                  int cellMapCountIn,
                  int[] cellRefIn,
                  int[] cellINdxIn,
                  int[] cellJNdxIn,
                  int[] cellKNdxIn,
                  int[] faceRowNdxIn)
  {
    Set22i(nativeNdx
        ,faceCountIn
        ,faceIndxIn
        ,faceJndxIn
        ,faceKndxIn
        ,faceNdxIn
        ,cellNdxIn
        ,cellCountIn
        ,cellMapCountIn
        ,cellRefIn
        ,cellINdxIn
        ,cellJNdxIn
        ,cellKNdxIn
        ,faceRowNdxIn);
  }
  public cSetRescueDataContainer DataContainers()
  {
    long returnNdx = DataContainers23(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      cSetRescueDataContainer myReturn = new cSetRescueDataContainer(returnNdx);
      return myReturn;
    }
  }

  public cSetRescueDataContainer DemandDataContainers()
  {
    long returnNdx = DemandDataContainers24(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      cSetRescueDataContainer myReturn = new cSetRescueDataContainer(returnNdx);
      return myReturn;
    }
  }

  private native long Create_RescueInterfaceSurfaceDesc0(long lgrGeometry,
                                                        boolean isExteriorIn,
                                                        long expectedFaces,
                                                        long expectedCells,
                                                        long facesRealloc,
                                                        long cellsRealloc);
  private native void Delete_RescueInterfaceSurfaceDesc(long ndx);
  private native void SetIsExterior2(long refNdx
                                    ,boolean newState);
  private native void SetFaceToCell3(long refNdx
                                    ,long iNdx
                                    ,long jNdx
                                    ,long kNdx
                                    ,long faceNdx
                                    ,long cellCount
                                    ,long[] cellRef
                                    ,long[] cIndx
                                    ,long[] cJndx
                                    ,long[] cKndx);
  private native void SetFaceToCell3i(long refNdx
                                    ,int iNdx
                                    ,int jNdx
                                    ,int kNdx
                                    ,int faceNdx
                                    ,int cellCount
                                    ,int[] cellRef
                                    ,int[] cIndx
                                    ,int[] cJndx
                                    ,int[] cKndx);
  private native long ReadFaceToCell4(long refNdx
                                    ,long iNdx
                                    ,long jNdx
                                    ,long kNdx
                                    ,long faceNdx
                                    ,long allocated
                                    ,long[] cellRef
                                    ,long[] cIndx
                                    ,long[] cJndx
                                    ,long[] cKndx);
  private native int ReadFaceToCell4i(long refNdx
                                    ,int iNdx
                                    ,int jNdx
                                    ,int kNdx
                                    ,int faceNdx
                                    ,int allocated
                                    ,int[] cellRef
                                    ,int[] cIndx
                                    ,int[] cJndx
                                    ,int[] cKndx);
  private native long ReadCellToFace5(long refNdx
                                    ,long cRef
                                    ,long cIndx
                                    ,long cJndx
                                    ,long cKndx
                                    ,long allocated
                                    ,long[] iNdx
                                    ,long[] jNdx
                                    ,long[] kNdx
                                    ,long[] faceNdx);
  private native int ReadCellToFace5i(long refNdx
                                    ,int cRef
                                    ,int cIndx
                                    ,int cJndx
                                    ,int cKndx
                                    ,int allocated
                                    ,int[] iNdx
                                    ,int[] jNdx
                                    ,int[] kNdx
                                    ,int[] faceNdx);
  private native boolean IsExterior6(long refNdx);
  private native long FaceCount7(long refNdx);
  private native long[] FaceIndx8(long refNdx);
  private native long[] FaceJndx9(long refNdx);
  private native long[] FaceKndx10(long refNdx);
  private native long[] FaceNdx11(long refNdx);
  private native long[] CellNdx12(long refNdx);
  private native long[] CellCount13(long refNdx);
  private native int[] FaceIndx8i(long refNdx, boolean throwIfTooBig);
  private native int[] FaceJndx9i(long refNdx, boolean throwIfTooBig);
  private native int[] FaceKndx10i(long refNdx, boolean throwIfTooBig);
  private native int[] FaceNdx11i(long refNdx, boolean throwIfTooBig);
  private native int[] CellNdx12i(long refNdx, boolean throwIfTooBig);
  private native int[] CellCount13i(long refNdx, boolean throwIfTooBig);
  private native long CellMapCount14(long refNdx);
  private native long[] CellRef15(long refNdx);
  private native long[] CellIndx16(long refNdx);
  private native long[] CellJndx17(long refNdx);
  private native long[] CellKndx18(long refNdx);
  private native long[] FaceRowNdx19(long refNdx);
  private native int[] CellRef15i(long refNdx, boolean throwIfTooBig);
  private native int[] CellIndx16i(long refNdx, boolean throwIfTooBig);
  private native int[] CellJndx17i(long refNdx, boolean throwIfTooBig);
  private native int[] CellKndx18i(long refNdx, boolean throwIfTooBig);
  private native int[] FaceRowNdx19i(long refNdx, boolean throwIfTooBig);
  private native void CopyArray20(long refNdx
                                 ,int whichArray
                                 ,long srcLowBound
                                 ,long srcCount
                                 ,long[] preAllocated
                                 ,long destOffset);
  private native void CopyArray20i(long refNdx
                                 ,int whichArray
                                 ,int srcLowBound
                                 ,int srcCount
                                 ,int[] preAllocated
                                 ,int destOffset);
  private native void Set22(long refNdx
                           ,long faceCountIn
                           ,long[] faceIndxIn
                           ,long[] faceJndxIn
                           ,long[] faceKndxIn
                           ,long[] faceNdxIn
                           ,long[] cellNdxIn
                           ,long[] cellCountIn
                           ,long cellMapCountIn
                           ,long[] cellRefIn
                           ,long[] cellINdxIn
                           ,long[] cellJNdxIn
                           ,long[] cellKNdxIn
                           ,long[] faceRowNdxIn);
  private native void Set22i(long refNdx
                           ,int faceCountIn
                           ,int[] faceIndxIn
                           ,int[] faceJndxIn
                           ,int[] faceKndxIn
                           ,int[] faceNdxIn
                           ,int[] cellNdxIn
                           ,int[] cellCountIn
                           ,int cellMapCountIn
                           ,int[] cellRefIn
                           ,int[] cellINdxIn
                           ,int[] cellJNdxIn
                           ,int[] cellKNdxIn
                           ,int[] faceRowNdxIn);
  private native long DataContainers23(long refNdx);
  private native long DemandDataContainers24(long refNdx);
}
