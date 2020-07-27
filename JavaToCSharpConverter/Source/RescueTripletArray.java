package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueTripletArray.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueTripletArray extends RescueObject
{


  public RescueTripletArray(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  protected RescueTripletArray()
  {
  }

  public RescueTripletArray(RescueContext context,
                            RescueGrid existingGrid,
                            float missingValueIn,
                            RescueModel parentModelIn)
  {
    nativeNdx = Create_RescueTripletArray0((context == null) ? 0 : context.nativeNdx,
                                           (existingGrid == null) ? 0 : existingGrid.nativeNdx,
                                           missingValueIn,
                                           (parentModelIn == null) ? 0 : parentModelIn.nativeNdx);
  }

  public RescueTripletArray(RescueGrid existingGrid,
                            float missingValueIn,
                            float[] valueArray,
                            RescueModel parentModelIn)
  {
    nativeNdx = Create_RescueTripletArray1((existingGrid == null) ? 0 : existingGrid.nativeNdx,
                                           missingValueIn,
                                           valueArray,
                                           (parentModelIn == null) ? 0 : parentModelIn.nativeNdx);
  }

  public void dispose()
  {
    Delete_RescueTripletArray(nativeNdx);
  }

  public RescueGrid Grid()
  {
    long returnNdx = Grid3(nativeNdx);
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

  public float MissingValue()
  {
    float myReturn = MissingValue4(nativeNdx);
    return myReturn;
  }

  public void SetValue(float nullValueIn,
                       float[] valueArray)
  {
    SetValue5(nativeNdx
             ,nullValueIn
             ,valueArray);
  }

  public void AssignXValue(float[] valueArray)
  {
    AssignXValue6(nativeNdx
                 ,valueArray);
  }

  public void AssignYValue(float[] valueArray)
  {
    AssignYValue7(nativeNdx
                 ,valueArray);
  }

  public void AssignZValue(float[] valueArray)
  {
    AssignZValue8(nativeNdx
                 ,valueArray);
  }

  public void SetXValue(float[] valueArray)
  {
    SetXValue9(nativeNdx
              ,valueArray);
  }

  public void SetYValue(float[] valueArray)
  {
    SetYValue10(nativeNdx
              ,valueArray);
  }

  public void SetZValue(float[] valueArray)
  {
    SetZValue11(nativeNdx
              ,valueArray);
  }

  public float[] RescueGetXValue()
  {
    float[] myReturn = RescueGetXValue12(nativeNdx);
    return myReturn;
  }

  public float[] RescueGetYValue()
  {
    float[] myReturn = RescueGetYValue13(nativeNdx);
    return myReturn;
  }

  public float[] RescueGetZValue()
  {
    float[] myReturn = RescueGetZValue14(nativeNdx);
    return myReturn;
  }

  public long RescueGetXValueLength64()
  {
    long myReturn = RescueGetXValueLength15(nativeNdx);
    return myReturn;
  }

  public int RescueGetXValueLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(RescueGetXValueLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int RescueGetXValueLength(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(RescueGetXValueLength64(), throwIfTooBig);
  }

  public long RescueGetYValueLength64()
  {
    long myReturn = RescueGetYValueLength16(nativeNdx);
    return myReturn;
  }

  public int RescueGetYValueLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(RescueGetYValueLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int RescueGetYValueLength(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(RescueGetYValueLength64(), throwIfTooBig);
  }

  public long RescueGetZValueLength64()
  {
    long myReturn = RescueGetZValueLength17(nativeNdx);
    return myReturn;
  }

  public int RescueGetZValueLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(RescueGetZValueLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int RescueGetZValueLength(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(RescueGetZValueLength64(), throwIfTooBig);
  }

  public void XValues(float[] buffer,
                      long offset,
                      long valueCount)
  {
    XValues18(nativeNdx
            ,buffer
            ,offset
            ,valueCount);
  }

  public void YValues(float[] buffer,
                      long offset,
                      long valueCount)
  {
    YValues19(nativeNdx
            ,buffer
            ,offset
            ,valueCount);
  }

  public void ZValues(float[] buffer,
                      long offset,
                      long valueCount)
  {
    ZValues20(nativeNdx
            ,buffer
            ,offset
            ,valueCount);
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType21(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public boolean IsRegular(long which)
  {
    boolean myReturn = IsRegular22(nativeNdx
                                    ,which);
    return myReturn;
  }

  public boolean IsCalculated(long which)
  {
    boolean myReturn = IsCalculated23(nativeNdx
                                       ,which);
    return myReturn;
  }

  public RescueModel ParentModel()
  {
    long returnNdx = ParentModel27(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueModel myReturn = new RescueModel(returnNdx);
      return myReturn;
    }
  }

  public boolean HasSplitNodes()
  {
    boolean myReturn = HasSplitNodes29(nativeNdx);
    return myReturn;
  }

  public boolean IsSplit(long i,
                            long j)
  {
    boolean myReturn = IsSplit30(nativeNdx
                                  ,i
                                  ,j);
    return myReturn;
  }

  public void SetXYZCorner(long i,
                           long j,
                           long faceNumber,
                           float x,
                           float y,
                           float z)
  {
    SetXYZCorner31(nativeNdx
                 ,i
                 ,j
                 ,faceNumber
                 ,x
                 ,y
                 ,z);
  }

  public void ClearSplitNode(long i,
                             long j)
  {
    ClearSplitNode32(nativeNdx
                   ,i
                   ,j);
  }

  public void ClearSplitNodes()
  {
    ClearSplitNodes33(nativeNdx);
  }

  public boolean IsLoaded()
  {
    boolean myReturn = IsLoaded34(nativeNdx);
    return myReturn;
  }

  public boolean Load()
  {
    boolean myReturn = Load35(nativeNdx);
    return myReturn;
  }

  public boolean FileTruncated()
  {
    boolean myReturn = FileTruncated36(nativeNdx);
    return myReturn;
  }

  public boolean Unload()
  {
    boolean myReturn = Unload37(nativeNdx);
    return myReturn;
  }

  public boolean HasChanged()
  {
    boolean myReturn = HasChanged38(nativeNdx);
    return myReturn;
  }

  public void MarkChanged()
  {
    MarkChanged39(nativeNdx);
  }

  public long Version(boolean reload)
  {
    long myReturn = Version40(nativeNdx
                           ,reload);
    return myReturn;
  }

  public int Version(boolean reload, boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(Version(reload), throwIfTooBig);
  }

  public void EnsureLoaded()
  {
    EnsureLoadedNative(nativeNdx);
  }

  private native void EnsureLoadedNative(long refNdx);
  private native long Create_RescueTripletArray0(long context,
                                                long existingGrid,
                                                float missingValueIn,
                                                long parentModelIn);
  private native long Create_RescueTripletArray1(long existingGrid,
                                                float missingValueIn,
                                                float[] valueArray,
                                                long parentModelIn);
  private native void Delete_RescueTripletArray(long ndx);
  private native long Grid3(long refNdx);
  private native float MissingValue4(long refNdx);
  private native void SetValue5(long refNdx
                               ,float nullValueIn
                               ,float[] valueArray);
  private native void AssignXValue6(long refNdx
                                   ,float[] valueArray);
  private native void AssignYValue7(long refNdx
                                   ,float[] valueArray);
  private native void AssignZValue8(long refNdx
                                   ,float[] valueArray);
  private native void SetXValue9(long refNdx
                                ,float[] valueArray);
  private native void SetYValue10(long refNdx
                                 ,float[] valueArray);
  private native void SetZValue11(long refNdx
                                 ,float[] valueArray);
  private native float[] RescueGetXValue12(long refNdx);
  private native float[] RescueGetYValue13(long refNdx);
  private native float[] RescueGetZValue14(long refNdx);
  private native long RescueGetXValueLength15(long refNdx);
  private native long RescueGetYValueLength16(long refNdx);
  private native long RescueGetZValueLength17(long refNdx);
  private native void XValues18(long refNdx
                               ,float[] buffer
                               ,long offset
                               ,long valueCount);
  private native void YValues19(long refNdx
                               ,float[] buffer
                               ,long offset
                               ,long valueCount);
  private native void ZValues20(long refNdx
                               ,float[] buffer
                               ,long offset
                               ,long valueCount);
  private native boolean IsOfType21(long refNdx
                                   ,int thisType);
  private native boolean IsRegular22(long refNdx
                                    ,long which);
  private native boolean IsCalculated23(long refNdx
                                       ,long which);
  private native long ParentModel27(long refNdx);
  private native boolean HasSplitNodes29(long refNdx);
  private native boolean IsSplit30(long refNdx
                                  ,long i
                                  ,long j);
  private native void SetXYZCorner31(long refNdx
                                    ,long i
                                    ,long j
                                    ,long faceNumber
                                    ,float x
                                    ,float y
                                    ,float z);
  private native void ClearSplitNode32(long refNdx
                                      ,long i
                                      ,long j);
  private native void ClearSplitNodes33(long refNdx);
  private native boolean IsLoaded34(long refNdx);
  private native boolean Load35(long refNdx);
  private native boolean FileTruncated36(long refNdx);
  private native boolean Unload37(long refNdx);
  private native boolean HasChanged38(long refNdx);
  private native void MarkChanged39(long refNdx);
  private native long Version40(long refNdx
                              ,boolean reload);
}
