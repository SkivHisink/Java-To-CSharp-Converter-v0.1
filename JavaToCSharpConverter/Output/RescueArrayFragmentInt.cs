using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueArrayFragmentInt : RescueArrayFragment
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

  public int ValueLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(ValueLength64(), throwIfTooBig);
  }

  public void SetValue(int[] valueArray)
  {
    SetValue3(nativeNdx
             ,valueArray);
  }

}

}