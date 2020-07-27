using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RCH3DArray : RjniBaseClass
{


  protected RCH3DArray(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RCH3DArray(long maxI,
                    long maxJ,
                    long maxK,
                    float[] values)
  {
    nativeNdx = Create_RCH3DArray0(maxI,
                                   maxJ,
                                   maxK,
                                   values);
  }

  public RCH3DArray(int maxI,
                    int maxJ,
                    int maxK,
                    float[] values)
  {
    nativeNdx = Create_RCH3DArray0((long) maxI,
                                   (long) maxJ,
                                   (long) maxK,
                                   values);
  }

  public void Set(long i,
                  long j,
                  long k,
                  float value)
  {
    Set1(nativeNdx
        ,i
        ,j
        ,k
        ,value);
  }

  public void Set(int i,
                  int j,
                  int k,
                  float value)
  {
    Set1(nativeNdx
        ,(long) i
        ,(long) j
        ,(long) k
        ,value);
  }

  public float Value(long i,
                     long j,
                     long k)
  {
    float myReturn = Value2(nativeNdx
                           ,i
                           ,j
                           ,k);
    return myReturn;
  }

  public float Value(int i,
                     int j,
                     int k)
  {
    float myReturn = Value2(nativeNdx
                           ,(long) i
                           ,(long) j
                           ,(long) k);
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
    Delete_RCH3DArray(nativeNdx);
  }

}

}