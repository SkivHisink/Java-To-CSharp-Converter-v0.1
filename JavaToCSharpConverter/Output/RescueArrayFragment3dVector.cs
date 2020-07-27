using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueArrayFragment3dVector : RescueArrayFragment
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

  public int ValueLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(ValueLength64(), throwIfTooBig);
  }

  public void SetValue(Rescue3dVector[] valueArray)
  {
    SetValue3(nativeNdx
             ,valueArray);
  }

}

}