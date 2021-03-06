package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueQuadrupletArray.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueQuadrupletArray extends RescueTripletArray
{


  protected RescueQuadrupletArray(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueQuadrupletArray(RescueContext context,
                               RescueGrid existingGrid,
                               float missingValueIn,
                               RescueModel parentModelIn)
  {
    nativeNdx = Create_RescueQuadrupletArray0((context == null) ? 0 : context.nativeNdx,
                                              (existingGrid == null) ? 0 : existingGrid.nativeNdx,
                                              missingValueIn,
                                              (parentModelIn == null) ? 0 : parentModelIn.nativeNdx);
  }

  public RescueQuadrupletArray(RescueGrid existingGrid,
                               float missingValueIn,
                               float[] valueArray,
                               RescueModel parentModelIn)
  {
    nativeNdx = Create_RescueQuadrupletArray1((existingGrid == null) ? 0 : existingGrid.nativeNdx,
                                              missingValueIn,
                                              valueArray,
                                              (parentModelIn == null) ? 0 : parentModelIn.nativeNdx);
  }

  public void dispose()
  {
    Delete_RescueQuadrupletArray(nativeNdx);
  }

  public void SetValue(float nullValueIn,
                       float[] valueArray)
  {
    SetValue3(nativeNdx
             ,nullValueIn
             ,valueArray);
  }

  public void AssignMDValue(float[] valueArray)
  {
    AssignMDValue4(nativeNdx
                  ,valueArray);
  }

  public void SetMDValue(float[] valueArray)
  {
    SetMDValue5(nativeNdx
               ,valueArray);
  }

  public long MDValueLength64()
  {
    long myReturn = MDValueLength6(nativeNdx);
    return myReturn;
  }

  public int MDValueLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(MDValueLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int MDValueLength(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(MDValueLength64(), throwIfTooBig);
  }

  public float[] MDValue()
  {
    float[] myReturn = MDValue7(nativeNdx);
    return myReturn;
  }

  public void MDValues(float[] buffer,
                       long offset,
                       long valueCount)
  {
    MDValues8(nativeNdx
             ,buffer
             ,offset
             ,valueCount);
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType9(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native long Create_RescueQuadrupletArray0(long context,
                                                   long existingGrid,
                                                   float missingValueIn,
                                                   long parentModelIn);
  private native long Create_RescueQuadrupletArray1(long existingGrid,
                                                   float missingValueIn,
                                                   float[] valueArray,
                                                   long parentModelIn);
  private native void Delete_RescueQuadrupletArray(long ndx);
  private native void SetValue3(long refNdx
                               ,float nullValueIn
                               ,float[] valueArray);
  private native void AssignMDValue4(long refNdx
                                    ,float[] valueArray);
  private native void SetMDValue5(long refNdx
                                 ,float[] valueArray);
  private native long MDValueLength6(long refNdx);
  private native float[] MDValue7(long refNdx);
  private native void MDValues8(long refNdx
                               ,float[] buffer
                               ,long offset
                               ,long valueCount);
  private native boolean IsOfType9(long refNdx
                                  ,int thisType);
}
