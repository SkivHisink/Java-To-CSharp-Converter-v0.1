using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueInterfaceSurfaceDesc : RjniBaseClass
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
                                    bool isExteriorIn,
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

  public void SetIsExterior(bool newState)
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

  public bool IsExterior()
  {
    bool myReturn = IsExterior6(nativeNdx);
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

  public int FaceCount(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(FaceCount64(), throwIfTooBig);
  }

  public long[] FaceIndx()
  {
    long[] myReturn = FaceIndx8(nativeNdx);
    return myReturn;
  }

  public int[] FaceIndx(bool throwIfTooBig)
  {
    int[] myReturn = FaceIndx8i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] FaceJndx()
  {
    long[] myReturn = FaceJndx9(nativeNdx);
    return myReturn;
  }

  public int[] FaceJndx(bool throwIfTooBig)
  {
    int[] myReturn = FaceJndx9i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] FaceKndx()
  {
    long[] myReturn = FaceKndx10(nativeNdx);
    return myReturn;
  }

  public int[] FaceKndx(bool throwIfTooBig)
  {
    int[] myReturn = FaceKndx10i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] FaceNdx()
  {
    long[] myReturn = FaceNdx11(nativeNdx);
    return myReturn;
  }

  public int[] FaceNdx(bool throwIfTooBig)
  {
    int[] myReturn = FaceNdx11i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] CellNdx()
  {
    long[] myReturn = CellNdx12(nativeNdx);
    return myReturn;
  }

  public int[] CellNdx(bool throwIfTooBig)
  {
    int[] myReturn = CellNdx12i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] CellCount()
  {
    long[] myReturn = CellCount13(nativeNdx);
    return myReturn;
  }

  public int[] CellCount(bool throwIfTooBig)
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

  public int CellMapCount(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(CellMapCount64(), throwIfTooBig);
  }

  public long[] CellRef()
  {
    long[] myReturn = CellRef15(nativeNdx);
    return myReturn;
  }

  public int[] CellRef(bool throwIfTooBig)
  {
    int[] myReturn = CellRef15i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] CellIndx()
  {
    long[] myReturn = CellIndx16(nativeNdx);
    return myReturn;
  }

  public int[] CellIndx(bool throwIfTooBig)
  {
    int[] myReturn = CellIndx16i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] CellJndx()
  {
    long[] myReturn = CellJndx17(nativeNdx);
    return myReturn;
  }

  public int[] CellJndx(bool throwIfTooBig)
  {
    int[] myReturn = CellJndx17i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] CellKndx()
  {
    long[] myReturn = CellKndx18(nativeNdx);
    return myReturn;
  }

  public int[] CellKndx(bool throwIfTooBig)
  {
    int[] myReturn = CellKndx18i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] FaceRowNdx()
  {
    long[] myReturn = FaceRowNdx19(nativeNdx);
    return myReturn;
  }

  public int[] FaceRowNdx(bool throwIfTooBig)
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

}

}