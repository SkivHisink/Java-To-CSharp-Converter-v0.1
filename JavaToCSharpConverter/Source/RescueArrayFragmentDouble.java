package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueArrayFragmentDouble.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueArrayFragmentDouble extends RescueArrayFragment
{


  protected RescueArrayFragmentDouble(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueArrayFragmentDouble(nativeNdx);
  }

  public long ValueLength64()
  {
    long myReturn = ValueLength1d(nativeNdx);
    return myReturn;
  }

  public int ValueLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(ValueLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int ValueLength(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(ValueLength64(), throwIfTooBig);
  }

  public double[] Value()
  {
    double[] myReturn = Value2d(nativeNdx);
    return myReturn;
  }

  public void AllValues(double[] buffer,
                        long offset,
                        long valueCount)
  {
    AllValues3d(nativeNdx
              ,buffer
              ,offset
              ,valueCount);
  }

  public void AllValues(double[] buffer,
                        int offset,
                        int valueCount)
  {
    AllValues3d(nativeNdx
              ,buffer
              ,(long) offset
              ,(long) valueCount);
  }

  public void SetValue(double[] valueArray)
  {
    SetValue4d(nativeNdx
             ,valueArray);
  }

  private native void Delete_RescueArrayFragmentDouble(long ndx);
  private native long ValueLength1d(long refNdx);
  private native double[] Value2d(long refNdx);
  private native void AllValues3d(long refNdx
                                ,double[] buffer
                                ,long offset
                                ,long valueCount);
  private native void SetValue4d(long refNdx
                               ,double[] valueArray);
}
