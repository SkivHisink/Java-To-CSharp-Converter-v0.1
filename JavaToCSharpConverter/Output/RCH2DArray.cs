using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RCH2DArray : RjniBaseClass
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

  public int ArrayLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(ArrayLength64(), throwIfTooBig);
  }

  public void dispose()
  {
    Delete_RCH2DArray(nativeNdx);
  }

}

}