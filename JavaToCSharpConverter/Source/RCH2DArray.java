package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RCH2DArray.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RCH2DArray extends RjniBaseClass
{


  protected RCH2DArray(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RCH2DArray(long maxI,
                    long maxJ,
                    float[] values)
  {
    nativeNdx = Create_RCH2DArray0(maxI,
                                   maxJ,
                                   values);
  }

  public RCH2DArray(int maxI,
                    int maxJ,
                    float[] values)
  {
    nativeNdx = Create_RCH2DArray0((long) maxI,
                                   (long) maxJ,
                                   values);
  }

  public void Set(long i,
                  long j,
                  float value)
  {
    Set1(nativeNdx
        ,i
        ,j
        ,value);
  }

  public void Set(int i, int j, float value)
  {
    Set1(nativeNdx, (long) i, (long) j, value);
  }

  public float Value(long i,
                     long j)
  {
    float myReturn = Value2(nativeNdx
                           ,i
                           ,j);
    return myReturn;
  }

  public float Value(int i, int j)
  {
    float myReturn = Value2(nativeNdx, (long) i, (long) j);
	return myReturn;
  }

  public float[] Array()
  {
    float[] myReturn = Array3(nativeNdx);
    return myReturn;
  }

  public long ArrayLength64()
  {
    long myReturn = ArrayLength4(nativeNdx);
    return myReturn;
  }

  public int ArrayLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(ArrayLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int ArrayLength(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(ArrayLength64(), throwIfTooBig);
  }

  public void dispose()
  {
    Delete_RCH2DArray(nativeNdx);
  }

  private native long Create_RCH2DArray0(long maxI,
                                        long maxJ,
                                        float[] values);
  private native void Set1(long refNdx
                          ,long i
                          ,long j
                          ,float value);
  private native float Value2(long refNdx
                             ,long i
                             ,long j);
  private native float[] Array3(long refNdx);
  private native long ArrayLength4(long refNdx);
  private native void Delete_RCH2DArray(long ndx);
}
