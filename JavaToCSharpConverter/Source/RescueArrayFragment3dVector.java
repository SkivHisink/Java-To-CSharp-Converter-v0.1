package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueArrayFragment3dVector.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueArrayFragment3dVector extends RescueArrayFragment
{


  protected RescueArrayFragment3dVector(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueArrayFragment3dVector(nativeNdx);
  }

  public Rescue3dVector[] Value()
  {
    Rescue3dVector[] myReturn = Value1(nativeNdx);
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

  public void SetValue(Rescue3dVector[] valueArray)
  {
    SetValue3(nativeNdx
             ,valueArray);
  }

  private native void Delete_RescueArrayFragment3dVector(long ndx);
  private native Rescue3dVector[] Value1(long refNdx);
  private native long ValueLength2(long refNdx);
  private native void SetValue3(long refNdx
                               ,Rescue3dVector[] valueArray);
}
