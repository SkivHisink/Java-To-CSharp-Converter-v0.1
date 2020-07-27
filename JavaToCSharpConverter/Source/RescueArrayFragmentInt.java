package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueArrayFragmentInt.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueArrayFragmentInt extends RescueArrayFragment
{


  protected RescueArrayFragmentInt(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueArrayFragmentInt(nativeNdx);
  }

  public int[] Value()
  {
    int[] myReturn = Value1(nativeNdx);
    return myReturn;
  }

  public long ValueLength64()
  {
    long myReturn = ValueLength2(nativeNdx);
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

  public void SetValue(int[] valueArray)
  {
    SetValue3(nativeNdx
             ,valueArray);
  }

  private native void Delete_RescueArrayFragmentInt(long ndx);
  private native int[] Value1(long refNdx);
  private native long ValueLength2(long refNdx);
  private native void SetValue3(long refNdx
                               ,int[] valueArray);
}
