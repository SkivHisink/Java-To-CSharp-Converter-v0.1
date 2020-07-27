package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueParametricLGRMap.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueParametricLGRMap extends RjniBaseClass
{

  public static final int LGR_I_NDX = 0;
  public static final int LGR_J_NDX = 1;
  public static final int LGR_K_NDX = 2;
  public static final int PARENT_NDX = 3;
  public static final int PARENT_COUNT = 4;
  public static final int PARENT_I_NDX = 5;
  public static final int PARENT_J_NDX = 6;
  public static final int PARENT_K_NDX = 7;
  public static final int LGR_NDX = 8;

  protected RescueParametricLGRMap(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueParametricLGRMap(RescueGeometry lgrGeometry,
                                long expectedRefined,
                                long expectedParent,
                                long refinedRealloc,
                                long parentRealloc)
  {
    nativeNdx = Create_RescueParametricLGRMap0((lgrGeometry == null) ? 0 : lgrGeometry.nativeNdx,
                                               expectedRefined,
                                               expectedParent,
                                               refinedRealloc,
                                               parentRealloc);
  }

  public void dispose()
  {
    Delete_RescueParametricLGRMap(nativeNdx);
  }

  public void ClearMap()
  {
    ClearMap2(nativeNdx);
  }

  public void SetCellToCell(long iNdx,
                            long jNdx,
                            long kNdx,
                            long parentCount,
                            long[] pIndx,
                            long[] pJndx,
                            long[] pKndx)
  {
    SetCellToCell3(nativeNdx
                  ,iNdx
                  ,jNdx
                  ,kNdx
                  ,parentCount
                  ,pIndx
                  ,pJndx
                  ,pKndx);
  }

  public void SetCellToCell(int iNdx,
                            int jNdx,
                            int kNdx,
                            int parentCount,
                            int[] pIndx,
                            int[] pJndx,
                            int[] pKndx)
  {
    SetCellToCell3i(nativeNdx
                  ,iNdx
                  ,jNdx
                  ,kNdx
                  ,parentCount
                  ,pIndx
                  ,pJndx
                  ,pKndx);
  }

  public long ReadLGRCellToCell(long iNdx,
                               long jNdx,
                               long kNdx,
                               long allocated,
                               long[] pIndx,
                               long[] pJndx,
                               long[] pKndx)
  {
    long myReturn = ReadLGRCellToCell4(nativeNdx
                                     ,iNdx
                                     ,jNdx
                                     ,kNdx
                                     ,allocated
                                     ,pIndx
                                     ,pJndx
                                     ,pKndx);
    return myReturn;
  }

  public int ReadLGRCellToCell(int iNdx,
                               int jNdx,
                               int kNdx,
                               int allocated,
                               int[] pIndx,
                               int[] pJndx,
                               int[] pKndx)
  {
    int myReturn = ReadLGRCellToCell4i(nativeNdx
                                     ,iNdx
                                     ,jNdx
                                     ,kNdx
                                     ,allocated
                                     ,pIndx
                                     ,pJndx
                                     ,pKndx);
    return myReturn;
  }

  public long ReadParentCellToCell(long iNdx,
                                  long jNdx,
                                  long kNdx,
                                  long allocated,
                                  long[] cIndx,
                                  long[] cJndx,
                                  long[] cKndx)
  {
    long myReturn = ReadParentCellToCell5(nativeNdx
                                        ,iNdx
                                        ,jNdx
                                        ,kNdx
                                        ,allocated
                                        ,cIndx
                                        ,cJndx
                                        ,cKndx);
    return myReturn;
  }

  public int ReadParentCellToCell(int iNdx,
                                  int jNdx,
                                  int kNdx,
                                  int allocated,
                                  int[] cIndx,
                                  int[] cJndx,
                                  int[] cKndx)
  {
    int myReturn = ReadParentCellToCell5i(nativeNdx
                                        ,iNdx
                                        ,jNdx
                                        ,kNdx
                                        ,allocated
                                        ,cIndx
                                        ,cJndx
                                        ,cKndx);
    return myReturn;
  }

  public long CellToCellMapCount64()
  {
    long myReturn = CellToCellMapCount6(nativeNdx);
    return myReturn;
  }

  public int CellToCellMapCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(CellToCellMapCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int CellToCellMapCount(boolean throwIfTooBig)
  {
    return RescueContext.Return32For64(CellToCellMapCount64(), throwIfTooBig);
  }

  public int[] LGRIndx()
  {
    int[] myReturn = LGRIndx7i(nativeNdx, true);
    return myReturn;
  }

  public long[] LGRIndx64()
  {
    long[] myReturn = LGRIndx7(nativeNdx);
    return myReturn;
  }

  public int[] LGRIndx(boolean throwIfTooBig)
  {
    int[] myReturn = LGRIndx7i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public int[] LGRJndx()
  {
    int[] myReturn = LGRJndx8i(nativeNdx, true);
    return myReturn;
  }

  public long[] LGRJndx64()
  {
    long[] myReturn = LGRJndx8(nativeNdx);
    return myReturn;
  }

  public int[] LGRJndx(boolean throwIfTooBig)
  {
    int[] myReturn = LGRJndx8i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public int[] LGRKndx()
  {
    int[] myReturn = LGRKndx9i(nativeNdx, true);
    return myReturn;
  }

  public long[] LGRKndx64()
  {
    long[] myReturn = LGRKndx9(nativeNdx);
    return myReturn;
  }

  public int[] LGRKndx(boolean throwIfTooBig)
  {
    int[] myReturn = LGRKndx9i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] ParentNdx()
  {
    long[] myReturn = ParentNdx10(nativeNdx);
    return myReturn;
  }

  public int[] ParentNdx(boolean throwIfTooBig)
  {
    int[] myReturn = ParentNdx10i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public int[] ParentCount()
  {
    int[] myReturn = ParentCount11i(nativeNdx, true);
    return myReturn;
  }

  public long[] ParentCount64()
  {
    long[] myReturn = ParentCount11(nativeNdx);
    return myReturn;
  }

  public int[] ParentCount(boolean throwIfTooBig)
  {
    int[] myReturn = ParentCount11i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long ParentMapCount64()
  {
    long myReturn = ParentMapCount12(nativeNdx);
    return myReturn;
  }

  public int ParentMapCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(ParentMapCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int ParentMapCount(boolean throwIfTooBig)
  {
    return RescueContext.Return32For64(ParentMapCount64(), throwIfTooBig);
  }

  public int[] ParentINdx()
  {
    int[] myReturn = ParentINdx13i(nativeNdx, true);
    return myReturn;
  }

  public long[] ParentINdx64()
  {
    long[] myReturn = ParentINdx13(nativeNdx);
    return myReturn;
  }

  public int[] ParentINdx(boolean throwIfTooBig)
  {
    int[] myReturn = ParentINdx13i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public int[] ParentJNdx()
  {
    int[] myReturn = ParentJNdx14i(nativeNdx, true);
    return myReturn;
  }

  public long[] ParentJNdx64()
  {
    long[] myReturn = ParentJNdx14(nativeNdx);
    return myReturn;
  }

  public int[] ParentJNdx(boolean throwIfTooBig)
  {
    int[] myReturn = ParentJNdx14i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public int[] ParentKNdx()
  {
    int[] myReturn = ParentKNdx15i(nativeNdx, true);
    return myReturn;
  }

  public long[] ParentKNdx64()
  {
    long[] myReturn = ParentKNdx15(nativeNdx);
    return myReturn;
  }

  public int[] ParentKNdx(boolean throwIfTooBig)
  {
    int[] myReturn = ParentKNdx15i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] LGRNdx()
  {
    long[] myReturn = LGRNdx16(nativeNdx);
    return myReturn;
  }

  public int[] LGRNdx(boolean throwIfTooBig)
  {
    int[] myReturn = LGRNdx16i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public void CopyArray(int whichArray,
                        long srcLowBound,
                        long srcCount,
                        long[] preAllocated,
                        long destOffset)
  {
    CopyArray17(nativeNdx
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
    CopyArray17i(nativeNdx
              ,whichArray
              ,srcLowBound
              ,srcCount
              ,preAllocated
              ,destOffset);
  }

  public void Set(long cellToCellCount,
                  long[] lgrIndxIn,
                  long[] lgrJndxIn,
                  long[] lgrKndxIn,
                  long[] parentNdxIn,
                  long[] parentCountIn,
                  long parentMapCount,
                  long[] parentIndxIn,
                  long[] parentJndxIn,
                  long[] parentKndxIn,
                  long[] lgrNdxIn)
  {
    Set19(nativeNdx
        ,cellToCellCount
        ,lgrIndxIn
        ,lgrJndxIn
        ,lgrKndxIn
        ,parentNdxIn
        ,parentCountIn
        ,parentMapCount
        ,parentIndxIn
        ,parentJndxIn
        ,parentKndxIn
        ,lgrNdxIn);
  }

  public void Set(int cellToCellCount,
                  int[] lgrIndxIn,
                  int[] lgrJndxIn,
                  int[] lgrKndxIn,
                  int[] parentNdxIn,
                  int[] parentCountIn,
                  int parentMapCount,
                  int[] parentIndxIn,
                  int[] parentJndxIn,
                  int[] parentKndxIn,
                  int[] lgrNdxIn)
  {
    Set19i(nativeNdx
        ,cellToCellCount
        ,lgrIndxIn
        ,lgrJndxIn
        ,lgrKndxIn
        ,parentNdxIn
        ,parentCountIn
        ,parentMapCount
        ,parentIndxIn
        ,parentJndxIn
        ,parentKndxIn
        ,lgrNdxIn);
  }

  public cSetRescueDataContainer DataContainers()
  {
    long returnNdx = DataContainers20(nativeNdx);
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
    long returnNdx = DemandDataContainers21(nativeNdx);
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

  private native long Create_RescueParametricLGRMap0(long lgrGeometry,
                                                    long expectedRefined,
                                                    long expectedParent,
                                                    long refinedRealloc,
                                                    long parentRealloc);
  private native void Delete_RescueParametricLGRMap(long ndx);
  private native void ClearMap2(long refNdx);
  private native void SetCellToCell3(long refNdx
                                    ,long iNdx
                                    ,long jNdx
                                    ,long kNdx
                                    ,long parentCount
                                    ,long[] pIndx
                                    ,long[] pJndx
                                    ,long[] pKndx);
  private native void SetCellToCell3i(long refNdx
                                    ,int iNdx
                                    ,int jNdx
                                    ,int kNdx
                                    ,int parentCount
                                    ,int[] pIndx
                                    ,int[] pJndx
                                    ,int[] pKndx);
  private native long ReadLGRCellToCell4(long refNdx
                                       ,long iNdx
                                       ,long jNdx
                                       ,long kNdx
                                       ,long allocated
                                       ,long[] pIndx
                                       ,long[] pJndx
                                       ,long[] pKndx);
  private native int ReadLGRCellToCell4i(long refNdx
                                       ,int iNdx
                                       ,int jNdx
                                       ,int kNdx
                                       ,int allocated
                                       ,int[] pIndx
                                       ,int[] pJndx
                                       ,int[] pKndx);
  private native long ReadParentCellToCell5(long refNdx
                                          ,long iNdx
                                          ,long jNdx
                                          ,long kNdx
                                          ,long allocated
                                          ,long[] cIndx
                                          ,long[] cJndx
                                          ,long[] cKndx);
  private native int ReadParentCellToCell5i(long refNdx
                                          ,int iNdx
                                          ,int jNdx
                                          ,int kNdx
                                          ,int allocated
                                          ,int[] cIndx
                                          ,int[] cJndx
                                          ,int[] cKndx);
  private native long CellToCellMapCount6(long refNdx);
  private native long[] LGRIndx7(long refNdx);
  private native int[] LGRIndx7i(long refNdx, boolean throwIfTooBig);
  private native long[] LGRJndx8(long refNdx);
  private native int[] LGRJndx8i(long refNdx, boolean throwIfTooBig);
  private native long[] LGRKndx9(long refNdx);
  private native int[] LGRKndx9i(long refNdx, boolean throwIfTooBig);
  private native long[] ParentNdx10(long refNdx);
  private native int[] ParentNdx10i(long refNdx, boolean throwIfTooBig);
  private native long[] ParentCount11(long refNdx);
  private native int[] ParentCount11i(long refNdx, boolean throwIfTooBig);
  private native long ParentMapCount12(long refNdx);
  private native long[] ParentINdx13(long refNdx);
  private native int[] ParentINdx13i(long refNdx, boolean throwIfTooBig);
  private native long[] ParentJNdx14(long refNdx);
  private native int[] ParentJNdx14i(long refNdx, boolean throwIfTooBig);
  private native long[] ParentKNdx15(long refNdx);
  private native int[] ParentKNdx15i(long refNdx, boolean throwIfTooBig);
  private native long[] LGRNdx16(long refNdx);
  private native int[] LGRNdx16i(long refNdx, boolean throwIfTooBig);
  private native void CopyArray17(long refNdx
                                 ,int whichArray
                                 ,long srcLowBound
                                 ,long srcCount
                                 ,long[] preAllocated
                                 ,long destOffset);
  private native void CopyArray17i(long refNdx
                                 ,int whichArray
                                 ,int srcLowBound
                                 ,int srcCount
                                 ,int[] preAllocated
                                 ,int destOffset);
  private native void Set19(long refNdx
                           ,long cellToCellCount
                           ,long[] lgrIndxIn
                           ,long[] lgrJndxIn
                           ,long[] lgrKndxIn
                           ,long[] parentNdxIn
                           ,long[] parentCountIn
                           ,long parentMapCount
                           ,long[] parentIndxIn
                           ,long[] parentJndxIn
                           ,long[] parentKndxIn
                           ,long[] lgrNdxIn);
  private native void Set19i(long refNdx
                           ,int cellToCellCount
                           ,int[] lgrIndxIn
                           ,int[] lgrJndxIn
                           ,int[] lgrKndxIn
                           ,int[] parentNdxIn
                           ,int[] parentCountIn
                           ,int parentMapCount
                           ,int[] parentIndxIn
                           ,int[] parentJndxIn
                           ,int[] parentKndxIn
                           ,int[] lgrNdxIn);
  private native long DataContainers20(long refNdx);
  private native long DemandDataContainers21(long refNdx);
}
