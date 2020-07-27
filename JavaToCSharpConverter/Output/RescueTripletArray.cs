using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueTripletArray : RescueObject
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

  public int RescueGetXValueLength(bool throwIfTooBig) //thro RuntimeException
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

  public int RescueGetYValueLength(bool throwIfTooBig) //thro RuntimeException
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

  public int RescueGetZValueLength(bool throwIfTooBig) //thro RuntimeException
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

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType21(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public bool IsRegular(long which)
  {
    bool myReturn = IsRegular22(nativeNdx
                                    ,which);
    return myReturn;
  }

  public bool IsCalculated(long which)
  {
    bool myReturn = IsCalculated23(nativeNdx
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

  public bool HasSplitNodes()
  {
    bool myReturn = HasSplitNodes29(nativeNdx);
    return myReturn;
  }

  public bool IsSplit(long i,
                            long j)
  {
    bool myReturn = IsSplit30(nativeNdx
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

  public bool IsLoaded()
  {
    bool myReturn = IsLoaded34(nativeNdx);
    return myReturn;
  }

  public bool Load()
  {
    bool myReturn = Load35(nativeNdx);
    return myReturn;
  }

  public bool FileTruncated()
  {
    bool myReturn = FileTruncated36(nativeNdx);
    return myReturn;
  }

  public bool Unload()
  {
    bool myReturn = Unload37(nativeNdx);
    return myReturn;
  }

  public bool HasChanged()
  {
    bool myReturn = HasChanged38(nativeNdx);
    return myReturn;
  }

  public void MarkChanged()
  {
    MarkChanged39(nativeNdx);
  }

  public long Version(bool reload)
  {
    long myReturn = Version40(nativeNdx
                           ,reload);
    return myReturn;
  }

  public int Version(bool reload, bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(Version(reload), throwIfTooBig);
  }

  public void EnsureLoaded()
  {
    EnsureLoadedNative(nativeNdx);
  }

}

}