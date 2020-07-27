package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueArrayFragmentByte.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueArrayFragmentByte extends RescueArrayFragment
{


  protected RescueArrayFragmentByte(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueArrayFragmentByte(nativeNdx);
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

  public int ValueLength(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(ValueLength64(), throwIfTooBig);
  }

  public byte[] Value()
  {
    byte[] myReturn = Value2(nativeNdx);
    return myReturn;
  }

  public void SetValue(byte[] valueArray)
  {
    SetValue3(nativeNdx
             ,valueArray);
  }

  private native void Delete_RescueArrayFragmentByte(long ndx);
  private native long ValueLength1(long refNdx);
  private native byte[] Value2(long refNdx);
  private native void SetValue3(long refNdx
                               ,byte[] valueArray);
}
