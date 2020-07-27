using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueArrayFragmentFloat : RescueArrayFragment
{


  protected RescueArrayFragmentFloat(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueArrayFragmentFloat(nativeNdx);
  }

  public long ValueLength64()
  {
    long myReturn = ValueLength1(nativeNdx);
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

  public int ValueLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(ValueLength64(), throwIfTooBig);
  }

  public float[] Value()
  {
    float[] myReturn = Value2(nativeNdx);
    return myReturn;
  }

  public void AllValues(float[] buffer,
                        long offset,
                        long valueCount)
  {
    AllValues3(nativeNdx
              ,buffer
              ,offset
              ,valueCount);
  }

  public void AllValues(float[] buffer,
                        int offset,
                        int valueCount)
  {
    AllValues3(nativeNdx
              ,buffer
              ,(long) offset
              ,(long) valueCount);
  }

  public void SetValue(float[] valueArray)
  {
    SetValue4(nativeNdx
             ,valueArray);
  }

}

}