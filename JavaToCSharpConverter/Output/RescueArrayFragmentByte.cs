using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueArrayFragmentByte : RescueArrayFragment
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

  public int ValueLength(bool throwIfTooBig) //thro RuntimeException
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

}

}